package tdt.edu.springboot.model;

import java.util.List;

public class TestingForm {
	
	private int id;
	private String name;
	private String levelTest;
	private int questionNumber;
	private String image;
	private boolean status;
	private List<Question> question;
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
	
	
	
	public TestingForm() {
		super();
		this.status = false;
		this.questionNumber = 10;
	}

	public TestingForm(String name, String levelTest, int questionNumber, String image, boolean status) {
		super();
		this.name = name;
		this.levelTest = levelTest;
		this.questionNumber = questionNumber;
		this.image = image;
		this.status = status;
	}
	
	public TestingForm(int id, String name, String levelTest, int questionNumber, String image, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.levelTest = levelTest;
		this.questionNumber = questionNumber;
		this.image = image;
		this.status = status;
	}
	public void saveListQuestion(){
		
		this.question.add(question1);
		this.question.add(question2);
		this.question.add(question3);
		this.question.add(question4);
		this.question.add(question5);
		this.question.add(question6);
		this.question.add(question7);
		this.question.add(question8);
		this.question.add(question9);
		this.question.add(question10);
		
		
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
	
	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
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
