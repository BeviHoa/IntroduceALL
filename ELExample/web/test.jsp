<%-- 
    Document   : test
    Created on : Feb 8, 2022, 11:06:38 AM
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
        <h1>EL Example</h1>
        <h3>
            Gia tri: ${4+9+3-12}<br/>
            PI:${Math.PI}<br/>
           Gia tri boolean:${2>4}
        </h3>
        <form>
            Enter number 1:<input type="text" name="n1" value=""/><br/>
            Enter number 2:<input type="text" name="n2" value=""/><br/>
            <input type="submit" value="SUMIT"/><br/>
        </form>
        <%
           if(request.getParameter("n1")!= null && request.getParameter("n2")!= null){
               double n1,n2;
               try {
                       n1=Double.parseDouble(request.getParameter("n1"));
                       n2=Double.parseDouble(request.getParameter("n2"));
                       double sum=n1+n2;
                       double avg=sum/2;
                     
                       
        %>
        <h3>
            sum:<%= sum %><br/>
            avg:<%= avg %><br/>           
        </h3>
        <%
                   } catch (NumberFormatException e) {
                   }
            }
        %>
        
        
    </body>
</html>
