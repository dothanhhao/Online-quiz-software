package tdt.edu.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class TestForm {
	
	private int id;
	private String name;
	private String levelTest;
	private int questionNumber;
	private String image;
	private boolean status;
	
	private Question question1;
	private Question question2;
	private Question question3;
	private Question question4;
	private Question question5;
	private Question question6;
	private Question question7;
	private Question question8;
	private Question question9;
	private Question question10;
	
	private List<Question> listQues = new ArrayList<Question>();
	
	
	
	public TestForm() {
		super();
		this.status = false;
		this.questionNumber = 10;
	}

	public TestForm(String name, String levelTest, int questionNumber, String image, boolean status) {
		super();
		this.name = name;
		this.levelTest = levelTest;
		this.questionNumber = questionNumber;
		this.image = image;
		this.status = status;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLevelTest() {
		return levelTest;
	}
	
	public void setLevelTest(String levelTest) {
		this.levelTest = levelTest;
	}
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setListQuestion(){
		this.listQues.add(question1);
		this.listQues.add(question2);
		this.listQues.add(question3);
		this.listQues.add(question4);
		this.listQues.add(question5);
		this.listQues.add(question6);
		this.listQues.add(question7);
		this.listQues.add(question8);
		this.listQues.add(question9);
		this.listQues.add(question10);
		
	}
	
	public List<Question> getListQues() {
		return listQues;
	}

	public void setListQues(List<Question> listQues) {
		this.listQues = listQues;
	}

	public Question getQuestion1() {
		return question1;
	}

	public void setQuestion1(Question question1) {
		this.question1 = question1;
	}

	public Question getQuestion2() {
		return question2;
	}

	public void setQuestion2(Question question2) {
		this.question2 = question2;
	}

	public Question getQuestion3() {
		return question3;
	}

	public void setQuestion3(Question question3) {
		this.question3 = question3;
	}

	public Question getQuestion4() {
		return question4;
	}

	public void setQuestion4(Question question4) {
		this.question4 = question4;
	}

	public Question getQuestion5() {
		return question5;
	}

	public void setQuestion5(Question question5) {
		this.question5 = question5;
	}

	public Question getQuestion6() {
		return question6;
	}

	public void setQuestion6(Question question6) {
		this.question6 = question6;
	}

	public Question getQuestion7() {
		return question7;
	}

	public void setQuestion7(Question question7) {
		this.question7 = question7;
	}

	public Question getQuestion8() {
		return question8;
	}

	public void setQuestion8(Question question8) {
		this.question8 = question8;
	}

	public Question getQuestion9() {
		return question9;
	}

	public void setQuestion9(Question question9) {
		this.question9 = question9;
	}

	public Question getQuestion10() {
		return question10;
	}

	public void setQuestion10(Question question10) {
		this.question10 = question10;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", levelTest=" + levelTest + ", questionNumber=" + questionNumber
				+ ", image=" + image + ", status=" + status + "]";
	}
	
	
	
}
