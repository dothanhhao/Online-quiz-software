package tdt.edu.springboot.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.Test;

public class TestJdbc {
	private static QuestionJdbc questionJdbc;
	private static List<Test> listTest;
	private static List<Question> listQuestion;
	private static List<Answer> listAnswer;
	
	public TestJdbc() throws Exception {
		super();
		ConfigSQL.connect();
	}
	
	public static List<Test> selectTest() throws Exception{
		
		List<Test> listTest = new ArrayList<Test>();
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Test]");
		while(kq.next()){
			listTest.add( new Test(kq.getInt(1), kq.getString(2), kq.getString(3), kq.getInt(4), kq.getString(5),kq.getBoolean(6)));
		}
		return listTest;
	}
	
	public static Test selectTest(Test test) throws Exception{
		
		questionJdbc = new QuestionJdbc();
		ResultSet kq = ConfigSQL.chonDuLieu("select id_question from [Test_Question] where [id_test] = "+test.getId());
		Question question;
		listQuestion = new ArrayList<Question>();
		listAnswer = new ArrayList<Answer>();
		while(kq.next()){
			question = questionJdbc.selectQuestion(kq.getInt(1));
			listAnswer = questionJdbc.selectAnswer(question.getId());
			question.setListAnswer(listAnswer);
			listQuestion.add(question);
		}
		test.setQuestion(listQuestion);
		return test;
	}

	public static boolean insertTest( String name, String levelTest, int question_number, String image, boolean status){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Test] ([name],[level_test],[question_number],[image],[status]) VALUES"+
									"("+ ConfigSQL.preProcessData(name)+ ","+ ConfigSQL.preProcessData(levelTest)+ "," + question_number + "," 
									+ ConfigSQL.preProcessData(image) + ","+ ConfigSQL.preProcessBit(status) + ")");
		}catch (Exception e) {
			System.err.println("loi");
			return false;
		}				
		return true;
	}
	
	public static boolean insertResult( String username, int id_test, int score){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Result] ([username],[id_test],[score]) VALUES"+
									"("+ ConfigSQL.preProcessData(username)+ ","+ id_test+ "," + score  + ")");
		}catch (Exception e) {
			System.err.println("loi");
			return false;
		}				
		return true;
	}
	
	public static boolean updateTest( int id, String name, String levelTest, int question_number, String image, boolean status){
		try{
			ConfigSQL.thucThiSQL("UPDATE TABLE [Test] SET "
					+ "([name] = " +ConfigSQL.preProcessData(name) +
					",[level_test] = " + ConfigSQL.preProcessData(levelTest) + 
					",[question_number] = " + question_number +
					",[image] = " + ConfigSQL.preProcessData(image) +
					",[status] = " + ConfigSQL.preProcessBit(status) + ") "
							+ "WHERE " + "id = " + id);
		}catch (Exception e) {
			System.err.println("loi");
			return false;
		}				
				
		return true;
	}
	
	public static boolean deleteTest(int id) {
		try {
			ConfigSQL.thucThiSQL("UPDATE TABLE [Test] SET "
					+ "([status] = " + ConfigSQL.preProcessBit(true)  + " )" + " WHERE id = " + id);
		}catch(Exception e) {
			System.err.println(e);
			return false;
		}
		return true;
	}
	
	public static boolean insertTest_Question(Test test){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Test] ([name],[level_test],[question_number],[image],[status]) VALUES"+
									"("+ ConfigSQL.preProcessData(test.getName())+ ","+ ConfigSQL.preProcessData(test.getLevelTest())+ "," + test.getQuestionNumber() + "," 
									+ ConfigSQL.preProcessData(test.getImage()) + ","+ ConfigSQL.preProcessBit(test.isStatus()) + ")");
			
			
			ResultSet kq = ConfigSQL.chonDuLieu("select id from [Test] Where "
					+ "([name] = " +ConfigSQL.preProcessData(test.getName()) +
					" and [level_test] = " + ConfigSQL.preProcessData(test.getLevelTest()) + 
					" and [question_number] = " + test.getQuestionNumber() + ")");
			
			int tmpID = -1;
			while(kq.next()){
				tmpID = kq.getInt(1);
			}
			
			if(tmpID != -1) {
				Test_QuestionJdbc test_quest = new Test_QuestionJdbc();
				for(int i = 0 ; i < test.getQuestion().size(); i++) {
					test_quest.insertTest_QuestionJdbc(tmpID, test.getQuestion().get(i).getId());
				}
			}
		
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
		return true;
	}
}
