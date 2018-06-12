<%@ page import="app.models.Order" %>
<%@ page import="java.util.Set" %>
<%@ page import="app.repositories.OrderRepository" %><%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 12.6.2018 г.
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cats</title>
</head>
<body>
    <h1>All Orders</h1>
    <%Set<Order> orders = ((OrderRepository)application.getAttribute("orderRepository")).findAllOrders();%>
    <%if (orders == null) {%>
        <h3>There are no orders.</h3>
    <%} else {%>
        <table>
            <thead>
                <tr>
                    <th>Client</th>
                    <th>Cat</th>
                    <th>MadeOn</th>
                </tr>
            </thead>
            <%for (Order order : orders) {%>
                <tbody>
                    <tr>
                        <td><%=order.getClient().getUsername()%></td>
                        <td><%=order.getCat().getName()%></td>
                        <td><%=String.valueOf(order.getMadeOn())%></td>
                    </tr>
                </tbody>
            <%}%>
        </table>
    <%}%>
    <a href="/"> Back To Home</a>
</body>
</html>
