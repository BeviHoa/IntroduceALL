<%-- 
    Document   : newjsp
    Created on : Jan 20, 2022, 9:28:15 AM
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
        <h1>Add a new category</h1>
        <h3 style="color:red">${error} </h3>  
        <form action="add">
            enter id:<input type="number" name="id" /><br>
            enter name:<input type="text" name="name" /><br>
            enter describe:<input type="text" name="describe" /><br>
            <input type="submit" value="Save" />
        </form>
    </body>
</html>
