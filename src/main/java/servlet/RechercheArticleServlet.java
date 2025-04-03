package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import business.GestionArticle;
import model.Article;

import java.io.IOException;
import java.util.List;

@WebServlet("/recherche")
public class RechercheArticleServlet extends HttpServlet {
    private GestionArticle gestionArticle = new GestionArticle();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Article> articles = gestionArticle.getAllArticles();
        request.setAttribute("articles", articles);
        request.getRequestDispatcher("rechercheArticle.jsp").forward(request, response);
    }
}
