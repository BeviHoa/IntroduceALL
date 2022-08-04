<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Quiz Practice</title>
        <!-- Favicon-->
        <!--        <link rel="apple-touch-icon" sizes="180x180" href="asset/img/logo/apple-touch-icon.png" />
                <link rel="icon" type="image/png" sizes="32x32" href="asset/img/logo/favicon-32x32.png" />
                <link rel="icon" type="image/png" sizes="16x16" href="asset/img/logo/favicon-16x16.png" />
                <link rel="manifest" href="/asset/img/logo/site.webmanifest" />-->
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800&display=swap"
              rel="stylesheet" />
        <!-- CSS asset (includes Bootstrap)-->
        <link rel="stylesheet" href="assets/css/reset.css" />
        <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
        <!-- CSS slick-->
        <link rel="stylesheet" type="text/css" href="assets/css/slick.css" />
        <!-- CSS Core-->
        <link rel="stylesheet" href="assets/css/homepage.css" />

    </head>
    <body> 
        <jsp:include page="Header.jsp"></jsp:include>
            <!--Masthead-->
            <header class="masthead">
                <div class="container">
                    <div class="masthead-heading text-uppercase">Welcome To Quizz</div>
                    <div class="masthead-subheading text-uppercase">
                        Online learning system with thousands of quality courses
                    </div>
                    <a class="bt btn-color btn-xl text-uppercase" href="#">Show Me
                        More</a>
                </div>
            </header>
            <!--Portfolio-->
            <section class="portfolio">
                <!--Recommended Subject-->
                <div class="portfolio-category">
                    <h2 class="portfolio-title">Lastest</h2>
                    <ul class="portfolio-list">
                    <c:forEach items="${subLatest}" var="l">
                        <li class="portfolio-item">
                            <div class="thumb">
                                <img class="sjt-img" src=${l.getThumbnail()} alt="subject_image" />
                            </div>
                            <div class="sjt-info">
                                <div class="sjt-name">${l.getTitle()}</div>
                                <div class="sjt-des">
                                    <div class="sjt-gnr">
                                        <p>${l.getOwner()}}</p>
                                        <p>${l.getTagline()}</p>
                                    </div>
                                    <a type="button" class="sjt-btn text-uppercase"
                                       href="subjectdetail?SubID=${l.getId()}">View</a>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <!--Popular Subject-->
            <div class="portfolio-category">
                <h2 class="portfolio-title">Recommended</h2>
                <ul class="portfolio-list">
                    <c:forEach items="${subRecom}" var="r">
                        <li class="portfolio-item">
                            <div class="thumb">
                                <img class="sjt-img" src=${r.getThumbnail()} alt="subject_image" />
                            </div>
                            <div class="sjt-info">
                                <div class="sjt-name">${r.getTitle()}</div>
                                <div class="sjt-des">
                                    <div class="sjt-gnr">
                                        <p>${r.getOwner()}}</p>
                                        <p>${r.getTagline()}</p>
                                    </div>
                                    <a type="button" class="sjt-btn text-uppercase"
                                       href="subjectdetail?SubID=${r.getId()}">View</a>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <!--          
            <!-- Blog preview section-->
            <div class="container my-5">
                <div class="row gx-5" style="width:100%; margin-bottom: 10px;">
                    <div class="col-lg-8 col-xl-6">
                        <div class="pull-left">
                            <h3 class="fw-bolder">Blog</h3>
                        </div>

                    </div>
                    <div class="col-lg-8 col-xl-6">
                        <div>
                            <a class="btn btn-color btn-xl text-uppercase" style="float: right;" href="bloglist">Show Me More</a>
                        </div>
                    </div>
                </div>
                <div class="row gx-5">
                    <c:forEach items="${bloglist}" var="x">
                        <div class="col-lg-4 mb-5">
                            <div class="card h-100 shadow border-0">
                                <img class="card-img-top" id="card-img-blog" src="${x.thumbnail}"
                                     alt="Blog Image" />
                                <div class="card-body p-4">
                                    <c:forEach items="${catelist}" var="v">        
                                        <c:if test="${v.cateid==x.category}">
                                            <span class="badge badge-pill badge-primary"><a class="tag" href="#" title="" style="color: white">${v.catename}</a></span>
                                            </c:if>
                                        </c:forEach>
                                    <a class="text-decoration-none link-dark stretched-link"
                                       href="blogdetails?id=${x.id}">
                                        <h5 class="card-title mb-3">${x.title}</h5>
                                    </a>
                                    <p class="card-text mb-0">${x.brief_info}</p>
                                </div>
                                <div class="card-footer p-4 pt-0 bg-transparent border-top-0">
                                    <div class="d-flex align-items-end justify-content-between">
                                        <div class="d-flex align-items-center">
                                            <div class="small">
                                                <div class="fw-bold">${x.author}</div>
                                                <div class="text-muted">${x.postdate}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>


        <!--Footer-->
        <jsp:include page="Footer.jsp"></jsp:include>

        <!-- Js asset -->
        <script src="assets/JQuery/JQuery.js"></script>
        <script src="assets/js/subject/vendor.js"></script>
        <script src="assets/js/subject/main.js"></script>
        <script type="text/javascript" src="assets/js/slick.min.js"></script>
        <!-- Js Core-->
        <script src="assets/js/homepage.js"></script>
        <script src="assets/js/connection.js"></script>

    </body>
</html>