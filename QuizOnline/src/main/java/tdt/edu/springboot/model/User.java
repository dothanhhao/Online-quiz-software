package tdt.edu.springboot.model;

public class User {
	
	private String username;
	private String password;
	private String name;
	private int age;
	private String address;
	
	private Boolean status;
	
	private String role;
	
	public User() {
		super();
		this.status = false;
	}


	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = false;
	}

	public User( String username, String password, String name, int age, String address, 
			Boolean status, String role) {
		super();
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address;
		this.role = role;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", address=" + address +  ", status=" + status + ", role=" + role + "]";
	}
	
}
