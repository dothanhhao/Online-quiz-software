package tdt.edu.springboot.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import tdt.edu.springboot.dao.MemberDao;
import tdt.edu.springboot.jdbc.ResultJdbc;
import tdt.edu.springboot.jdbc.TestJdbc;
import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;

public class MemberDaoImpl implements MemberDao{
	
	private static TestJdbc testJdbc;
	private	static ResultJdbc resultJdbc;
	private final static String ADMIN_ROLE = "admin";
	private final static String STAFF_ROLE = "staff";
	private final static String REMEMBER_ROE = "member";
	private static Random rand;
	private static List<Test> list;
	private static Test test;
	@Override
	public Test getTest() throws Exception {
		testJdbc = new TestJdbc();
		rand = new Random();
		list = testJdbc.selectTest();
		if(!list.isEmpty()){
			test = list.get(rand.nextInt(list.size()));
			test = testJdbc.selectTest(test);
			return test;
		}
		return null;
	}

	@Override
	public boolean checkRole(String x) {
		if(x == null ||!x.equals(REMEMBER_ROE)){
			return false;
		}
		return true;
	}

	@Override
	public int getScore(Test test, Map<Integer, Set<Integer>> map) {
		int score = 0 ;
		int scoreQuestion =100 / test.getQuestionNumber();
		boolean kq = true;
		for(Question q : test.getQuestion()){
			kq =true;
			for(Answer a : q.getListAnswer()){
				if(a.isCorrect()){
					if(!map.get(q.getId()).contains(a.getId())){
						kq = false;
						break;
					}
				}
			}
			if(kq == true){
				score += scoreQuestion;
			}
		}
		
		return score;
	}

	@Override
	public boolean insertResult(String username, int id_test, int score) throws Exception {
		testJdbc = new TestJdbc();
		return testJdbc.insertResult(username, id_test, score);
	}

	@Override
	public List<Result> getListScore(String username) throws Exception {
		resultJdbc = new ResultJdbc();
		List<Result> list = resultJdbc.selectResult(username);
		if(!list.isEmpty()){
			return list;
		}
		return null;
	}

}
