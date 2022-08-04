<%-- 
    Document   : login
    Created on : Feb 17, 2022, 10:19:55 AM
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
        <h1></h1>
        <h3 style="color: red">${requestScope.error} </h3>
        <form action="login" method="get">
            Username<input type="text" name="user" ><br/>
            Password<input type="password" name="pass"><br/>
            <input type="submit" value="LOGIN">
        </form>
    </body>
</html>
