package service;

import java.util.ArrayList;
import java.util.List;

import model.User;

/**
 * service class to handle user-related operations.
 * Acts as a business logic layer.
 */

public class UserService{
	private List<User> users = new ArrayList<>();
	
	/**
     * Adds a new user to the system
     */
	public void addUser(User user) {
		users.add(user);
	}
	 /**
     * Returns the complete list of users
     */
	public List<User> getAllUsers(){
		return users;
	}
}