package tdt.edu.springboot.dao;

import tdt.edu.springboot.model.User;

public interface HomeDao {
	//kiểm đăng nhập
	boolean Login(User u)  throws Exception;
	//đăng ký
	boolean Register(User u)  throws Exception;
	//phân quyền
	String checkRole(String role, String pageAdmin, String pageStaff, String pageMember);
	//get,set
	String getUser();
	String getRole();
}
