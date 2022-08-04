<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/rSlider.min.css">
    <script src="js/rSlider.min.js"></script>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <!--end of menu-->
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                                <li class="breadcrumb-item"><a href="#">Category</a></li>
                                <li class="breadcrumb-item active" aria-current="#">Sub-category</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                <jsp:include page="left.jsp"></jsp:include>

                    <div class="col-sm-9">
                        <form action="SearchRange" method="post">
                            <div data-role="rangeslider">
                                <input type="text" name="slider" id="sampleSlider" /> 
                                <button type="submit">Search</button>
                            </div>
                        </form>
                        <br>
                        <div class="row">
                        <input type="text" name="slider" id="sampleSlider" />
                        <c:forEach  items="${listP}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                        <p class="card-text show_txt">${o.title}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.price} $</p>
                                            </div>
                                            <div class="col">
                                                <a href="cart?id=${o.id}" title="View Product" class="btn btn-primary">Buy</a>

                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>

                        </c:forEach>
                    </div>


                </div>

            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
    <script type="text/javascript">  
var mySlider = new rSlider({
        target: '#sampleSlider',
//        values: [2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015],
values: {min:0, max:2013},
        range: true,
        tooltip: true,
        scale: true,
        labels: true,
        step: 1,
        set: [2010, 2013]
    });
</script>
</html>

