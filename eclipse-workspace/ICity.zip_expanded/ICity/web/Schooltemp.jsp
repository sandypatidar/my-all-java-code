<%-- 
    Document   : Schooltemp
    Created on : 4 May, 2017, 3:05:36 PM
    Author     : purvanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

            <p>     </p>
                </div>
                <div class="col-lg-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            CONTACT US
                        </div>
                        <div class="panel-body">
                          

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                           
                           </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
