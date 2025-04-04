readme: |
# Ecommerce_JEE

A Java EE (Servlet + JSP) web application for managing users and articles in a small e-commerce platform.  
Implements MVC architecture with layered design (DAO, Metier, Presentation), session handling, and PostgreSQL integration.

  ---

## Features

- User registration
- User login / logout with session management
- Add / list articles (with authentication)
- PostgreSQL database access via JDBC
- WAR packaging and Tomcat deployment

  ---

## Technologies Used

- Java JDK 17–21
- Servlet API 4.0
- JSP + JSTL 1.2
- Apache Tomcat 9.x
- PostgreSQL
- Maven (build tool)
- IntelliJ IDEA

  ---



  ---

## Default Pages

  Path                        | Description
  ---------------------------|---------------------------
  /inscription.jsp            | User registration form
  /login.jsp                  | Login page
  /ajoutArticle.jsp           | Add article form
  /recherche (servlet)        | List all articles
  /logout (servlet)           | Ends session

  ---

## Sample Test User

- Username: admin
- Password: admin123

  ---

## Author

[Emna Drihem]  
Ecommerce: TP1 – Java EE Project  
GitHub: https://github.com/yemnox/Ecommerce_JEE


