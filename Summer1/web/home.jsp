<%-- 
    Document   : home
    Created on : Mar 18, 2022, 10:27:06 PM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="employees">
            Name <input type="text" name="name" placeholder="Enter name">           
            <input type="submit" value="SUBMIT">
        </form>
        <h3>
            <c:forEach items="${sessionScope.data}" var="i">
                ${i}<br/>
            </c:forEach>
        </h3>
    </body>
</html>
