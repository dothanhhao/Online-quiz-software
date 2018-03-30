package tdt.edu.springboot.model;

public class Role_Detail {
	
	private int id;
	private String role;
	private String name;
	private String code;
	private boolean status;
	
	
	
	public Role_Detail() {
		super();
		this.status = false;
	}
	
	

	public Role_Detail(String role, String name, String code) {
		super();
		this.role = role;
		this.name = name;
		this.code = code;
	}



	public Role_Detail(int id, String role, String name, String code, boolean status) {
		super();
		this.id = id;
		this.role = role;
		this.name = name;
		this.code = code;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Role_Detail [id=" + id + ", role=" + role + ", name=" + name + ", code=" + code + ", status=" + status
				+ "]";
	}
	
	
	
}
