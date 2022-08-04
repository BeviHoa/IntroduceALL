<%-- 
    Document   : caculator
    Created on : Apr 21, 2022, 8:20:28 AM
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
        <form>
            Enter Number1: <input type="text" name="num1"/><br/>
            Enter Number2: <input type="text" name="num2"/><br/>
            Select operator:
            <input type="radio" name="op" value="1"/>+
            <input type="radio" name="op" value="2"/>-
            <input type="radio" name="op" value="3"/>x
            <input type="radio" name="op" value="4"/>:<br/>
            <input type="submit" value="Enter"/>
        </form>
    </body>
</html>
