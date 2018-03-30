package tdt.edu.springboot.dao;

import java.util.List;

import tdt.edu.springboot.model.User;

public interface AdminDao {
	
	//thêm tài khoản
	public boolean addAccount(User user);
	//lấy tài khoản
	public List<User> getAccount() throws Exception;
	//chỉnh sửa tài khoản
	public boolean updateAccount(User user);
	//xóa tài khoản
	public boolean deleteAccount(User user);
	//kiểm tra phân quyền
	public boolean checkRole(String x);
}
