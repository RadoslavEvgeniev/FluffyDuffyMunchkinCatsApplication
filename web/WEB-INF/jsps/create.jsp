<%--
  Created by IntelliJ IDEA.
  User: Rado
  Date: 3.6.2018 г.
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Fluffy Duffy Munchkin Cat</title>
</head>
<body>
<h1>Create Cat!</h1>
    <div>
        <form method="post">
            <label for="name">
                Name:
                <input type="text" id="name" name="cat_name">
            </label>
            <br/>
            <label for="breed">
                Breed:
                <input type="text" id="breed" name="cat_breed">
            </label>
            <br/>
            <label for="color">
                Color:
                <input type="text" id="color" name="cat_color">
            </label>
            <br/>
            <label for="numberOfLegs">
                Number of Legs:
                <input type="number" id="numberOfLegs" name="cat_legs">
            </label>
            <br/>
            <input type="submit" value="Create Cat">
        </form>
        <a href="/">Back to Home</a>
    </div>
</body>
</html>
