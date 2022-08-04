<%-- 
    Document   : add
    Created on : Feb 22, 2022, 11:40:50 AM
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
        <h1>Add a new Employee</h1>
        <form action="add" method="post">
            Enter ID employee:<input type="text" name="id"/><br/>
            Enter Name employee:<input type="text" name="name"/><br/>
            <h3>The list of skills</h3>
            <c:forEach items="${requestScope.skills}" var="s">
                <input type="checkbox" name="skill" value="${s.id}"/>
                ${s.name}<br/>
            </c:forEach>
                <input type="submit" value="Save"/>
        </form>
    </body>
</html>
