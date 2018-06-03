<%@ page import="app.models.Cat" %><%--
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
    <% Cat cat = (Cat)request.getAttribute("currentCat"); %>
    <%if (cat != null) {%>
        <h1>Cat - <%=cat.getName()%></h1>
        <h3>Breed - <%=cat.getBreed()%></h3>
        <h3>Breed - <%=cat.getColor()%></h3>
        <h3>Breed - <%=cat.getNumberOfLegs()%></h3>
    <%} else {%>
        <h1>Cat, with name - <%=request.getQueryString().split("=")[1]%> was not found.</h1>
    <%}%>
    <a href="/cats/all">Back To Cats</a>
</body>
</html>
