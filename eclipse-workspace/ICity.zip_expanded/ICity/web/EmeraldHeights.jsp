<%-- 
    Document   : EmeraldHeights
    Created on : 28 Apr, 2017, 4:36:26 PM
    Author     : vinodjain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Emerald Heights International</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css" />
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/slideshow.js"></script>
        <link type="text/css" rel="stylesheet" href="css/font-awesome.css" /> 
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/my.css">
        <link rel="stylesheet" href="css/slideshow.css">
        
        
       
    </head>
    <body> 
        
       
        <div class="container-fluid">
            <img src="image/emelogo.png" alt="Emerald  Heights" align="middle" style="padding-bottom:25px;"/>
        </div>
        <div class="container">
       <div class="row">
                <div class="col-lg-8" style="text-align:justify;">
                        
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="image/eme1.jpg" style="width:100%">
  <div class="text">Front view</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="image/eme2.jpg" style="width:100%">
  <div class="text">Disney world</div>
</div>


<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="image/eme3.jpg" style="width:100%">
  <div class="text">Auditoriam</div>
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

<p><b>“The First International School of Madhya Pradesh”</b><br>
    Emerald Heights, founded in 1982 is the first international, co-educational English medium school with residential facility in Madhya Pradesh. Drawing inspiration from Sri Aurobindo and the Mother, it undertook to work out and develop a scheme of integral education compatible with the contemporary needs. Since its establishment, the students of school have made their mark in academics and sports. The outstanding performance of the school is borne out by merit lists every year and several coveted trophies in academics, dramatics, music, dance, fine arts, and various indoor and outdoor sports. The Emerald Heights International School stands tallest in central India as an educational institution with a global ambience. With a reputation for creating future oriented global youth, who adorn the society with their scholastic achievements and possess an invincible drive to excel in every sphere of life, it has cultivated an environment which provides its students intellectual exposure with many avenues to reach their goals successfully and express their creativity and talents.<br>
<br>Emerald Heights is affiliated to Central Board of Secondary Education (CBSE), New Delhi - An autonomous organization under the ministry of Human Resource Development, Govt. of India and Cambridge International Examination (CIE), one of the world’s leading provider of educational qualification and assessments.

<br><br>The Emerald Heights International School offers its students in India, Internationally renowned qualifications that are recognized by educational institutions and employers across the globe. The school provides its students with the opportunity to gain global exposure by affiliating itself with institutions like AFS, British Council School Award, Lead America, IAYP (International Award for Young People) and Harvard University Model United Nations. Our aim through these program is to prepare our students to get globally recognized.
    </p>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            CONTACT US
                        </div>
                        <div class="panel-body">
 <span class="glyphicon glyphicon-phone " style="color:green"></span><font color="green">Phone:</font>8720009992 <br>
<span class="glyphicon glyphicon-envelope"style="color:green"></span><font color="green">Fax:</font> 0731-4059046<br>
<span class="glyphicon glyphicon-envelope"style="color:green"></span><font color="green">Email:</font> info@emeraldheights.edu.in
                         

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                            <img src="image/ememap.png" class="img-thumbnail" width="400">
                           <span class="glyphicon glyphicon-map-marker"style="color:green"></span><font color="green">Location:</font> Emerald Heights International School <br>
Opposite Akashwani,A.B Road,Rau
Indore-453331 (M.P) <br>
                           </div>
                    </div>
                </div>
            </div>
        </div>
       
</body>
</html>
