package business;

import dao.GestionUserDAO;
import dao.IGestionUserDAO;
import model.User;

public class GestionUser implements IGestionUser {
    private IGestionUserDAO userDAO = new GestionUserDAO();

    @Override
    public boolean registerUser(User user) {
        return userDAO.addUser(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}