package tdt.edu.springboot.model;

public class Answer {
	
	private int id;
	private String name;
	private boolean correct;
	private boolean status;
	private String image;
	private String video;
	private int id_question;
	
	
	
	
	public Answer() {
		super();
		this.status = false;
		this.correct = false;
	}
	
	public Answer(int id, String name, boolean correct, boolean status, String image, String video, int id_question) {
		super();
		this.id = id;
		this.name = name;
		this.correct = correct;
		this.status = status;
		this.image = image;
		this.video = video;
		this.id_question = id_question;
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
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
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
	public int getId_question() {
		return id_question;
	}
	public void setId_question(int id_question) {
		this.id_question = id_question;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", correct=" + correct + ", status=" + status + ", image="
				+ image + ", video=" + video + ", id_question=" + id_question + "]";
	}
	
	
	
}
