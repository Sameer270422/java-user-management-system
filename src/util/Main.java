package util;
import model.User;
import service.UserService;

/**
 * Entry point of the User Management System
 */
public class Main {

    public static void main(String[] args) {

        // Create service object
        UserService service = new UserService();

        // Add sample users
        service.addUser(new User(1, "Alice", "alice@gmail.com", true));
        service.addUser(new User(2, "Bob", "bob@gmail.com", true));
        service.addUser(new User(3, "Charlie", "charlie@gmail.com", false));

        // Basic output verification
        System.out.println("User Management System Started");
        System.out.println("Total Users: " + service.getAllUsers().size());
    }
}
