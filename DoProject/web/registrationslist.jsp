<%-- 
    Document   : registrationslist
    Created on : May 25, 2022, 9:27:51 PM
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
            .sortby{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div>
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand">Registration List</a>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </div>
        <div class="sortby">
            <p> Sắp xếp theo<p/>
            <button type="button" class="btn btn-light">ID</button>
            <button type="button" class="btn btn-light">Email</button>
            <button type="button" class="btn btn-light">Registration time</button>
            <button type="button" class="btn btn-light">Subject</button>
            <button type="button" class="btn btn-light">Package</button>
            <button type="button" class="btn btn-light">Total cost</button>
            <button type="button" class="btn btn-light">Valid From</button>
            <button type="button" class="btn btn-light">Valid To</button>
        </div>
        <div class="container-fluid">
            <div class="row">

                <div class="col-sm-3">


                    <p>Bộ lọc tìm kiếm</p>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                        <label class="form-check-label" for="flexCheckDefault">
                            Subject
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                        <label class="form-check-label" for="flexCheckChecked">
                            Registration time (from, to)
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                        <label class="form-check-label" for="flexCheckChecked">
                            Status
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                        <label class="form-check-label" for="flexCheckChecked">
                            Email
                        </label>
                    </div>

                </div>

                <div class="col-sm-9">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Email</th>
                                <th scope="col">Registration time</th>
                                <th scope="col">Subject</th>
                                <th scope="col">Package</th>
                                <th scope="col">Total cost</th>
                                <th scope="col">Status</th>
                                <th scope="col">Valid from</th>
                                <th scope="col">Valid to</th>
                                <th scope="col">Updated by</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>...</td>
                                <td>..</td>
                                <td>...</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>...</td>
                                <td>..</td>
                                <td>...</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>...</td>
                                <td>..</td>
                                <td>...</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>


            </div>
        </div>
        <footer>
            
        </footer>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script
        </body>
        </html>
