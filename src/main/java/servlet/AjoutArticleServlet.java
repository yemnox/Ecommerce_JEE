package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import business.GestionArticle;
import model.Article;

import java.io.IOException;

@WebServlet("/ajouter")
public class AjoutArticleServlet extends HttpServlet {
    private GestionArticle gestionArticle = new GestionArticle();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String nom = request.getParameter("nom");
        String description = request.getParameter("description");
        double prix = Double.parseDouble(request.getParameter("prix"));
        String image = request.getParameter("image");

        Article article = new Article(0, nom, description, prix, image);
        gestionArticle.addArticle(article);

        response.sendRedirect("confirmation.jsp");
    }
}
