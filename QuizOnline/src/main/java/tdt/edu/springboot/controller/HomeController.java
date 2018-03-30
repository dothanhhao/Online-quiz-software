package tdt.edu.springboot.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;

import tdt.edu.springboot.dao.HomeDao;
import tdt.edu.springboot.dao.impl.HomeDaoImpl;
import tdt.edu.springboot.jdbc.ConfigSQL;
import tdt.edu.springboot.jdbc.UserJdbc;
import tdt.edu.springboot.model.User;

 
@Controller
@RequestMapping("/TDTTesting")
public class HomeController {
	
	private static String msg="";
	private final static String PATH = "redirect:/TDTTesting";
	private final static String URL = "home";
	private final static String ADMIN_PAGE = "redirect:/HomeAdmin";
	private final static String STAFF_PAGE = "redirect:/HomeStaff";
	private final static String REMEMBER_PAGE = "redirect:/HomeMember";
	private static HomeDao homeDao = new HomeDaoImpl();
	
	
	/*********************
  	 * Điều hướng tới trang chủ
  	 **********************/
   @RequestMapping("")
   public String page_Trangchu(Model model) throws Exception {
       return "home";
   }
   
  
   /*********************
 	 * Điều hướng tới trang login
 	 **********************/
   @RequestMapping("/login")
   public String page_Trangchu2(Model model) {
	   // tạo model form
	   model.addAttribute("msg", msg);
	   model.addAttribute("form_login", new User());
	   model.addAttribute("form_register", new User());
       return "login";
   }
   
   
   /*********************
 	 * Nhận tài khoản và kiểm tra, phân quyền
 	 **********************/
   @RequestMapping(value = "/login", method = RequestMethod.POST)
   public ModelAndView Valatidate(HttpServletRequest request,HttpSession session,
		   @ModelAttribute User user,Model model) {
	   homeDao = new HomeDaoImpl();
	   String url = PATH;
	   try {
		   //Kiểm tra tài khoản
		   if(homeDao.Login(user)){
			  String role = homeDao.getRole();
			  System.out.println(homeDao.getUser() + homeDao.getRole());
			  //Phân quyền
			  url = homeDao.checkRole(role, ADMIN_PAGE, STAFF_PAGE, REMEMBER_PAGE);
			  session.setAttribute("USER", homeDao.getUser());
			  session.setAttribute("ROLE", homeDao.getRole());
		   }else{
			   msg = "Tài khoản của bạn không đúng hoặc nó không tồn tại, vui lòng nhập lại!";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   
	   
       return new ModelAndView(url);
   }
   
   
   /*********************
 	 * Nhận tài khoản muốn đăng ký
 	 **********************/
 ///Validate register Account
   @RequestMapping(value = "/register", method = RequestMethod.POST)
   public ModelAndView validateRegister(HttpServletRequest request,HttpSession session,
		   @ModelAttribute User user,Model model) {
	   homeDao = new HomeDaoImpl();
	   String url = URL;
	  System.out.println(user.getPassword());
	   try {
		   //Kiểm tra tài khoản
		   if(homeDao.Register(user)){
			   msg = "Chúc mừng "+user.getName()+" tạo tài khoản thành công";
		   }else{
			   msg = "Tài khoản đã tồn tại, vui lòng nhập tài khoản khác lại!";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   
	   
       return new ModelAndView(PATH+"/login");
   }
   
   
}