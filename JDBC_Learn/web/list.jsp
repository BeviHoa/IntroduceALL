<%-- 
    Document   : list
    Created on : Apr 28, 2022, 8:40:52 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Category </h1>
        <table border = "1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th>Action</th>
            </tr>

            <%
                List<Category> list = (List<Category>) request.getAttribute("data");
                for (Category i : list) {
                    int id = i.getId();

            %>
            <tr>
                <td><%= id%></td>
                <td><%= i.getName()%></td>
                <td><%= i.getDescribe()%></td>
                <td></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
