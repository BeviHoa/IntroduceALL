<%-- 
    Document   : list
    Created on : Mar 19, 2022, 1:04:23 PM
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
        <h1>${ROLL_NUMBER}</h1>
        <form action="getfirst" method="POST">
            Get First <input type="text" name="number"/> letter(s)<br>
            <input type="submit" value="get"/>
        </form>
        
    </body>
</html>
