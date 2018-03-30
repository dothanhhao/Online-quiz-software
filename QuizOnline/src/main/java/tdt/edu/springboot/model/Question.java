package tdt.edu.springboot.model;

import java.util.*;

public class Question {
	
	private int id;
	private String name;
	private String type;
	private int answer_number;
	private boolean status;
	private String image;
	private String video;
	private Answer answer;
	private List<Answer> listAnswer;
	
	
	
	public Question() {
		super();
		this.status = false;
		this.answer_number = 3;
		this.listAnswer = new ArrayList<Answer>();
	}
	
	
	
	public Question(String name, String type, int answer_number, boolean status, String image, String video) {
		super();
		this.name = name;
		this.type = type;
		this.answer_number = answer_number;
		this.status = status;
		this.image = image;
		this.video = video;
	}

	

	public Question(int id, String name, String type, int answer_number, boolean status, String image, String video) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.answer_number = answer_number;
		this.status = status;
		this.image = image;
		this.video = video;
		
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAnswer_number() {
		return answer_number;
	}
	public void setAnswer_number(int answer_number) {
		this.answer_number = answer_number;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
	public List<Answer> getListAnswer() {
		return listAnswer;
	}



	public void setListAnswer(List<Answer> listAnswer) {
		this.listAnswer = listAnswer;
	}



	public Answer getAnswer() {
		return answer;
	}



	public void setAnswer(Answer answer) {
		this.answer = answer;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", type=" + type + ", answer_number=" + answer_number
				+ ", status=" + status + ", image=" + image + ", video=" + video + ", answer=" + answer + "]";
	}



	
	
	
	
	
}
