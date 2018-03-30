package tdt.edu.springboot.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;

public interface MemberDao {
	//lấy đề thi
	public Test getTest() throws Exception;
	//kiểm tra quyền
	public boolean checkRole(String x);
	//tính điểm thi
	public int getScore(Test test, Map<Integer, Set<Integer>> map);
	//lưu kết quả thi
	public boolean insertResult(String username, int id_test, int score) throws Exception;
	//lấy kết quả thi
	public List<Result> getListScore(String username) throws Exception;
	
}
