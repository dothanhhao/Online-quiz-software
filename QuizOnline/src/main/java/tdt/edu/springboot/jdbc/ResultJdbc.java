package tdt.edu.springboot.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;

public class ResultJdbc {
	
	public ResultJdbc() throws Exception {
		super();
		ConfigSQL.connect();
	}
	public static List<Result> selectResult(String username) throws Exception{
			
			List<Result> listTest = new ArrayList<Result>();
			
			ResultSet kq = ConfigSQL.chonDuLieu("select * from [Result] where [username] = "+ConfigSQL.preProcessData(username));
			while(kq.next()){
				listTest.add( new Result(kq.getInt(1), kq.getString(2), kq.getInt(3), kq.getInt(4), kq.getBoolean(5)));
			}
			return listTest;
		}
	
	public static List<Result> selectResult() throws Exception{
		
		List<Result> listTest = new ArrayList<Result>();
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Result]");
		while(kq.next()){
			listTest.add( new Result(kq.getInt(1), kq.getString(2), kq.getInt(3), kq.getInt(4), kq.getBoolean(5)));
		}
		return listTest;
	}

}


