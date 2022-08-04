<%-- 
    Document   : login
    Created on : Apr 20, 2022, 10:08:29 PM
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
        <% 
        if(request.getAttribute("error") != null){
            String error =  (String)request.getAttribute("error");
        %>
        <h2 style="color: red"> <%= error%></h2>
        <%
        }
        
        %>
        <form action="login" method="get">
            Enter Username: <input type="text" name="user"/><br/>
            Enter Password: <input type="text" name="pass"/><br/>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
