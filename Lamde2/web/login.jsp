<%-- 
    Document   : login
    Created on : Mar 18, 2022, 3:45:06 PM
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
        <form action="login" method="post"> 
            <table>
                <tr>
                    <td>Username</td>
                    <td>
                        <input type="text" name="user">
                    </td>
                </tr>
                <tr>
                   <td>PassWord</td>
                    <td>
                        <input type="text" name="pass">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Login">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
