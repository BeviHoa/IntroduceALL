<%-- 
    Document   : list
    Created on : Feb 10, 2022, 10:16:02 AM
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
        <h1>List of Student</h1>
        <c:set var="gid" value="${requestScope.gid}"/>
        <form id="f" action="list">
            Department
            <select name="gid" onchange="document.getElementById('f').submit()">
                <option value="0">Please choose a group</option>
                <c:forEach items="${requestScope.groups}" var="g">
                    <option <c:if test="${g.groupID==gid}">selected</c:if> value="${g.groupID}">${g.groupName}</option>
                </c:forEach>
            </select>
        </form>
        <hr>
        <table border="1px">
            <tr>
                <th>StudentID</th>
                <th>StudentName</th>
                <th>Address</th>
                <th>Status</th>
                <th>Group</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.students}" var="s">
                <tr>
                    <td>${s.studentID}</td>
                    <td>${s.studentName}</td>
                    <td>${s.address}</td>
                    <td>
                        <c:if test="${s.status}">
                            Passed
                        </c:if>
                        <c:if test="${!s.status}">
                            Failed
                        </c:if>
                    </td>
                    <td>${s.g.groupName}</td>
                    <td>Edit</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
