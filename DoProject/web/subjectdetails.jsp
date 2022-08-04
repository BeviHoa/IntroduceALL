<%-- 
    Document   : subjectdetails
    Created on : May 24, 2022, 2:47:08 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <%@include file="Header.jsp" %>
    <body>
        
        <div class="container">
            
            <h5>Subject Details</h5>
            <nav class="nav nav-tabs">
                <a class="nav-link" id="home-tab" data-toggle="tab" href="#home">Overview</a>
                <a class="nav-link" id ="product-tab" data-toggle="tab" href="#product">Dimension</a>
                <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Price Package</a>
            </nav>
            
            <div class="tab-content">
                <div class="tab-pane fade show active" id="home">
                    <div>
                        <a>Subject Name</a> <br/>
                        <input class="text-box" type="text" value="Text box"><br/>
                        <a>Category</a><br/>
                        <select name="category">
                            <option value="">Combo Box</option>
                            <option value="">...</option>
                            <option value="">...</option>
                        </select>
                        <br/>
                        <br/>
                        <input type="checkbox" name="" value="">Featured Subject &emsp; Status 
                        <select name="status">
                            <option value="">Status</option>
                            <option value="">...</option>
                            <option value="">...</option>
                        </select>
                        <br/>
                        Description<br/>
                        <input type="text" value="Subject Description" name=""/>
                        <br/>
                        <button type="submit" value="Submit" name="Submit">Submit</button> &emsp;
                        <button type="back" value="Back" name="Back">Back</button>
                               
                               
                    </div>
                </div>
                <div class="tab-pane fade" id="product">
                    <a href="#">Add New</a>
                    <div class="table">
                        <table border="1px">
                            <tr>
                                <td>#</td>
                                <td>Type</td>
                                <td>Dimention</td>
                                <td>Action</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <a href="#">Edit</a>
                                    <a href="#">Delete</a>                                  
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <a href="#">Edit</a>
                                    <a href="#">Delete</a>                                  
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div class="tab-pane fade" id="contact">
                    <div class="price">
                        <a href="#">Add New</a>
                        <div class="">
                            <table border = 1px>
                                <tr>
                                    <td>#</td>
                                    <td>Package</td>
                                    <td>Duration</td>
                                    <td>List Price</td>
                                    <td>Sale Price</td>
                                    <td>Status</td>
                                    <td>Action</td>
                                </tr>
                                <tr>
                                    <td>1</td>
                                    <td><a href="#">Gói truy cập 3 thántg</a></td>
                                    <td>3</td>
                                    <td>3600</td>
                                    <td>3200</td>
                                    <td>Active</td>
                                    <td>
                                    <a href="#">Edit</a>
                                    <a href="#">Delete</a>                                  
                                </td>
                                </tr>
                            </table>                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        
    </body>
    <%@include file="Footer.jsp" %>
</html>
