package tdt.edu.springboot.model;

import java.util.List;

public class Test {
	
	private int id;
	private String name;
	private String levelTest;
	private int questionNumber;
	private String image;
	private boolean status;
	private List<Question> question;
	
	
	
	public Test() {
		super();
		this.status = false;
		this.questionNumber = 10;
	}

	public Test(String name, String levelTest, int questionNumber, String image, boolean status) {
		super();
		this.name = name;
		this.levelTest = levelTest;
		this.questionNumber = questionNumber;
		this.image = image;
		this.status = status;
	}
	
	public Test(int id, String name, String levelTest, int questionNumber, String image, boolean status) {
		super();
		this.id = id;
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
	
	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", levelTest=" + levelTest + ", questionNumber=" + questionNumber
				+ ", image=" + image + ", status=" + status + "]";
	}
	
	
	
}
