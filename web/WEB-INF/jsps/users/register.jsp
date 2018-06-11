<%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 11.6.2018 г.
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fluffy Duffy Munchkin Cats :))</title>
</head>
<body>
    <h1>Register!</h1>
    <form method="post">
        <label for="username">
            UserName:
            <input type="text" id="username" name="user_name">
        </label>
        <br/>
        <label for="password">
            Password:
            <input type="password" id="password" name="user_password">
        </label>
        <br/>
        <label for="confirmPassword">
            Confirm Password:
            <input type="password" id="confirmPassword" name="confirm_password">
        </label>
        <br/>
        <label for="role">
            Role:
            <select name="user_role" id="role">
                <option value="ADMIN">Admin</option>
                <option value="USER">User</option>
            </select>
        </label>
        <br/>
        <input type="submit" value="Register">
    </form>
    <a href="/">Back To Home</a>
</body>
</html>
