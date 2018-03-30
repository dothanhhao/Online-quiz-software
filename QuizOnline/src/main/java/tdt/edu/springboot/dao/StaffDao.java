package tdt.edu.springboot.dao;

import java.util.List;

import tdt.edu.springboot.model.Answer;
import tdt.edu.springboot.model.Question;
import tdt.edu.springboot.model.QuestionForm;
import tdt.edu.springboot.model.Result;
import tdt.edu.springboot.model.Test;
import tdt.edu.springboot.model.TestForm;

public interface StaffDao {
	//thêm câu hỏi
	public boolean addQuestion(Question ques);
	//thêm câu trả lời
	public boolean addAnswer(Answer ans);
	//thêm đề
	public boolean addTest(Test test);
	//lưu câu hỏi và đề
	public boolean addTestQuestion(Test test);
	//lưu câu hỏi và câu trả lời
	public boolean addQuestionAnswer(Question question);
	//chỉnh sửa câu hỏi
	public boolean updateQuestion(Question ques);
	//chỉnh sửa câu trả lời
	public boolean updateAnswer(Answer ans);
	//chỉnh sửa đề
	public boolean updateTest(Test test);
	//xóa câu hỏi
	public boolean deleteQuestion(Question ques);
	//xóa đề
	public boolean deleteTest(Test test);
	//lấy danh sách câu hoi
	public List<Question> getListQuestion() throws Exception;
	//xử lý đề thi
	public Test convertTest(TestForm testForm);
	//xử lý câu hỏi
	public Question convertQuestion(QuestionForm questionForm);
	//kiểm tra quyền
	public boolean checkRole(String x);
	//lấy danh sách điểm
	public List<Result> getListScore() throws Exception;
}
