<%-- 
    Document   : quizdetails
    Created on : May 25, 2022, 11:44:40 PM
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
        <style file="text/css">
            .hoa{
                padding: 58%;
            }
            .footer{
                background-color: red;
            }
        </style>
    </head>
    <body>
        <div>
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand">Quiz Details</a>                  
                </div>
            </nav>
        </div>


        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-1">

                </div>
                <div class="col-sm-10">
                    <div class="container">

                        <h5>Subject Details</h5>
                        <nav class="nav nav-tabs">
                            <a class="nav-link" id="home-tab" data-toggle="tab" href="#home">Overview</a>
                            <a class="nav-link" id ="product-tab" data-toggle="tab" href="#product">Setting</a>                          
                        </nav>

                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="home">
                                <div>

                                    <div class="mb-3">
                                        <label for="exampleFormControlInput1" class="form-label">Name</label>
                                        <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Exam 1">
                                    </div>
                                    <div>
                                        Subject <br/>
                                        <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                            <option selected>Subject name</option>
                                            <option value="1">One</option>
                                            <option value="2">Two</option>
                                            <option value="3">Three</option>
                                        </select>
                                        <br/>
                                    </div>
                                    <br/>
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                Exam Level<br/>
                                                <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                                    <option selected>Medium</option>
                                                    <option value="1">One</option>
                                                    <option value="2">Two</option>
                                                    <option value="3">Three</option>
                                                </select>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="mb-3">
                                                    <label for="exampleFormControlInput1" class="form-label">Duration(minutes)</label>
                                                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="50">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <br/>
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="mb-3">
                                                    <label for="exampleFormControlInput1" class="form-label">Duration(minutes)</label>
                                                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="50">
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                Exam Level<br/>
                                                <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                                    <option selected>Medium</option>
                                                    <option value="1">One</option>
                                                    <option value="2">Two</option>
                                                    <option value="3">Three</option>
                                                </select>
                                            </div>

                                        </div>
                                    </div>
                                    <br/>

                                    <div class="col-sm-12">
                                        <div class="mb-3">
                                            <label for="exampleFormControlInput1" class="form-label">Description</label>
                                            <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Text box">
                                        </div>
                                    </div>
                                </div>

                                <button type="submit" value="">Submit</button>
                                <button type="submit" value="">Back</button>
                            </div>
                            <div class="tab-pane fade" id="product">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-sm-2">
                                            Tổng số câu hỏi: 
                                        </div>
                                        <div class="col-sm-5">
                                            <div class="mb-3">
                                                <label for="exampleFormControlInput1" class="form-label">Description</label>
                                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="50">
                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-sm-2">
                                            Loại câu hỏi: 
                                        </div>

                                        <div class="col-sm-2">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Theo Topic
                                                </label>
                                            </div>
                                        </div>

                                        <div class="col-sm-2">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Theo Group
                                                </label>
                                            </div>
                                        </div>  

                                        <div class="col-sm-2">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Theo Domain
                                                </label>
                                            </div>  
                                            <div/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br/>
                            <div>
                                Chọn số câu hỏi theo nhóm
                                <div class="hoi">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                                    <option selected>Tên nhóm lựa chọn 1</option>
                                                    <option value="1">One</option>
                                                    <option value="2">Two</option>
                                                    <option value="3">Three</option>
                                                </select>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Số câu
                                                </button>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Xóa
                                                </button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                                    <option selected>Tên nhóm lựa chọn 2</option>
                                                    <option value="1">One</option>
                                                    <option value="2">Two</option>
                                                    <option value="3">Three</option>
                                                </select>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Số câu
                                                </button>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Xóa
                                                </button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <select class="form-select form-select-sm" aria-label=".form-select-sm example">                                
                                                    <option selected>Tên nhóm lựa chọn 3</option>
                                                    <option value="1">One</option>
                                                    <option value="2">Two</option>
                                                    <option value="3">Three</option>
                                                </select>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Số câu
                                                </button>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit">
                                                    Xóa
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button type="submit" value="">Submit</button>
                    <button type="submit" value="">Back</button>

                </div>
                <div class="col-sm-1">

                </div>
            </div>
        </div>
            <%@include file="Footer.jsp" %>
            <footer class="footer">
                <div>1234</div>
            </footer>
            
            
    </body>
</html>
