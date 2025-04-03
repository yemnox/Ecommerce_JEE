package business;

import dao.GestionArticleDAO;
import dao.IGestionArticleDAO;
import model.Article;

import java.util.List;

public class GestionArticle implements IGestionArticle {
    private IGestionArticleDAO articleDAO = new GestionArticleDAO();

    @Override
    public boolean addArticle(Article article) {
        return articleDAO.addArticle(article);
    }

    @Override
    public boolean updateArticle(Article article) {
        return articleDAO.updateArticle(article);
    }

    @Override
    public boolean deleteArticle(int id) {
        return articleDAO.deleteArticle(id);
    }

    @Override
    public Article getArticleById(int id) {
        return articleDAO.getArticleById(id);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleDAO.getAllArticles();
    }
}