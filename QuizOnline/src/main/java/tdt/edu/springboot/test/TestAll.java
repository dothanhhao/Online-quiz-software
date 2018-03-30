package tdt.edu.springboot.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;
import tdt.edu.springboot.dao.impl.AdminDaoImpl;
import tdt.edu.springboot.dao.impl.HomeDaoImpl;
import tdt.edu.springboot.dao.impl.MemberDaoImpl;
import tdt.edu.springboot.dao.impl.StaffDaoImpl;
import tdt.edu.springboot.jdbc.*;
import tdt.edu.springboot.model.*;

public class TestAll extends TestCase {

	private static ConfigSQL configSql;
	private static QuestionJdbc questionjdbc;
	private static ResultJdbc resultJdbc;
	private static SlideJdbc slideJdbc;
	private static Test_QuestionJdbc testQuestionJdbc;
	private static TestJdbc testJdbc;
	private static UserJdbc userJdbc;
	private static AdminDaoImpl adminDao;
	private static HomeDaoImpl homeDao;
	private static MemberDaoImpl memberDao;
	private static StaffDaoImpl staffDao;
	
	public TestAll(String name) {
		super(name);
	}
	
	@Test
	public void test() throws Exception{
		
		configSql = new ConfigSQL();
		questionjdbc = new QuestionJdbc();
		resultJdbc = new ResultJdbc();
		slideJdbc = new SlideJdbc();
		testQuestionJdbc = new Test_QuestionJdbc();
		testJdbc = new TestJdbc();
		userJdbc = new UserJdbc();
		
		adminDao = new AdminDaoImpl();
		homeDao = new HomeDaoImpl();
		memberDao = new MemberDaoImpl();
		staffDao = new StaffDaoImpl();
	}
	
	public void testUser() throws Exception{
		
		int size = userJdbc.selectUser().size();
		assertEquals(true 	, checkNumber(size));
		assertEquals(true, userJdbc.checkUser("hao", "123"));
		assertEquals(true, userJdbc.deleteUser("hao", true));
		assertEquals(true, userJdbc.deleteUser("hao", false));
		
	}
	
	public static boolean checkNumber(int x){
		if(x > 0){
			return true;
		}
		return false;
	}
	public void testExam() throws Exception{
		int size = testJdbc.selectTest().size();
		equals(size>0);
		tdt.edu.springboot.model.Test t = new tdt.edu.springboot.model.Test();
		t.setId(1);
		assertEquals(testJdbc.selectTest().get(0).getId(), testJdbc.selectTest(t).getId());
		assertEquals(true, testJdbc.insertTest("test090909", "easy", 5, null, false));
		assertEquals(true, testJdbc.insertResult("hao", 1, 80));
		
		
	}
	
	public void testExam_Question() throws Exception{
		int size = testQuestionJdbc.selectTest_QuestionJdbc(1).size();
		assertEquals(10, size);
		assertEquals(true, testQuestionJdbc.insertTest_QuestionJdbc(7, 11));
		
	}
	public void testSlideJdbc(){
		
	}
	
	public void testResultJdbc() throws Exception{
		int size = resultJdbc.selectResult("hao").size();
		assertEquals(true, checkNumber(size));
	}
	
	public void testConnectSQL(){
		
		assertEquals(true, configSql.isConnect());
		
	}
	
		
	public void testQuestionJdbc() throws Exception{
		
		
		//	SelectQuestion
		Question q =new Question();
		q.setId(1);
		q.setName("Ông chủ cửa hang đá quý bán cho khách một sợi dây chuyền bằng ngọc trai với giá 300 nghìn đồng và nhận từ khách một tờ 500 nghìn. Vì không có tiền lẻ nên ông sang tiệm kế bên đổi và dùng tiền đó để thối lại 200 nghìn cho khách. Hôm sau chủ quán bên phát hiện ra tiền đó là giả và đòi ông đổi lại tiền.Hỏi ông chủ tiệm đá quý đã mất bao nhiêu tiền?");
		assertEquals(q.getName(), questionjdbc.selectQuestion(1).getName());
		
		//	InsertQuestion
		assertEquals(true, questionjdbc.insertQuestion("Hello", "radio", 4, false, null, null));
		
		//	UpdateQuestion
		assertEquals(true, questionjdbc.updateQuestion(35, "Hi Truong", "radio", 3, false, null, null));
		
		//	DeleteQuestion
		assertEquals(true, questionjdbc.deleteQuestion(35));
		
		//	Add Question and answer
		q = new Question();
		q.setName("how??");
		q.setAnswer_number(3);
		q.setType("radio");
		Answer an = null;
		List<Answer> listAn = new ArrayList<Answer>();
		for(int i =0; i< 3; i++){
			an = new Answer();
			an.setName("ok"+i);
			listAn.add(an);
		}
		q.setListAnswer(listAn);
		assertEquals(true, questionjdbc.insertQuestion_Answer(q));
		

	
	}
	

	public void testAnswerJdbc(){
		
		//	update answer
		assertEquals(true, questionjdbc.updateAnswer(1, "500 nghìn", true, false, null, null, 1));
		
		//	insert answer
		assertEquals(true, questionjdbc.insertAnswer("200 nghin", false, false, null, null, 1));
		
	}
	


	
	public void testHomeDao() throws Exception{
		User u = new User("hao", "123", "member");
		assertEquals(true, homeDao.Login(u));
		u.setUsername("hao123");
		assertEquals(true, homeDao.Register(u));
		
	}
	
	public void testMemberDao() throws Exception{
		int size = memberDao.getTest().getQuestionNumber();
		assertEquals(true, checkNumber(size));
		assertEquals(true, memberDao.checkRole("member"));
		
	}
	
	public void testStaffDao() throws Exception{
		
	}
	
	
	
}
