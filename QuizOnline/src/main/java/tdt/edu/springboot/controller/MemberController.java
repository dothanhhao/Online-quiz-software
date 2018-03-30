package tdt.edu.springboot.controller;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;


import tdt.edu.springboot.dao.MemberDao;
import tdt.edu.springboot.dao.impl.MemberDaoImpl;
import tdt.edu.springboot.dao.impl.StaffDaoImpl;
import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;
import tdt.edu.springboot.model.TestForm;
import tdt.edu.springboot.model.TestingForm;


@Controller
@RequestMapping("/HomeMember")
public class MemberController {
	
	private static MemberDao memberDao;	
	private static String msg;
	private static Test test;
	private static String[] checkedIds;
	private static  Map<Integer, Set<Integer>> map ;
	private static  Set<Integer> set;
	private final static String PATH="redirect:/HomeMember";
	private static String url;
	private static List<Result> listScore;
	
	/*********************
  	 * Điều hướng
  	 **********************/
	  @RequestMapping("")
	   public String pageHome(Model model,HttpServletRequest request,HttpSession session) throws Exception {
		  //Kiểm tra quyền
		  memberDao = new MemberDaoImpl();
		   if(!memberDao.checkRole((String) session.getAttribute("ROLE"))){
			   return "redirect:/TDTTesting/login";
		   }
		   session.setAttribute("status", 0);
		   test = memberDao.getTest();
		   session.setAttribute("test", test);
		   session.setAttribute("idtest", test.getId());
	       return "home_member";
	   }
	
	  /*********************
	  	 * Điều hướng tới trang thi
	  	 **********************/
	 @RequestMapping("/test")
	   public String Test(Model model,HttpServletRequest request,HttpSession session) throws Exception {
		   //Kiểm tra quyền
		   memberDao = new MemberDaoImpl();
		   if(!memberDao.checkRole((String) session.getAttribute("ROLE"))){
			   return "redirect:/TDTTesting/login";
		   }
		   //Tạo model thi
		   test = (Test) session.getAttribute("test");
		   
		   
		   //Xử lý thời gian thi
		   if((int)session.getAttribute("status") == 0 || (int)session.getAttribute("status") == 2){
		        model.addAttribute("h", 0 );
		        model.addAttribute("m", test.getQuestionNumber());
		        model.addAttribute("s", 0);
		        
	    	}else{
	    		model.addAttribute("h", session.getAttribute("h") );
	 	        model.addAttribute("m", session.getAttribute("m"));
	 	        model.addAttribute("s", session.getAttribute("s"));
	    	}
		  
		   if(test != null){
			   model.addAttribute("listTest", test);
			   model.addAttribute("testForm", new TestingForm());
			   return "test";
		   }else{
			   msg = "Chưa có bất kỳ đề thi nào hoặc có sự cố ở đây, vui lòng liên hệ để được hỗ trợ";
			   model.addAttribute("Msg", msg);
			   return "test";
		   }
	       
	   }
	 
	 
	 /*********************
	  	 * Điều hướng tới trang xem điểm
	  	 **********************/
	 @RequestMapping("/score")
	   public String Score(Model model,HttpServletRequest request,HttpSession session) throws Exception {
		   //Kiểm tra quyền
		   memberDao = new MemberDaoImpl();
		   if(!memberDao.checkRole((String) session.getAttribute("ROLE"))){
			   return "redirect:/TDTTesting/login";
		   }
		   url = "list_score";
		   //Lấy danh sách kết quả
		   listScore = memberDao.getListScore((String) session.getAttribute("USER"));
		   if(listScore != null){
			   msg = "Chúc mừng bạn đã vượt qua bài thi, hãy tận hưởng bằng thành tích nào";
		   }else{
			   msg = "Chưa có thông tin điểm số hoặc bạn chưa từng thi";
		   }
		   model.addAttribute("listScore", listScore);
	       return url;
	   }
	 /*********************
	  	 * Nhận dữ liệu bài thi
	 * @throws Exception 
	  	 **********************/
	 @RequestMapping(value = "/test", method = RequestMethod.POST)
	   public ModelAndView ValatidateTest(HttpServletRequest request,HttpSession session,
			   @ModelAttribute TestingForm testForm,Model model) throws Exception {
		 //Kiểm tra quyền
		 System.out.println("check");
		 memberDao = new MemberDaoImpl();
		 test = memberDao.getTest();
		 
		 if(!memberDao.checkRole((String) session.getAttribute("ROLE"))){
			   return new ModelAndView("redirect:/TDTTesting/login");
		 }
		 
		 session.setAttribute("status", 2);
		 test = (Test) session.getAttribute("test");
		 url = PATH;
		
		 map = new HashMap<>();
		 for(int i=1; i<=test.getQuestionNumber();i++){
			 checkedIds = request.getParameterValues("answer"+i);
			 set = new HashSet<>();
			 if(checkedIds != null){
				for(String s: checkedIds){
					set.add(Integer.parseInt(s));
				}
				map.put(test.getQuestion().get(i-1).getId(), set);
			 }else{
				 set.add(-1);
				 map.put(test.getQuestion().get(i-1).getId(), set);
			 }
		 }
		try {
			System.out.println(memberDao.getScore(test, map));
			if(memberDao.insertResult((String) session.getAttribute("USER"), test.getId(), memberDao.getScore(test, map))){
				url=PATH+"/score";
			}else{
				msg = "lỗi, hệ thống đã gặp sự cố";
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "lỗi, hệ thống đã gặp sự cố";
		}
	     return new ModelAndView(url);
	   }
	 
	 /*********************
	  	 * Ajax xử lý thời gian
	  	 **********************/
	 @RequestMapping(value="test/load/{m}&&{s}", method = RequestMethod.GET)
	    @ResponseBody
	    public String demo3(@PathVariable("m") String m,@PathVariable("s") String s,Model model, HttpSession session, HttpServletRequest request) {
		
	       System.out.println("ok "+m+s);
	       if((int)session.getAttribute("status") == 2){
	    	   session.setAttribute("h", -1);
	    	   return "stop";
	       }else{
	    	   session.setAttribute("h", 0 );
	    	   session.setAttribute("status", 1);
	    	   session.setAttribute("m", m);
		        session.setAttribute("s", s);
	       }
	        return m;
	        
	    }
	 /*********************
	  	 * Thoát khỏi hệ thống
	  	 **********************/
	 @RequestMapping("/logout")
	   public String Logout(Model model,HttpServletRequest request,HttpSession session) {
		   session.setAttribute("USER", null);
		   session.setAttribute("ROLE", null);
		 
	       return "redirect:/TDTTesting";
	   }
	
}
