<%-- 
    Document   : name
    Created on : May 10, 2022, 10:04:55 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Name Form </h1>
        <form>
            Enter name:  <input type="text" name="name" placeholder="enter name"/><br/>
            <input type="submit" value="SUBMIT"/>
        </form>
        <h3>
        <c:forEach items="${sessionScope.data}" var="i">
            ${i}<br/>
        </c:forEach>
        <h3/>
    </body>
</html>
