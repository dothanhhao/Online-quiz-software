package tdt.edu.springboot.model;

public class Test_Question {
	private int idTest;
	private int idQuestion;
	
	
	public Test_Question() {
		super();
		
	}

	public Test_Question(int idTest, int idQuestion) {
		super();
		this.idTest = idTest;
		this.idQuestion = idQuestion;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	@Override
	public String toString() {
		return "Test_Question [idTest=" + idTest + ", idQuestion=" + idQuestion + "]";
	}
}
