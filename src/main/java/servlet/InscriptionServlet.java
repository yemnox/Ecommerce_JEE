package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import business.GestionUser;
import model.User;
import java.io.IOException;

@WebServlet("/register")
public class InscriptionServlet extends HttpServlet {
    private GestionUser gestionUser = new GestionUser();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User newUser = new User();
        newUser.setUsername(username);

    }
}