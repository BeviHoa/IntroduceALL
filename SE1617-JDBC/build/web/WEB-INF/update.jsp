<%-- 
    Document   : update
    Created on : Jan 20, 2022, 9:29:51 AM
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
        <%
        if(request.getAttribute("category")!=null)
        {
            
        Category c = (Category)request.getAttribute("category");
        
        %>
        <form action="update" method="post">
            enter id:<input type="number"reddonly name="id" value="<%= c.getId()%>" /><br>
            enter name:<input type="text" name="name" value="<%= c.getName()%>" /><br>
            enter describe:<input type="text" name="describe" value="<%= c.getDescribe()%>"/><br>
            <input type="submit" value="Save" />
        </form>
        <%
         }           
        %>
        
    </body>
</html>