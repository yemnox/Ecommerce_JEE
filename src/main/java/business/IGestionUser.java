package business;

import model.User;

public interface IGestionUser {
    boolean registerUser(User user);
    User login(String username, String password);
}
