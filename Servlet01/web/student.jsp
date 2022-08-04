<%-- 
    Document   : student
    Created on : Jan 14, 2022, 3:23:23 PM
    Author     : Admin
--%>
<%@page import="model.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>A student</h1>
        <form action="student" method="post">
            Enter ID:<input type="text" name="id"/><br/>
            Enter Name:<input type="text" name="name"/><br/>
            Select gender:<input type="radio" name="g" value="1"/>Male
                          <input type="radio" name="g" value="0"/>Female<br/>
            Enter mark:<input type="text" name="mark"/><br/>
                          <input type="submit" value="Submit"/>              
            
        </form>
        <table border="1px" width="40%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Pass/Fail</th>
                
            </tr>
            <%
                if(request.getAttribute("st") != null){
                    Student t = (Student) request.getAttribute("st");
                
            %>
            <tr>
                <td><%= t.getId() %><td/>
                <td><%= t.getName()%><td/>
                <td><%= t.getId()%><td/>
                <td><%= t.getStatus()%><td/>
                
            </tr>
            
            <%
               } 
            %>
        </table>
    </body>
</html>
