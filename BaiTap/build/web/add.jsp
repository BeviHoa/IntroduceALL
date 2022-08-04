<%-- 
    Document   : List
    Created on : Jan 18, 2022, 11:30:37 AM
    Author     : DELL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            a{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
          <h1 style="font-size: 30px">Enter the information of Job</h1>
        <form action="add" method="post">
            Job Name:<input type="text" name="name"/><br/>
            Job Salary:<input type="number" name="salary"/><br/>
            Date Created:<input type="date" pattern="MM/dd/yyyy" name="date"/>(MM/dd/yyyy) <br/>
            Activated:<input type="radio" name="activated" value="1"/>Yes   
                        <input type="radio" name="activated" value="0"/>No <br/> 
            <input type="submit" value="SAVE"/>
            <button> <a href ="list1"> All Job(s)</a></button>
        </form>
    </body>
</html>
