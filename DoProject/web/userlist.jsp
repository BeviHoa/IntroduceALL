<%-- 
    Document   : userlist
    Created on : May 24, 2022, 9:00:01 PM
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
        <style>
            .end{
                margin-left: 500px;
                margin-top: 5%;
            }
            .search{

            }
            .table-content{
                margin-top: 2%;
                margin-left: 20%;
            }
        </style>
    </head>

    <body>

        <div>
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand">User List</a>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </div>


        <nav class="nav nav-tabs">
            <h7>Sortable by:</h7>
            <a class="nav-link" id="home-tab" data-toggle="tab" href="#home">Id</a>
            <a class="nav-link" id ="product-tab" data-toggle="tab" href="#product">FullName</a>
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Gender</a>
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Email</a>
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Mobile</a>
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Role</a>
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact">Status</a>
        </nav>

        <div class="tab-content">
            <div class="tab-pane fade show active" id="home">
                <span class="align-top">
                    <span class="align-middle">
                        <div class="table-content">
                            <div class="row-md-6">
                                <table border="1px">
                                    <tr>
                                        <td>ID</td>
                                        <td>Full Name</td>
                                        <td>Gender</td>
                                        <td>Email</td>
                                        <td>Mobile</td>
                                        <td>Role</td>
                                        <td>Status</td>
                                        <td>Action</td>
                                    </tr>
                                    <tr>
                                        <td>.</td>
                                        <td>..</td>
                                        <td>..</td>
                                        <td>..</td>
                                        <td>..</td>
                                        <td>..</td>
                                        <td>..</td>
                                        <td>
                                            <a href="#">Edit</a>
                                            <a href="#">Delete</a>
                                            <a href="#">View</a>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </span>
                </span>
            </div>

            <div class="tab-pane fade" id="product">
                <div class="tab-pane fade show active" id="home">
                    <span class="align-top">
                        <span class="align-middle">
                            <div class="table-content">
                                <div class="row-md-6">
                                    <table border="1px">
                                        <tr>
                                            <td>ID</td>
                                            <td>Full Name</td>
                                            <td>Gender</td>
                                            <td>Email</td>
                                            <td>Mobile</td>
                                            <td>Role</td>
                                            <td>Status</td>
                                            <td>Action</td>
                                        </tr>
                                        <tr>
                                            <td>.</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>
                                                <a href="#">Edit</a>
                                                <a href="#">Delete</a>
                                                <a href="#">View</a>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </span>
                    </span>
                </div>
            </div>
            <div class="tab-pane fade" id="contact">
                <div class="tab-pane fade show active" id="home">
                    <span class="align-top">
                        <span class="align-middle">
                            <div class="table-content">
                                <div class="row-md-6">
                                    <table border="1px">
                                        <tr>
                                            <td>ID</td>
                                            <td>Full Name</td>
                                            <td>Gender</td>
                                            <td>Email</td>
                                            <td>Mobile</td>
                                            <td>Role</td>
                                            <td>Status</td>
                                            <td>Action</td>
                                        </tr>
                                        <tr>
                                            <td>.</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>
                                                <a href="#">Edit</a>
                                                <a href="#">Delete</a>
                                                <a href="#">View</a>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </span>
                    </span>
                </div>
            </div>
        </div>






        <a>Search by: </a>
        <div class="check">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                <label class="form-check-label" for="flexCheckDefault">
                    Gender
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                <label class="form-check-label" for="flexCheckChecked">
                    Role
                </label>
            </div>

            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                <label class="form-check-label" for="flexCheckChecked">
                    Status
                </label>
            </div>
            
            <button type="submit" value="Search">Search</button>
        </div>






        <span class="align-bottom">
            <footer class="end">
                <div> 
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">Next</a></li>
                        </ul>
                    </nav>
                </div>
            </footer>
        </span>







    </body>


</html>
