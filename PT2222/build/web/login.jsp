<%-- 
    Document   : login
    Created on : Mar 3, 2022, 10:00:49 AM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <p style="color: red">${message}</p>
        <form action="" method="post">
            <label for="acc">Account ID</label>
            <input type="text" name="username" id="acc"><br>
            <label for="pass">Password</label>
            <input type="password" name="password" id="pass"><br>
            <button>Login</button>
        </form>
    </body>
</html>
