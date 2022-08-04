<%-- 
    Document   : list
    Created on : Mar 3, 2022, 9:32:18 AM
    Author     : VinhPhu
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px" width="40%">
            <tr>
                <th>Event ID</th>
                <th>Content</th>
                <th>Occur</th>
                <th>is Enable</th>
                <th>Owner</th>
            </tr>
            <c:forEach items="${requestScope.list}" var="i">
            <tr>
                <td>${i.id}</td>
                <td>${i.content}</td>
                <td>${i.date}</td>
                <td><c:if test="${i.ena}"><input type="checkbox" disabled="" checked=""></input></c:if><c:if test="${!i.ena}"><input type="checkbox" disabled=""></input></c:if></td>
                <td>${i.create}</td>      
            </tr>
            </c:forEach>
        </table>          
    </body>
</html>
