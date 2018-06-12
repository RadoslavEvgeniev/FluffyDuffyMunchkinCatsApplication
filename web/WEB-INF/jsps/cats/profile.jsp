<%@ page import="app.models.Cat" %>
<%@ page import="app.repositories.CatRepository" %><%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 3.6.2018 г.
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cat Profile</title>
</head>
<body>
    <%String catName = request.getQueryString().split("=")[1];%>
    <% Cat cat = ((CatRepository)application.getAttribute("catRepository")).findCatByName(catName); %>
    <%if (cat != null) {%>
        <%cat.incrementViews();%>
        <h1>Cat - <%=cat.getName()%></h1>
        <h3>Breed - <%=cat.getBreed()%></h3>
        <h3>Color - <%=cat.getColor()%></h3>
        <h3>Number of legs - <%=cat.getNumberOfLegs()%></h3>
        <h3>Creator - <%=cat.getCreator().getUsername()%></h3>
        <h3>Views - <%=cat.getViews()%></h3>
        <form action="/orders/create" method="post">
            <button name="catName" type="submit" value="<%=cat.getName()%>">Order Cat</button>
        </form>
    <%} else {%>
        <h1>Cat, with name - <%=catName%> was not found.</h1>
    <%}%>
    <a href="/cats/all">Back To Cats</a>
</body>
</html>
