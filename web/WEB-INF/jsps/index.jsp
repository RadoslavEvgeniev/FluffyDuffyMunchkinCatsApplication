<%@ page import="app.models.User" %><%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 3.6.2018 г.
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cats :))</title>
</head>
<body>
    <h1>Welcome to Fluffy Duffy Munchkin Cats! :)</h1>
    <h3>Navigate trough the application using the links below!</h3>
    <div>
        <%User loggedInUser = ((User)session.getAttribute("loggedInUser"));%>
        <%if (loggedInUser == null) {%>
            <a href="/users/register">Register</a>
            <br/>
            <a href="/users/login">Login</a>
        <%} else {%>
            <h4>Welcome, <%=loggedInUser.getUsername()%>!</h4>
            <a href="/users/profile">Profile</a>
            <br/>
            <a href="/users/logout">Logout</a>
            <br/>
            <a href="/cats/all">All Cats</a>
            <br/>
            <%if (loggedInUser.getRole().equals("ADMIN")) {%>
                <a href="/cats/create">Create Cat</a>
                <br/>
                <form action="/orders/all" method="get">
                    <button type="submit">Orders</button>
                </form>
            <%}%>

        <%}%>
    </div>
</body>
</html>
