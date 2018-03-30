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

import tdt.edu.springboot.dao.HomeDao;
import tdt.edu.springboot.dao.StaffDao;
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
@RequestMapping("/HomeStaff")
public class StaffController {
	
	private static String msg="";
	private final static String PATH = "redirect:/TDTTesting";
	private final static String URL = "redirect:/HomeStaff";
	private final static String URL2 = "redirect:/HomeAdmin";
	private final static String ADMIN_PAGE = "home_admin";
	private final static String STAFF_PAGE = "home_staff";
	private final static String REMEMBER_PAGE = "redirect:/HomeMember";
	private final static String ADMIN_ROLE = "admin";
	private final static String STAFF_ROLE = "staff";
	private final static String REMEMBER_ROE = "member";
	private static StaffDao staffDao;
	private static Test test;
	private static Question question;
	private static List<Result> listScore;
	
	/*********************
  	 * Điều hướng tới trang nhân viên
  	 **********************/
   @RequestMapping("")
   public String page_Trangchu(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   session.setAttribute("msg", "");
	   staffDao = new StaffDaoImpl();
	   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
       return "home_staff";
   }
   
   
   /*********************
 	 * Điều hướng tới trang tạo đề
 	 **********************/
   @RequestMapping("/createTest")
   public String createTest(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   staffDao = new StaffDaoImpl();
	   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
	   //tạo model tạo đề
	   model.addAttribute("form_test", new TestForm());
	   model.addAttribute("listQuestion",staffDao.getListQuestion());
	   model.addAttribute("msg", msg);
       return "create_test";
   }
   
   
   /*********************
 	 * Điều hướng tới trang tạo câu hỏi
 	 **********************/
   @RequestMapping("/createQuestion")
   public String createQuestion(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   staffDao = new StaffDaoImpl();
	   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
	   // tạo model câu hỏi
	   model.addAttribute("form_question", new QuestionForm());
	   model.addAttribute("msg", msg);
       return "create_question";
   }
   
   /*********************
 	 * Điều hướng tới trang xem điểm
 	 **********************/
   @RequestMapping("/viewScore")
   public String listSroce(Model model,HttpServletRequest request,HttpSession session) throws Exception {
	   //Kiểm tra quyền
	   staffDao = new StaffDaoImpl();
	   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
		   return "redirect:/TDTTesting/login";
	   }
	   listScore = staffDao.getListScore();
	   if(listScore != null){
		   msg = "Chúc mừng bạn đã vượt qua bài thi, hãy tận hưởng bằng thành tích nào";
	   }else{
		   msg = "Chưa có thông tin điểm số hoặc bạn chưa từng thi";
	   }
	   model.addAttribute("listScore", listScore);
       return "list_score";
   }
   
   /*********************
 	 * Thoát khỏi hệ thống
 	 **********************/
   @RequestMapping("/logout")
   public String Logout(Model model,HttpServletRequest request,HttpSession session) {
	   // xóa session tài khoản
	   session.setAttribute("USER", null);
	   session.setAttribute("ROLE", null);
	 
       return "redirect:/TDTTesting";
   }
   
   
   /*********************
 	 * Nhận dữ liệu đề thi muốn tạo
 	 **********************/
   @RequestMapping(value = "/createTest", method = RequestMethod.POST)
   public ModelAndView ValatidateTest(HttpServletRequest request,HttpSession session,
		   @ModelAttribute TestForm testForm,Model model) {
	  
	 
	   test = new Test();
	   String url = getPage((String) session.getAttribute("ROLE"));
	   try {
		   //Kiểm tra quyền
		   staffDao = new StaffDaoImpl();
		   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
			   return new ModelAndView("redirect:/TDTTesting/login");
		   }
		   test = staffDao.convertTest(testForm);
		   System.out.println(test);
		   System.out.println(test.getQuestion());
		   if(staffDao.addTestQuestion(test)){
			   msg = "Tạo đề thi thành công";
			   url ="redirect:/HomeStaff/createTest";
		   }else{
			   msg = "Tạo đề thi thất bại";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   model.addAttribute("msg", msg);
     return new ModelAndView(url);
   }
   
   /*********************
 	 * Nhận dữ liệu câu hỏi muốn tạo
 	 **********************/
   @RequestMapping(value = "/createQuestion", method = RequestMethod.POST)
   public ModelAndView ValatidateQuestion(HttpServletRequest request,HttpSession session,
  		   @ModelAttribute QuestionForm questionForm,Model model) {
	   
	   test = new Test();
	   question = new Question();
	   String url = getPage((String) session.getAttribute("ROLE"));
	   try {
		   //Kiểm tra quyền
		   staffDao = new StaffDaoImpl();
		   if(!staffDao.checkRole((String) session.getAttribute("ROLE"))){
			   return new ModelAndView("redirect:/TDTTesting/login");
		   }
		   question = staffDao.convertQuestion(questionForm);
		   System.out.println(question);
		   System.out.println(question.getListAnswer());
		   if(staffDao.addQuestionAnswer(question)){
			   msg = "Tạo câu hỏi thành công";
			   url ="redirect:/HomeStaff/createQuestion";
		   }else{
			   msg = "Tạo câu hỏi thất bại";
		   }
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   model.addAttribute("msg", msg);
     return new ModelAndView(url);
  	   
      
   }
   
   //Phân quyền trang
   public static String getPage(String s){
	   if(s.equals(ADMIN_PAGE)){
		   return URL2;
	   }
	   return URL;
   }
}