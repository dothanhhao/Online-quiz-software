package tdt.edu.springboot.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tdt.edu.springboot.model.User;

public class UserJdbc{
	private static User user;
	private static String USER;
	private static String ROLE;
	
	public UserJdbc()  {
		super();
		
		try {
			ConfigSQL.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static User selectUser(String username , String password) throws Exception{
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [User] where username = "+ConfigSQL.preProcessData(username)+" and "+"password = "+ConfigSQL.preProcessData(password));
		user = null;
		while(kq.next()){
			user = new User(kq.getString(1), kq.getString(2), kq.getString(3), kq.getInt(4), kq.getString(5), kq.getBoolean(6),kq.getString(7));
		}
		if(user.getStatus()){
			user = null;
		}
		setUSER(user.getUsername());
		setROLE(user.getRole());
		return user;
	}
	
	public static List<User> selectUser() throws Exception{
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [User]");
		user = null;
		ArrayList<User> list = new ArrayList<User>();
		while(kq.next()){
			user = new User(kq.getString(1), kq.getString(2), kq.getString(3), kq.getInt(4), kq.getString(5), kq.getBoolean(6),kq.getString(7));
			list.add(user);
		}
		return list;
	}
	
	public static boolean checkUser(String username , String password) throws Exception{
		if(selectUser(username , password) == null){
			return false;
		}
		return true;
	}
	
	public static boolean insertUser( String username, String password, String name, int age, String address, 
			Boolean status, String role){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [User] ([username],[password],[name],[age],[address],[status],[role]) VALUES"+
									"("+ ConfigSQL.preProcessData(username)+ ","+ ConfigSQL.preProcessData(password)+ 
									","+ ConfigSQL.preProcessData(name)+ ","+ age+ ","+ ConfigSQL.preProcessData(address)+
									","+ ConfigSQL.preProcessBit(status)+ ","+ ConfigSQL.preProcessData(role)+ ")");
		}catch (Exception e) {
			System.err.println(e);
			return false;
		}				
				
		return true;
	}
	/**
	 * Update user
	 * */
	public static boolean updateUser(String username, String password, String name, int age, String address, 
			Boolean status, String role){
		System.out.println(username + status);
		try{
			ConfigSQL.thucThiSQL("UPDATE  [User] SET "
					+"[password] = "+ConfigSQL.preProcessData(password)+
					",[name] = "+ConfigSQL.preProcessData(name)+
					",[age] = "+age+
					",[address] = "+ConfigSQL.preProcessData(address)+
					",[status] = "+ConfigSQL.preProcessBit(status)+
					",[role] = "+ConfigSQL.preProcessData(role)+
					" where username ="+ConfigSQL.preProcessData(username)
					);
		 
		}catch (Exception e) {
			System.err.println("loi");
			System.out.println(e.getMessage());
			return false;
		}				
				
		return true;
	}
	
	public static boolean deleteUser(String username ,Boolean status){
		System.out.println(username + status);
		try{
			ConfigSQL.thucThiSQL("UPDATE  [User] SET "
					+"[status] = "+ConfigSQL.preProcessBit(status)+
					" where username ="+ConfigSQL.preProcessData(username)
					);
		 
		}catch (Exception e) {
			System.err.println("loi");
			System.out.println(e.getMessage());
			return false;
		}				
				
		return true;
	}

	public static String getUSER() {
		return USER;
	}

	public static void setUSER(String uSER) {
		USER = uSER;
	}

	public static String getROLE() {
		return ROLE;
	}

	public static void setROLE(String rOLE) {
		ROLE = rOLE;
	}
	
	
}
