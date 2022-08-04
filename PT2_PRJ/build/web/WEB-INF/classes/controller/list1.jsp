<%-- 
    Document   : list1
    Created on : Mar 3, 2022, 9:42:55 AM
    Author     : hongd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List</h1>
        <table border="1px">
           <tr>
               <th>Event Id</th>
               <th>Content</th>
               <th>Occur</th>
               <th>is Enable</th>
               <th>Owner</th>
           </tr>
           <c:forEach items="${list}" var="l">
               <tr>
               <td>${l.id}</td>
               <td>${l.content}</td>
               <td>${l.date}</td>
               <c:if test="${l.isEnabled == true}">
                   <td><input type="checkbox" name="" id="" checked>${l.isEnabled}</td>
               </c:if>
               <c:if test="${l.isEnabled == false}">
                   <td><input type="checkbox" name="" id="" >${l.isEnabled}</td>
               </c:if>
               <td>${l.createby}</td>
           </tr>
           </c:forEach>
        </table>
    </body>
</html>
