<%-- 
    Document   : reviewQuiz
    Created on : May 24, 2022, 10:27:37 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            td {
                display: table-cell;
               
            }
            table {
                border-collapse: collapse;
            }
            table {
               
                text-indent: initial;
                border-spacing: 2px;
            }
        </style>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@include file="Header.jsp" %>
    <body>
        <table >
            <tbody>
                <tr>
                    <th class="cell" scope="row" id=""> Started on</th>
                    <td class="cell" id="">Monday, 11 September 2010 11:09AM</td>
                </tr>
                <tr>
                    <th class="cell" scope="row" id="">State</th>
                    <td class="cell" id="">Finished</td>
                </tr>
                <tr>
                    <th class="cell" scope="row" id="">Completed on</th>
                    <td class="cell" id="">Monday, 11 September 2010 11:39AM</td>
                </tr>
                <tr>
                    <th class="cell" scope="row" id="">Time taken</th>
                    <td class="cell" id="">30mins</td>
                </tr>
                <tr>
                    <th class="cell" scope="row" id="">Marks</th>
                    <td class="cell" id="">30.00/35.00</td>
                </tr>
                <tr>
                    <th class="cell" scope="row" id="">Grade</th>
                    <td class="cell" id="">7.58 out of 10.00(79%)</td>
                </tr>
            </tbody>
        </table>

        <div class="info">
            <h3 class="no">Question </h3>
            <span class="qno">1</span>
            <div class="state">Complete</div>
            <div class="grade">Mark 1.00 out of 1.00</div>
            <div class="">Complete</div>
        </div>

        <div class="content">
            <div class="qtext">The collection and summarization of the 
                socioeconomic and physical characteristics of the 
                employees of a particular firm is an example of</div>
        </div>
        <div class="ablock">
            <div class="prompt">Select one: </div>
            <div class="answer">
                <div class="r0">
                    <input type="radio" name="" value="" >
                    <label class="m-1-1">
                        <span class="anser number">a. </span>
                        "a statistic."
                    </label>
                </div>
                <div class="r1">
                    <input type="radio" name="" value="" >
                    <label class="m-1-1">
                        <span class="anser number">b. </span>
                        "inferential statistics."
                    </label>
                </div>
                <div class="r3">
                    <input type="radio" name="" value="" >
                    <label class="m-1-1">
                        <span class="anser number">c. </span>
                        "descriptive statistics."
                    </label>
                </div>
                <div class="r4">
                    <input type="radio" name="" value="" >
                    <label class="m-1-1">
                        <span class="anser number">d. </span>
                        "a parameter."
                    </label>
                </div>

                <div class="outcome">
                    <div class="feedback">
                        <div class="rightansert">The correct anser is: descriptive statistics.</div>
                    </div>
                </div>
            </div>

        </div>
        <div class="submitreview">
            <a class="" href="#">Finish review</a>
        </div>
        <section class="block block_fake card mb-3" role="navigation">
            <div class="card-body p-3">
                <span>Quiz navigation</span>
                <div class="card-text"></div>
            </div>
            <a class="qnbutton complete free btn btn-secondary thispage" id="quizavbutton1" title="Complete" data-quiz-page="0" href="#">
                <span class="thispageholder" id=""></span>
                <span class="trafficclight"></span>
                <span class="accesshide">Question</span>
                "1"
                <span class="accesshide">
                    " This page "
                    <span class="flagstate"></span>
                </span>             
            </a>
            <a class="qnbutton complete free btn btn-secondary thispage" id="quizavbutton1" title="Complete" data-quiz-page="0" href="#">
                <span class="thispageholder" id=""></span>
                <span class="trafficclight"></span>
                <span class="accesshide">Question</span>
                "2"
                <span class="accesshide">
                    " This page "
                    <span class="flagstate"></span>
                </span>             
            </a>
        </section>


    </body>
</html>
