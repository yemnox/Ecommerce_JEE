package dao;

import model.User;

public interface IGestionUserDAO {
    boolean addUser(User user);
    User getUserByUsername(String username);
}