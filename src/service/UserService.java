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
    /**
     * Returns a paginated list of users using two pointers.
     *
     * @param pageNumber page number (starts from 1)
     * @param pageSize   number of records per page
     */
    public List<User> getUsersByPage(int pageNumber, int pageSize) {

        List<User> result = new ArrayList<>();

        int start = (pageNumber - 1) * pageSize;
        int end = Math.min(start + pageSize, users.size());

        int left = start;

        while (left < end) {
            result.add(users.get(left));
            left++;
        }
        return result;
    }
    /**
     * Filters only active users using pointer traversal.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1) excluding result list
     */
    public List<User> getActiveUsers() {

        List<User> activeUsers = new ArrayList<>();
        int pointer = 0;

        while (pointer < users.size()) {
            User current = users.get(pointer);

            if (current.isActive()) {
                activeUsers.add(current);
            }
            pointer++;
        }
        return activeUsers;
    }


}
