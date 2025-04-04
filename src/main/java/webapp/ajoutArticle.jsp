<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 4/4/2025
  Time: 12:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h2>Ajouter un Article</h2>
    <form method="post" action="ajouter">
        <input type="text" name="nom" placeholder="Nom de l'article" required><br>
        <textarea name="description" placeholder="Description"></textarea><br>
        <input type="number" name="prix" placeholder="Prix" step="0.01" required><br>
        <input type="text" name="image" placeholder="URL de l'image"><br>
        <button type="submit">Ajouter</button>
    </form>
    <a href="bienvenue.jsp">Retour</a>
</head>
<body>

</body>
</html>
