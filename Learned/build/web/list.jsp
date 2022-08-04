<%-- 
    Document   : list
    Created on : Apr 21, 2022, 10:41:16 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Form list!</h1>
        <table border="5px">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Age</th>
            </tr>
            
            <%
                List<Student> list = (List<Student>)request.getAttribute("data");
                for (Student i : list) {
            %>
            <tr>
                <td><%= i.getId() %></td>
                <td><%= i.getName() %></td>
                <%
                    if(i.isGender()){
                %>
                <td><img src="images/male-icon.png"/></td>
                
                <%
                    }else{
                %>
                <td><img src="images/female-icon.png"/></td>
                
                <%
                    }
                %>
                <td><%= i.getAge() %></td>
            </tr>
            <%
            
                    }
            %>
        </table>
        
    </body>
</html>
