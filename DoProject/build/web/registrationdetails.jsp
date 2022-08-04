<%-- 
    Document   : registrationdetails
    Created on : May 25, 2022, 11:05:37 PM
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
            .justify-content-center{
                margin-left: 50%;
            }
        </style>
    </head>
    <body>

        <div>
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand">Registration Details</a>
                    <div class="clearfix">
                        <div class="spinner-border float-end" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div>
                    </div>
                </div>
            </nav>
        </div>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-1">

                </div>
                <div class="col-sm-10">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Subject</th>
                                <th scope="col">Package with list price/sale price</th>
                                <th scope="col">Full name</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Email</th>
                                <th scope="col">Mobile</th>
                                <th scope="col">Registration time</th>
                                <th scope="col">Sale</th>
                                <th scope="col">Status</th>
                                <th scope="col">Valid from</th>
                                <th scope="col">Valid to</th>
                                <th scope="col">Notes</th>
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
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
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
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
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
                                <td>..</td>
                                <td>..</td>
                                <td><a href="#">Add</a>
                                    <a href="#">Edit</a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="col-sm-1">

                    </div>
                </div>
            </div>
        </div>
        <div class="input-group flex-nowrap">
            <span class="input-group-text" id="addon-wrapping">@</span>
            <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping">
        </div>
        <button class="justify-content-center" type="submit" value="">
            Send
        </button>
    </body>
</html>
