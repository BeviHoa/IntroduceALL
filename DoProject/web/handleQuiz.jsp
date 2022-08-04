<%-- 
    Document   : quizreview
    Created on : May 21, 2022, 11:25:16 PM
    Author     : Admin
--%>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        body{
            background-color:#eee;
        }

        label.radio {
            cursor: pointer;
            text-align: center;
            color: red;
        }
        radio{
            text-align: center;
        }
        label.radio input {
            position: absolute;
            top: 0; 
            left: 0;
            visibility: hidden;
            pointer-events: none;
        }

        label.radio span {
            padding: 4px 0px;
            border: 1px solid red;
            display: inline-block;
            color: red;
            width: 100px;
            text-align: center;
            border-radius: 3px;
            margin-top: 7px;
            text-transform: uppercase;
        }

        label.radio input:checked + span {
            border-color: red;
            background-color: red;
            color: #fff;
        }

        .ans {
            margin-left: 36px !important;
        }

        .btn:focus {
            outline: 0 !important;
            box-shadow: none !important;
        }

        .btn:active {
            outline: 0 !important;
            box-shadow: none !important;
        }
        .pagination{
            justify-content: center;
            margin-top: 20px
        }
        .pagination a {
            color: black;
            float: left;
            padding: 8px 16px;
            text-decoration: none;
            transition: background-color .3s;
        }
        /* set the style for the active class */
        .pagination a.active {
            background-color: dodgerblue;
            color: white;
        }
        /* add background color when user hovers on inactive class */
        .pagination a:hover:not(.active) {
            background-color: #ddd;
        }
        .pagination{
            background-color: white;
            margin: 20px;

        }
        .form-check{
            padding-left: 120px;
        }
    </style>
</head>

<div class="container">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Quiz Handle</a>
        </div>
    </nav>
</div>
<div class="container mt-5">
    <div class="d-flex justify-content-center row">
        <div class="col-md-10 col-lg-10">
            <div class="border">
                <div class="question bg-white p-3 border-bottom">
                    <div class="d-flex flex-row justify-content-between align-items-center mcq">
                        <h4>MCQ Quiz</h4><span>(5 of 20)</span></div>
                </div>
                <div class="question bg-white p-3 border-bottom">
                    <div class="d-flex flex-row align-items-center question-title">
                        <h3 class="text-danger">Q.</h3>
                        <h5 class="mt-1 ml-2">Which of the following country has largest population?</h5>
                    </div><div class="ans ml-2">
                        <label class="radio"> <input type="radio" name="brazil" value="brazil"> <span>Brazil</span>
                        </label>    
                    </div><div class="ans ml-2">
                        <label class="radio"> <input type="radio" name="Germany" value="Germany"> <span>Germany</span>
                        </label>    
                    </div><div class="ans ml-2">
                        <label class="radio"> <input type="radio" name="Indonesia" value="Indonesia"> <span>Indonesia</span>
                        </label>    
                    </div><div class="ans ml-2">
                        <label class="radio"> <input type="radio" name="Russia" value="Russia"> <span>Russia</span>
                        </label>    
                    </div></div>
                <div class="d-flex flex-row justify-content-between align-items-center p-3 bg-white"><button class="btn btn-primary d-flex align-items-center btn-danger" type="button"><i class="fa fa-angle-left mt-1 mr-1"></i>&nbsp;Previous</button><button class="btn btn-primary border-success align-items-center btn-success" type="button">Next<i class="fa fa-angle-right ml-2"></i></button></div>


                <div class="question bg-white p-3 border-bottom">
                    <div class="mt-1 ml-2">
                        <div class="pagination">
                            <a  href="#">«</a>
                            <a  href="#">1</a>
                            <a  class="active" href="#">2</a>
                            <a  href="#">3</a>
                            <a  href="#">4</a>
                            <a  href="#">5</a>
                            <a href="#">6</a>
                            <a href="#">»</a>
                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>


    <div class="form-check">
       
            <div>
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                <a href="#">
                    I want to submit
                </a>
            </div>
       
    </div>

</div>
