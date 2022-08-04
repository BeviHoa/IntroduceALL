<%-- 
    Document   : list
    Created on : Jan 20, 2022, 1:40:45 PM
    Author     : anhqu
--%>

<%@page import="java.util.List"%>
<%@page import="model.jobs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Information of all Job(s)</h1>
        <table border="1px" width="40%">
            <tr>
                <th>Job ID</th>
                <th>Job name</th>
                <th>Job salary</th>
                <th>Hire Date</th>
                <th>Activated (yes/no)</th>
            </tr>
            <%
               
            List<jobs> list =(List<jobs>) request.getAttribute("data");
            for (jobs i: list) {
                int id = i.getId(); 
             
            %>
            <tr>
                <td> <%= id %></td>
                <td><%= i.getName() %></td>
                <td><%= i.getSalary() %></td>
               <td><%= i.getDatecreated() %></td>
               <td>
                   <% if(i.isActivated() == true){ %> Yes   <% } %>
                   <% if(i.isActivated() == false){ %> No   <% } %>
            </tr>
          <% } %>
        </table>
        
          
          <h1>This list has ${listSize} in total</h1>
    </body>
</html>
