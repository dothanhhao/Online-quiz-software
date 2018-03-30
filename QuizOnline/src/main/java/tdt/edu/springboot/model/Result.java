package tdt.edu.springboot.model;

public class Result {
	private int id;
	private String username;
	private int idTest;
	private int score;
	private boolean status;
	
	
	
	public Result() {
		super();
		this.status = false;
		
	}

	public Result(int id, String username, int idTest, int score, boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.idTest = idTest;
		this.score = score;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdTest() {
		return idTest;
	}
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", username=" + username + ", idTest=" + idTest + ", score=" + score + ", status="
				+ status + "]";
	}
	
	
	
}
