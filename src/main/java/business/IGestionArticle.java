package business;

import model.Article;
import java.util.List;

public interface IGestionArticle {
    boolean addArticle(Article article);
    boolean updateArticle(Article article);
    boolean deleteArticle(int id);
    Article getArticleById(int id);
    List<Article> getAllArticles();
}
