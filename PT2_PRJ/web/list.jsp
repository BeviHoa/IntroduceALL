<%-- 
    Document   : list
    Created on : Mar 3, 2022, 9:38:40 AM
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
    
        <table border = '1px'>
            <tr>
                    <th>Event ID</th>
                    <th>Content</th>
                    <th>Occur</th>
                    <th>is Enable</th>
                    <th>Owner</th>
                    
            </tr>
            <c:forEach items="${requestScope.list}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.content}</td>
                    <td>${s.date}</td>
                    <td>${s.isEnable}>                          
                    <td>${s.create_by}</td>             
                </tr>S                
            </c:forEach>
        </table>
    </body>  
</html>

