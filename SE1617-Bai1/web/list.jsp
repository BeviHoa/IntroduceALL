<%-- 
    Document   : list
    Created on : Feb 10, 2022, 11:23:19 AM
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
        <h1> List of Employees</h1>
        <form>
            Department
            <select name="did">
                <option value="0">Pls choose a department</option>
                <c:forEach items="${requestScope.depts}">
                    <option value="${d.did}">${d.name}</option>
                </c:forEach>
                
            </select>
        </form>
        <hr>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Gender</th>
                <th>Department</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.emps}" var="e">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.name}</td>
                    <td>${e.dob}</td>
                    <td>
                        <c:if test="${e.gender}">
                            <img src="images/male-icon.png"/>
                        </c:if>
                            <c:if test="${!e.gender}">
                            <img src="images/female-icon.png"/>
                        </c:if>
                
                              
                    </td>
                    <td>${e.dept.name}</td>
                    <td>Edit</td>
                </tr>
            </c:forEach>
            
        </table>
        
    </body>
</html>
