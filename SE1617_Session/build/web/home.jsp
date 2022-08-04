<%-- 
    Document   : home
    Created on : Feb 16, 2022, 2:32:21 PM
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
        <h1>Home page</h1>
        <h2>
            <a href="logout">Logout</a>
            Hello ${sessionScope.account.user}
        </h2>
    </body>
</html>
