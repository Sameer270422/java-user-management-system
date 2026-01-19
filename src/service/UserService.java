package service;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 * Service class to handle user-related operations.
 */
public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    /**
     * Search users by name using pointer-style traversal
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1) excluding result list
     */
    public List<User> searchByName(String keyword) {

        List<User> result = new ArrayList<>();
        int pointer = 0;

        while (pointer < users.size()) {
            User currentUser = users.get(pointer);

            if (currentUser.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {
                result.add(currentUser);
            }
            pointer++;
        }
        return result;
    }
}
