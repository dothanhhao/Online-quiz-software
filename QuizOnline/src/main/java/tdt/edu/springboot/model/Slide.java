package tdt.edu.springboot.model;

public class Slide {
	private int id;
	private String name;
	private String about;
	private String image;
	private String video;
	private boolean status;
	
	
	
	public Slide(int id, String name, String about, String image, String video, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.image = image;
		this.video = video;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Slide [id=" + id + ", name=" + name + ", about=" + about + ", image=" + image + ", video=" + video
				+ ", status=" + status + "]";
	}
	
	
}
