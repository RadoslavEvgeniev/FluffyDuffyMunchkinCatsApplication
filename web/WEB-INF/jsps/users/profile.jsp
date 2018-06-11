<%@ page import="app.models.User" %><%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 11.6.2018 г.
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cat Profile</title>
</head>
<body>
    <%User loggedInUser = (User) session.getAttribute("loggedInUser");%>
    <%if (loggedInUser != null) {%>
        <h1>User - <%=loggedInUser.getUsername()%></h1>
        <h3>Registered on - <%=String.valueOf(loggedInUser.getRegistrationDate())%></h3>
    <%}%>
</body>
</html>
