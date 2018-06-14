package app.repositories;

import app.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void addUser(User user) {
        if (!this.users.containsKey(user.getUsername())) {
            this.users.put(user.getUsername(), user);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public User findByUsername(String username) {
        if (!this.users.containsKey(username)) {
            return null;
        }

        return this.users.get(username);
    }
}
