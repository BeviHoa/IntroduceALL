<%-- 
    Document   : home
    Created on : May 10, 2022, 9:56:08 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example</h1>
        <h2>
            Request: ${requestScope.name1}<br/>
            Session: ${sessionScope.name2}
        </h2>
    </body>
</html>
