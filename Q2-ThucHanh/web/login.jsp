<%-- 
    Document   : login
    Created on : Mar 19, 2022, 10:24:00 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            Username: <input type="text" name="username"/><br>
            Password: <input type="text" name="password"/><br>
            <input type="submit" value="Login">
        </form>
        
    </body>
</html>
