package tdt.edu.springboot.dao.impl;

import tdt.edu.springboot.dao.HomeDao;
import tdt.edu.springboot.jdbc.UserJdbc;
import tdt.edu.springboot.model.User;

public class HomeDaoImpl implements HomeDao{
	private static UserJdbc userJdbc;
	private final static String ADMIN_ROLE = "admin";
	private final static String STAFF_ROLE = "staff";
	private final static String REMEMBER_ROE = "member";
	
	@Override
	public boolean Login(User u) throws Exception {
		userJdbc = new UserJdbc();
		return userJdbc.checkUser(u.getUsername(), u.getPassword());
	}

	@Override
	public boolean Register(User u) throws Exception {
		u.setRole(REMEMBER_ROE);
		
		// TODO Auto-generated method stub
		return userJdbc.insertUser(u.getUsername(), u.getPassword(), u.getName(), u.getAge(), u.getAddress(), u.getStatus(), u.getRole());
	}

	@Override
	public String getUser() {
		
		return userJdbc.getUSER();
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return userJdbc.getROLE();
	}

	@Override
	public String checkRole(String role , String pageAdmin, String pageStaff, String pageMember) {
		   if(role.equals(ADMIN_ROLE)){
			   return pageAdmin;
		   }else if(role.equals(STAFF_ROLE)){
			   return pageStaff;
		   }
		   return pageMember;
	}

}
