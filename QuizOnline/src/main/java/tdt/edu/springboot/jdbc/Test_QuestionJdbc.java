package tdt.edu.springboot.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.Test_Question;

public class Test_QuestionJdbc {
	private static Test_Question test_question;
	
	
	
	public Test_QuestionJdbc() throws Exception {
		super();
		ConfigSQL.connect();
	}
	
	public static List<Question> selectTest_QuestionJdbc(int idTest) throws Exception{
		
		List<Question> listQues = new ArrayList<Question>();
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Question] Where id in "
				+ " ( select id_question from [Test_Question] where id_test = " + idTest + ")");
		while(kq.next()){
			listQues.add(new Question(kq.getInt(1),kq.getString(2), kq.getString(3), kq.getInt(4), kq.getBoolean(5), kq.getString(6), kq.getString(7)));
		}
		return listQues;
	}

	public static boolean insertTest_QuestionJdbc( int idTest, int idQuestion){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Test_Question] ([id_test],[id_question]) VALUES"+
									"("+ idTest + "," + idQuestion + ")");
		}catch (Exception e) {
			System.err.println("loi");
			return false;
		}				
		return true;
	}
}
