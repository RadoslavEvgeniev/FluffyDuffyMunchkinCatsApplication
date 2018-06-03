<%@ page import="app.models.Cat" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 3.6.2018 г.
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cats</title>
</head>
<body>
    <h1>All Cats</h1>
    <%Map<String, Cat> cats = (Map<String, Cat>) request.getAttribute("cats");%>
    <%if (cats == null) {%>
        <h3>There are no cats. <a href="/cats/create">Create Some!</a></h3>
    <%} else {%>
        <%for (Cat cat : cats.values()) {%>
            <%String link = "/cats/profile?catName=" + cat.getName();%>
            <h3><a href="<%=link%>"><%=cat.getName()%></a></h3>
            <br/>
        <%}%>
    <%}%>
    <a href="/"> Back To Home</a>
</body>
</html>
