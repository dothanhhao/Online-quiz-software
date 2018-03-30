package tdt.edu.springboot.model;

public class Role {
	
	private String role;
	private String description;
	private boolean status;
	
	
	
	public Role() {
		super();
		this.status = false;
	}


	public Role(String role, String description) {
		super();
		this.role = role;
		this.description = description;
	}


	public Role(String role, String description, boolean status) {
		super();
		this.role = role;
		this.description = description;
		this.status = status;
	}
	
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Role [role=" + role + ", description=" + description + ", status=" + status + "]";
	}


	
	
	
	
}
