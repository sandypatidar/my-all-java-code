<%-- 
    Document   : DelhiPublicSchool
    Created on : 28 Apr, 2017, 4:17:38 PM
    Author     : vinodjain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delhi Public School</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css" />
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <link type="text/css" rel="stylesheet" href="css/font-awesome.css" /> 
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/my.css">
        <link rel="stylesheet" type="text/css" href="css/slideshow.css">
    </head>
    <body>
        <div class="container-fluid">
            <img src="image/dpslogo.png" alt="Dps_Logo" align="middle" style="padding-bottom:25px;"/>
        </div>
        <div class="container">
       <div class="row">
                <div class="col-lg-8" style="text-align:justify;">
                        
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="image/Dps1.jpg" style="width:100%">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="image/Dps2.jpg" style="width:100%">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="image/Dps3.jpg" style="width:100%">
  <div class="text">Caption Three</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex> slides.length) {slideIndex = 1;}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

            <p>"You can teach a student a lesson for a day; but if you can teach him to learn by creating curiosity, he will continue the learning process as long as he lives."

DPS, Indore an English medium school is affiliated to the CBSE, New Delhi. The school has classes from nursery to class 12th. The academic year begins in the month of April every year.

At DPS, Indore we ensure our students are less burdened by the weight of the books and concentrate more on the learning, hence we abide by the practical methods of teaching varying from one level to another. Students enjoy this change in the teaching methodology, which also makes them more active at each level.

At the primary level different games and attractive infrastructure assures students attention. For the higher education the classes have been designed as per the modern technology driven environment by Introducing Educomp Smart Class which has made class room learning an experience of its kind.

From the classes 3rd onwards a weekly assessment system and three examinations in a year, divided in three months each, is followed which builds on the students learning and development process.

DPS uses efficient and interactive methods of learning like Continuous and Comprehensive Evaluation System and NCERT for the senior classes.

For the 10+2 students, the school provides different specializations like the Science (Mathematics & Biology), Commerce & Humanities.

                    </p>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            CONTACT US
                        </div>
                        <div class="panel-body">
                          
<span class="glyphicon glyphicon-phone " style="color:green"></span><font color="green">Phone:</font> 0731-6611000, 6611050 <br>
<span class="glyphicon glyphicon-envelope"style="color:green"></span><font color="green">Fax:</font> 0731-4064403 <br>
<span class="glyphicon glyphicon-envelope"style="color:green"></span><font color="green">Email:</font> dpsind@dpsindore.org, admin@dpsindore.org, hr@dpsindore.org

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                            <img src="image/dpsmap.png" class="img-thumbnail" width="400">
                                       <span class="glyphicon glyphicon-map-marker"style="color:green"></span><font color="green">Location:</font>Pipliakumar - Nipania Road, Village - Nipania<br>
Indore (M.P) <br>
                           </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
