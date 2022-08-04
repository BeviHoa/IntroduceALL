<%-- 
    Document   : list
    Created on : Jan 18, 2022, 11:08:51 AM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border-collapse:collapse;
            }
            
        </style>
        
        <script type="text/javascript">
        function doDelete(id)
        
            if(confirm("are you sure to delete category whirh id="+id+"?"))
            {
                window.location="delete?id="+id;
            }
        }
        
        
    </script>
    
    </head>
    <body>
        <h1>List of Category!</h1>
        <h3><a href="new.jsp">Add new</a></h3>

      <table border="1px" width="40%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th>Action</th>
                
            </tr>
            <%
              List<Category> list =(List<Category>) request.getAttribute("data");
              for(Category i:list)
              {
              int id = i.getId();
              %> 
             
              <tr>
                  <td><%= id %></td>
                  <td><%= i.getName() %></td>
                  <td><%= i.getDescribe()%></td>
                  <td>
                      <a href="#" onclick="doDelete('<%= id %>')">Delete</a>&nbsp;&nbsp;&nbsp;
                      <a href="update?id=<%= id %>">Update</a>
                  </td>
              </tr>
            <%  
}
            %>
            
            
        </table>
    </body>
    
</html>
