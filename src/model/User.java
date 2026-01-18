package model;
/**
 * user entity class

 * basic attributes
 */
		
public class User{
	private int id; // unique user ID
	private String name; //User name
	private String email;//user email
	private boolean active;//user status
	
	/**
	 * paramatrized constructor to create a user object
	 */
	
	public User(int id, String name, String email,boolean active) {
		this.id = id;
		this.name = name;
		this.email=email;
		this.active=active;
	}
	//Getter Methods
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public boolean isActive() {
		return active;
	}
}