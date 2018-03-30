package tdt.edu.springboot.dao.impl;

import java.util.ArrayList;
import java.util.List;

import tdt.edu.springboot.dao.StaffDao;
import tdt.edu.springboot.jdbc.QuestionJdbc;
import tdt.edu.springboot.jdbc.ResultJdbc;
import tdt.edu.springboot.jdbc.TestJdbc;
import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.QuestionForm;
import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;
import tdt.edu.springboot.model.TestForm;

public class StaffDaoImpl implements StaffDao{

	private QuestionJdbc ques;
	private TestJdbc test;
	private ResultJdbc resultJdbc;
	private final static String ADMIN_ROLE = "admin";
	private final static String STAFF_ROLE = "staff";
	private final static String REMEMBER_ROE = "member";
	
	public StaffDaoImpl() throws Exception {
		ques = new QuestionJdbc();
		test = new TestJdbc();
	}
	
	@Override
	public boolean addQuestion(Question ques) {
		return this.ques.insertQuestion(ques.getName(), ques.getType(), ques.getAnswer_number(),
				ques.isStatus(), ques.getImage(), ques.getVideo());
	}

	@Override
	public boolean addAnswer(Answer ans) {
		
		return this.ques.insertAnswer(ans.getName(), ans.isCorrect(), ans.isStatus(), ans.getImage(),
				ans.getVideo(), ans.getId_question());
	}

	@Override
	public boolean addTest(Test test) {
		
		return this.test.insertTest(test.getName(), test.getLevelTest(), test.getQuestionNumber(),
				test.getImage(), test.isStatus());
	}

	@Override
	public boolean updateQuestion(Question ques) {
		return this.ques.updateQuestion(ques.getId(), ques.getName(), ques.getType(), ques.getAnswer_number(),
				ques.isStatus(), ques.getImage(), ques.getVideo());
	}

	@Override
	public boolean updateAnswer(Answer ans) {
		return this.ques.updateAnswer(ans.getId(), ans.getName(), ans.isCorrect(), ans.isStatus(),
				ans.getImage(), ans.getVideo(), ans.getId_question());
	}

	@Override
	public boolean updateTest(Test test) {
		return this.test.updateTest(test.getId(), test.getName(), test.getLevelTest(), test.getQuestionNumber(),
				test.getImage(), test.isStatus());
	}

	@Override
	public boolean deleteQuestion(Question ques) {
		return this.ques.deleteQuestion(ques.getId());
	}

	@Override
	public boolean deleteTest(Test test) {
		return this.test.deleteTest(test.getId());
	}

	@Override
	public List<Question> getListQuestion() throws Exception {
		return this.ques.selectQuestion();
	}

	@Override
	public Test convertTest(TestForm testForm) {
		
		Test t = new Test(testForm.getId(), testForm.getName(), testForm.getLevelTest(),
				testForm.getQuestionNumber(), testForm.getImage(), testForm.isStatus());
		List<Question> list = new ArrayList<Question>();
		testForm.setListQuestion();
		for(int i =0;i<testForm.getQuestionNumber();i++){
			list.add(testForm.getListQues().get(i));
		}
		t.setQuestion(list);
		return t;
	}
	
	@Override
	public Question convertQuestion(QuestionForm testForm) {
		
		Question q = new Question(testForm.getId(), testForm.getName(), testForm.getType(),
				testForm.getAnswer_number(), testForm.isStatus(), testForm.getImage(), testForm.getVideo());
		
		
		List<Answer> list = new ArrayList<Answer>();
		testForm.setListAnswer();
		for(int i =0;i<testForm.getAnswer_number();i++){
			list.add(testForm.getListAnswer().get(i));
		}
		q.setListAnswer(list);
		return q;
	}

	@Override
	public boolean addTestQuestion(Test test2) {
		return this.test.insertTest_Question(test2);
	}

	@Override
	public boolean addQuestionAnswer(Question question) {
		return this.ques.insertQuestion_Answer(question);
	}
	
	@Override
	public boolean checkRole(String x) {
		if(x != null && x.equals(ADMIN_ROLE)){
			return true;
		}
		if(x == null ||!x.equals(STAFF_ROLE)){
			return false;
		}
		return true;
	}
	@Override
	public List<Result> getListScore() throws Exception {
		resultJdbc = new ResultJdbc();
		List<Result> list = resultJdbc.selectResult();
		if(!list.isEmpty()){
			return list;
		}
		return null;
	}
}
