package tdt.edu.springboot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConfigSQL {

	/*********************
	 * Config SQL
	 **********************/
	public final static String sqlDB = "jdbc:sqlserver://localhost:1433;databaseName=SoftwaveProject";
	public static String user="sa";
	public static String pass="sa";
	public static Connection connect;

	public ConfigSQL() throws Exception {
		connect();
		
	}
	
	

	/*********************
	 * Kết nối đến database
	 **********************/
	public static Connection connect() throws Exception {
		System.out.println("check conect");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect = DriverManager.getConnection(sqlDB,user,pass);
			System.out.println("connect success");
			return connect;
		} catch (Exception e) {
			System.out.println("connect fail/n " + e.getMessage());
		}
		return null;
	}
	
	public static boolean isConnect(){
		try {
			connect();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	

	/*********************
	 * Đóng kết nối
	 **********************/
	public static void CloseConnection() throws Exception{
		try {
			connect.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	/*********************
	 * Thực thi câu lệnh sql,insert,update,delete
	 **********************/
	public static void thucThiSQL(String sql) throws Exception {
		connect();
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}
	

	/*********************
	 * Thực thi câu lệnh sql, select
	 **********************/
	public static ResultSet chonDuLieu(String sql) throws Exception {
		connect();
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(sql);	
		return rs;
	}

	public static PreparedStatement dungStament(String sql) throws SQLException, Exception {
		return connect().prepareStatement(sql);
	}
	
	

	/*********************
	 * Xử lý dữ liệu
	 **********************/
	
	public static String preProcessData(String x){
		if(x == null){
			return null;
		}
		else if(x.indexOf("||") != -1){
			return null;
		}
		return "N'"+x+"'";

	}
	
	public static int preProcessBit(Boolean x){
		if(x == true){
			return 1;
		}
		return 0;
	}
}
