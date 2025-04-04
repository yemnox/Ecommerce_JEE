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
    <h2>Inscription</h2>
    <form method="post" action="register">
        <input type="text" name="username" placeholder="Nom d'utilisateur" required><br>
        <input type="password" name="password" placeholder="Mot de passe" required><br>
        <button type="submit">S'inscrire</button>
    </form>
    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>
    <a href="login.jsp">Déjà inscrit ? Se connecter</a>
</head>
<body>

</body>
</html>
