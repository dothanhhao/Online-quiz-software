package tdt.edu.springboot.jdbc;

import java.sql.ResultSet;
import java.util.*;

import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;


public class QuestionJdbc {
	
	private static Question question;
	private static Answer answer;
	
	
	public QuestionJdbc(){
		super();
		try {
			ConfigSQL.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Question> selectQuestion() throws Exception{
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Question]");
		List<Question> list = new ArrayList<Question>();
		while(kq.next()){
			question = new Question(kq.getInt(1),kq.getString(2), kq.getString(3), kq.getInt(4), kq.getBoolean(5), kq.getString(6), kq.getString(7));
			list.add(question);
		}
		return list;
	}
	
	public static Question selectQuestion(int id) throws Exception{
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Question] where [id] = "+id);
	
		while(kq.next()){
			question = new Question(kq.getInt(1),kq.getString(2), kq.getString(3), kq.getInt(4), kq.getBoolean(5), kq.getString(6), kq.getString(7));
			
		}
		return question;
	}

	public static boolean insertQuestion( String name, String type, int answer_number, boolean status, String image, String video){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Question] ([name],[type],[answer_number],[status],[image],[video]) VALUES"+
									"("+ ConfigSQL.preProcessData(name)+ ","+ ConfigSQL.preProcessData(type)+ "," + answer_number + "," 
									+ ConfigSQL.preProcessBit(status) + ","+ ConfigSQL.preProcessData(image)+ ","
									+ ConfigSQL.preProcessData(video) + ")");
	
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
		return true;
	}
	
	public static boolean updateQuestion( int id, String name, String type, int answer_number, boolean status, String image, String video){
		try{
			ConfigSQL.thucThiSQL("UPDATE  [Question] SET "
					+ "[name] = " +ConfigSQL.preProcessData(name) +
					",[type] = " + ConfigSQL.preProcessData(type) + 
					",[answer_number] = " + answer_number +
					",[status] = " + ConfigSQL.preProcessBit(status) +
					",[image] = " + ConfigSQL.preProcessData(image) + 
					",[video] = " +  ConfigSQL.preProcessData(video) + 
							" WHERE " + "id = " + id);
		 
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
				
		return true;
	}
	
	public static boolean deleteQuestion(int id) {
		try {
			ConfigSQL.thucThiSQL("UPDATE  [Question] SET "
					+ "[status] = " + ConfigSQL.preProcessBit(true)  + "WHERE id = " + id);
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	
	public static List<Answer> selectAnswer(int id_question) throws Exception{
		
		List<Answer> listAnswer = new ArrayList<Answer>();
		
		ResultSet kq = ConfigSQL.chonDuLieu("select * from [Answer] where [id_question] = " + id_question);
		while(kq.next()){
			listAnswer.add(new Answer(kq.getInt(1), kq.getString(2), kq.getBoolean(3), kq.getBoolean(4), kq.getString(5), kq.getString(6),kq.getInt(7)));
		}
		return listAnswer;
	}
	
	public static boolean insertAnswer( String name, boolean correct, boolean status, String image, String video, int id_question){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Answer] ([name],[correct],[status],[image],[video],[id_question]) VALUES"+
									"("+ ConfigSQL.preProcessData(name)+ ","+ ConfigSQL.preProcessBit(correct)+ "," 
									 + ConfigSQL.preProcessBit(status) + ","+ ConfigSQL.preProcessData(image)+ ","
									+ ConfigSQL.preProcessData(video) + ","+ id_question + ")");
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
		return true;
	}
	
	public static boolean updateAnswer( int id, String name, boolean correct, boolean status, String image, String video,int id_question){
		try{
			ConfigSQL.thucThiSQL("UPDATE  [Answer] SET "
					+ "[name] = " +ConfigSQL.preProcessData(name) +
					",[correct] = " + ConfigSQL.preProcessBit(correct) + 
					",[status] = " + ConfigSQL.preProcessBit(status) +
					",[image] = " + ConfigSQL.preProcessData(image) + 
					",[video] = " +  ConfigSQL.preProcessData(video) + 
					",[id_question] = "  + id_question +
							" WHERE " + "id = " + id);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
				
		return true;
	}
	
	public static boolean insertQuestion_Answer(Question ques){
		try{
			ConfigSQL.thucThiSQL("INSERT INTO [Question] ([name],[type],[answer_number],[status],[image],[video]) VALUES"+
									"("+ ConfigSQL.preProcessData(ques.getName())+ ","+ ConfigSQL.preProcessData(ques.getType())+ "," + ques.getAnswer_number() + "," 
									+ ConfigSQL.preProcessBit(ques.isStatus()) + ","+ ConfigSQL.preProcessData(ques.getImage())+ ","
									+ ConfigSQL.preProcessData(ques.getVideo()) + ")");
			
			System.out.println("ok1");
			System.out.println(ques);
			
			ResultSet kq = ConfigSQL.chonDuLieu("select id from [Question] Where "
					+ "( [name] = " +ConfigSQL.preProcessData(ques.getName()) +
					" and [type] = " + ConfigSQL.preProcessData(ques.getType()) + 
					" and [answer_number] = " + ques.getAnswer_number() +" )");
			System.out.println("ok2");
			
			int tmpID = -1;
			
			while(kq.next()){
				tmpID = kq.getInt(1);
			}
			System.out.println("ok3");
			if(tmpID != -1) {
				Answer tmpAnswer;
				for(int i = 0; i < ques.getListAnswer().size(); i++) {
					tmpAnswer = ques.getListAnswer().get(i);
					insertAnswer(tmpAnswer.getName(),tmpAnswer.isCorrect(),tmpAnswer.isStatus(),
							tmpAnswer.getImage(),tmpAnswer.getVideo(),tmpID);
				}
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}				
		return true;
	}

}
