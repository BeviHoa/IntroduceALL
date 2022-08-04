<%-- 
    Document   : name
    Created on : Feb 17, 2022, 9:34:43 AM
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
        <h1></h1>
        <form action="name">
            Name: <input type="text" name="name"> <br/>
            Text:      <select name="danhsach" onchange="">
                <option>Text book</option>
                <option>Reference book</option>               
            </select> <br/>
            
            <input type="submit" value="SUBMIT"/> <br/>
            <br/>
            There are no books in the list yet
        </form>
        <h3>
        <c:forEach items="${sessionScope.data}" var="i">
            ${i}<br/>
        </c:forEach>
        <h3/>  
        
    </body>
</html>
