<%-- 
    Document   : login
    Created on : Jan 12, 2022, 11:20:42 PM
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
        <h1>Login Form</h1>
        <form action="login" method="post">
            <h2>
                enter username: <input type="text" name="user"/></br>
                enter password: <input type="password" name="pass"/></br>   
                <input type="submit" value="Login"/>
            </h2>
        </form>
        
    </body>
</html>
