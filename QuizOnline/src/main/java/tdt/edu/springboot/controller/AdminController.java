package tdt.edu.springboot.controller;




import java.util.Arrays;
import java.util.List;

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

import tdt.edu.springboot.dao.AdminDao;
import tdt.edu.springboot.dao.HomeDao;
import tdt.edu.springboot.dao.StaffDao;
import tdt.edu.springboot.dao.impl.AdminDaoImpl;
import tdt.edu.springboot.dao.impl.HomeDaoImpl;
import tdt.edu.springboot.dao.impl.StaffDaoImpl;
import tdt.edu.springboot.jdbc.ConfigSQL;
import tdt.edu.springboot.jdbc.UserJdbc;
import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.QuestionForm;
import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;
import tdt.edu.springboot.model.TestForm;
import tdt.edu.springboot.model.User;




 
@Controller
@RequestMapping("/HomeAdmin")
public class AdminController {
	
	private static String msg="";
	private final static String PATH = "redirect:/TDTTesting";
	private final static String URL = "redirect:/HomeAdmin";
	private final static String ADMIN_PAGE = "home_admin";
	private final static String STAFF_PAGE = "home_staff";
	private final static String REMEMBER_PAGE = "redirect:/HomeMember";
	private static AdminDao adminDao;
	private static StaffDao staffDao;
	private static Test test;
	private static Question question;
	private static List<Result> listScore;
	
	
	/*********************
	 * Điều hướng sang trang admin
	 **********************/
   @RequestMapping("")
   public String page_Trangchu(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   adminDao = new AdminDaoImpl();
	   if(!adminDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
       return "home_admin";
   }
   
   
   /*********************
	 * Điều hướng trang tạo tài khoản
	 **********************/
   @RequestMapping("/createAccount")
   public String createTest(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   adminDao = new AdminDaoImpl();
	   if(!adminDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
	   
	   model.addAttribute("form_account", new User());
	   model.addAttribute("listAccount", adminDao.getAccount());
	  
       return "create_account";
   }
   
   
   /*********************
	 * Điều hướng tới trang xem danh sách tài khoản
	 **********************/
   @RequestMapping("/listAccount")
   public String getAccount(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   adminDao = new AdminDaoImpl();
	   if(!adminDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
	   
	   model.addAttribute("form_account", new User());
	   model.addAttribute("listAccount", adminDao.getAccount());
	  
       return "account";
   }
   
   
   /*********************
	 * Nhận dữ liệu tài khoản muốn tạo
	 **********************/
   @RequestMapping(value = "/createAccount", method = RequestMethod.POST)
   public ModelAndView ValatidateAccount(HttpServletRequest request,HttpSession session,
		   @ModelAttribute User user,Model model) {
	   //Gán địa chỉ mặc định của trang admin
	   String url = URL;
	   try {
		 //Kiểm tra quyền
		   adminDao = new AdminDaoImpl();
		   if(!adminDao.checkRole((String) session.getAttribute("ROLE"))){
			   return new ModelAndView("redirect:/TDTTesting/login");
		   }
		 //Kiểm tra thêm tài khoản
		   if(adminDao.addAccount(user)){
			   msg = "Tạo thành công";
			   url ="redirect:/HomeAdmin/createAccount";
		   }else{
			   msg = "Tạo thất bại";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   model.addAttribute("msg", msg);
     return new ModelAndView(url);
   }
   
   
   /*********************
	 * Nhận dữ liệu tài khoản muốn xóa và lưu lên database
	 **********************/
   @RequestMapping(value = "/deleteAccount", method = RequestMethod.POST)
   public ModelAndView ValatidateTest(HttpServletRequest request,HttpSession session,
		   @ModelAttribute User user,Model model) {
	   user.setStatus(true);
	 //Gán địa chỉ mặc định của trang admin
	   String url = URL;
	   try {
		   //Kiểm tra quyền
		   adminDao = new AdminDaoImpl();
		   if(!adminDao.checkRole((String) session.getAttribute("ROLE"))){
			   return new ModelAndView("redirect:/TDTTesting/login");
		   }
		   //Kiểm tra xóa tài khoản
		   if(adminDao.deleteAccount(user)){
			   msg = "Xóa thành công";
			   System.out.println("xoa");
			   url ="redirect:/HomeAdmin/createAccount";
		   }else{
			   msg = "Xóa thất bại";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   model.addAttribute("msg", msg);
     return new ModelAndView(url);
   }
   
   /*********************
  	 * Đăng xuất khỏi hệ thống
  	 **********************/
   @RequestMapping("/logout")
   public String Logout(Model model,HttpServletRequest request,HttpSession session) {
	   // xóa session tài khoản
	   session.setAttribute("USER", null);
	   session.setAttribute("ROLE", null);
	 
       return "redirect:/TDTTesting";
   }
   

}