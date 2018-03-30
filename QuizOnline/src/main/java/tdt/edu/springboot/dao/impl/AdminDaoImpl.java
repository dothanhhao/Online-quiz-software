package tdt.edu.springboot.dao.impl;

import java.util.List;

import tdt.edu.springboot.dao.AdminDao;
import tdt.edu.springboot.jdbc.UserJdbc;
import tdt.edu.springboot.model.User;

public class AdminDaoImpl implements AdminDao{
	
	private UserJdbc user;
	private final static String ADMIN_ROLE = "admin";
	private final static String STAFF_ROLE = "staff";
	private final static String REMEMBER_ROE = "member";
	
	public AdminDaoImpl() {
		user = new UserJdbc();
	}
	
	@Override
	public boolean addAccount(User user) {
		return this.user.insertUser(user.getUsername(), user.getPassword(), user.getName(), user.getAge(),
				user.getAddress(), user.getStatus(), user.getRole());
	}

	@Override
	public boolean updateAccount(User user) {
		return this.user.updateUser(user.getUsername(), user.getPassword(), user.getName(), user.getAge(),
				user.getAddress(), user.getStatus(), user.getRole());
	}
	
	@Override
	public boolean deleteAccount(User user) {
		return this.user.deleteUser(user.getUsername(), user.getStatus());
	}
	
	@Override
	public boolean checkRole(String x) {
		if(x == null ||!x.equals(ADMIN_ROLE)){
			return false;
		}
		return true;
	}

	@Override
	public List<User> getAccount() throws Exception {
		// TODO Auto-generated method stub
		return user.selectUser();
	}

}
