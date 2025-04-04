<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 4/4/2025
  Time: 12:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <h2>Liste des Articles</h2>
    <c:forEach var="article" items="${articles}">
        <div style="border:1px solid #ccc; padding:10px; margin:10px;">
            <h3>${article.nom}</h3>
            <p>${article.description}</p>
            <strong>${article.prix} €</strong><br>
            <img src="${article.image}" width="100"/><br>
        </div>
    </c:forEach>
    <a href="bienvenue.jsp">Retour</a>
</head>
<body>

</body>
</html>
