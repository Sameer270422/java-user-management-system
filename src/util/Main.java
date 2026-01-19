package util;
import model.User;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();

        service.addUser(new User(1, "Alice", "alice@gmail.com", true));
        service.addUser(new User(2, "Bob", "bob@gmail.com", true));
        service.addUser(new User(3, "Charlie", "charlie@gmail.com", false));

        System.out.println("User Management System Started");
        System.out.println("Total Users: " + service.getAllUsers().size());

        // ---- SEARCH FEATURE ----
        System.out.println("\nSearch results for 'a':");
        for (User user : service.searchByName("a")) {
            System.out.println(user.getName());
        }
        System.out.println("\nPage 1 (page size = 2):");
        for (User user : service.getUsersByPage(1, 2)) {
            System.out.println(user.getName());
        }
        System.out.println("\nPage 2 (page size = 2):");
        for (User user : service.getUsersByPage(2, 2)) {
            System.out.println(user.getName());
        }
        System.out.println("\nActive Users:");
        for (User user : service.getActiveUsers()) {
            System.out.println(user.getName());
        }

    }
}
