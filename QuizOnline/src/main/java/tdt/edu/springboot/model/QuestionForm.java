package tdt.edu.springboot.model;

import java.util.*;

public class QuestionForm {
	
	private int id;
	private String name;
	private String type;
	private int answer_number;
	private boolean status;
	private String image;
	private String video;
	private Answer answer1;
	private Answer answer2;
	private Answer answer3;
	private Answer answer4;
	private List<Answer> listAnswer;
	
	
	
	public QuestionForm() {
		super();
		this.status = false;
		this.answer_number = 3;
		this.listAnswer = new ArrayList<Answer>();
	}
	
	
	
	
	public QuestionForm(String name, String type, int answer_number, boolean status, String image, String video) {
		super();
		this.name = name;
		this.type = type;
		this.answer_number = answer_number;
		this.status = status;
		this.image = image;
		this.video = video;
	}

	

	public QuestionForm(int id, String name, String type, int answer_number, boolean status, String image, String video) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.answer_number = answer_number;
		this.status = status;
		this.image = image;
		this.video = video;
		
	}

	public void setListAnswer(){
		this.listAnswer.add(answer1);
		this.listAnswer.add(answer2);
		this.listAnswer.add(answer3);
		this.listAnswer.add(answer4);
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
	
	
	public Answer getAnswer1() {
		return answer1;
	}



	public void setAnswer1(Answer answer1) {
		this.answer1 = answer1;
	}



	public Answer getAnswer2() {
		return answer2;
	}



	public void setAnswer2(Answer answer2) {
		this.answer2 = answer2;
	}



	public Answer getAnswer3() {
		return answer3;
	}



	public void setAnswer3(Answer answer3) {
		this.answer3 = answer3;
	}



	public Answer getAnswer4() {
		return answer4;
	}



	public void setAnswer4(Answer answer4) {
		this.answer4 = answer4;
	}



	public List<Answer> getListAnswer() {
		return listAnswer;
	}



	public void setListAnswer(List<Answer> listAnswer) {
		this.listAnswer = listAnswer;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", type=" + type + ", answer_number=" + answer_number
				+ ", status=" + status + ", image=" + image + ", video=" + video + "]";
	}
	
	
	
	
}
