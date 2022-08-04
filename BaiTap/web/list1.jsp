<%-- 
    Document   : List
    Created on : Jan 18, 2022, 11:30:37 AM
    Author     : DELL
--%>

<%@page import="Model.Jobs"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>information of all job(s)</h1>
        <table border="1px" width="40%">
            <tr>
                <th>Id</th> 
                <th>Job Name</th>
                <th>Job Salary</th>
                <th>hire Date</th>
                <th>Activated(Yes/No)</th>
            </tr>
            <%  
                int count=0;
                
                List<Jobs> list = (List<Jobs>) request.getAttribute("list");
                for (Jobs i : list) {
                    int id = i.getId();
            %>
             <tr>
                 <td><%= id%></td>
                <td><%= i.getName()%></td>
                <td><%= i.getSalary()%></td>
                <td><%= i.getDate() %></td>
                <td><%= i.getActivated() %></td>
             </tr>
            <%
                count ++;
            }
            %>         
    </table>
<h1>The list has <%=count %> Jobs total </h1>
</body>
</html>
