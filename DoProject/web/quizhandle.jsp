<%-- 
    Document   : quizhandle
    Created on : May 20, 2022, 9:15:01 AM
    Author     : Admin
--%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<head>
    <style type="text/css">
        .hoa{
            text-align: center;
        }
        
        .footer{
            text-align: center;
            background-color: #eee;
            margin-top: 100px;
            color: black;
            padding-bottom: 100px;
            padding-top: 10px;
        }
    </style>
</head>
<div class="container-fluid bg-info">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3><span class="label label-warning" id="qid">Number question and question</span></h3>
            </div>
            <div class="modal-body">
                <div class="col-xs-3 col-xs-offset-5">
                    <div id="loadbar" style="display: none;">
                        <div class="blockG" id="rotateG_01"></div>
                        <div class="blockG" id="rotateG_02"></div>
                        <div class="blockG" id="rotateG_03"></div>
                        <div class="blockG" id="rotateG_04"></div>
                        <div class="blockG" id="rotateG_05"></div>
                        <div class="blockG" id="rotateG_06"></div>
                        <div class="blockG" id="rotateG_07"></div>
                        <div class="blockG" id="rotateG_08"></div>
                    </div>
                </div>

                <div class="quiz" id="quiz" data-toggle="buttons">
                    <label class="element-animation1 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="1">1 A</label>
                    <label class="element-animation2 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="2">2 B</label>
                    <label class="element-animation3 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="3">3 C</label>
                    <label class="element-animation4 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="4">4 D</label>
                </div>
            </div>
            <div class = "hoa">
                <input type="SUBMIT" value="SUBMIT" />
            </div>


            <div class="modal-footer text-muted">
                <span id="answer"></span>

            </div>
        </div>
    </div>

</div>
<div class="footer">
    <footer>
        Good Luck!
    </footer>
</div>