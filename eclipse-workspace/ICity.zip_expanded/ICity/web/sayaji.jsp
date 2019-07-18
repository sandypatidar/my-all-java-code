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
        <title>HOTEL SAYAJI, INDORE</title>
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
            <img src="hotels/sayajilogo.jpeg" alt="sayaji" align="middle" style="padding-bottom:25px;"/><br>      
            <font color="GREEN" SIZE="100" style="text-align:center"><b>SAYAJI </b></font>   <font color="YELLOW" SIZE="100" style="text-align:center"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"></span></font> 

        </div>
        <div class="container">
       <div class="row">
                <div class="col-lg-8" style="text-align:justify;">
                        
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="hotels/sayaji1.jpg" style="width:100%">
  <div class="text">Front view</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="hotels/sayaji2.jpg" style="width:100%">
  <div class="text">rooms</div>
</div>
    


<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="hotels/sayaji3.jpg" style="width:100%">
  <div class="text">foodzone</div>
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
<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" >     <font <span class="glyphicon glyphicon-bell" color="white" SIZE="25" style="text-align:center">  Local Attractions</font> 
    
        <span class="caret" ></span></button><br></br>
         
            <img src="hotels/sayaji1.jpg" alt="sayaji" align="middle" style="padding-bottom:25px;"/><br>
      
            
            <ul class="dropdown-menu"><p><b>"Located in Indore, Central India's financial capital, Sayaji Hotel reflects the city's spirit in a harmonious blend of tradition and contemporary sophistication. What sets us apart from other business hotels is our personalized service, attention to details and ability to cater to your business needs. Exquisite interiors, impeccable services and delectable cuisines combine to make us Central India's most graceful and elegant hotel. The hotel is ideal for business travel or holidays to explore the cultural wonders of Central India and Indore.<br>
                        
                        In a short span of a decade , we have created a chain of hospitality properties in the heart of India, creating to the discerning business or family traveller.
                        </br>      "
        
                </p>
</ul>
    
</div>

<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"> <font <span class="glyphicon glyphicon-cutlery"   color="white" SIZE="25" style="text-align:center">  Restaurants</font> 
    
        <span class="caret"></span></button>
        <img src="hotels/sayaji3.jpg" alt="sayaji" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b> Hotel Sayaji offers a range of dining options that suit different needs. From the casual dining experience at the coffee shop to the discerning choice of traditional Dum Pukhit cuisine of Awadh and authentic Chinese food at Chopstick City to the unlimited abundance of a pool side grille with a live kitchen, or a luxurious longue for the guests. You can take your pick!
        
        
        
        
        
        </p>
</ul>
    
</div>
<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">   <font <span class="glyphicon glyphicon-home" color="white" SIZE="25" style="text-align:center">  Room Service</font>  
    
        <span class="caret"></span></button>
<img src="hotels/sayaji2.jpg" alt="sayaji" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b>
        Feel the Midas touch of Hospitality, check-in , sit back and relax! Many a times you must wonder whether you will ever be able to do it, when everything you want happens with one touch. Some magic at an idyllic haven! Why not just sit back and relax because that haven is Sayaji.
        Watch movies, listen to your favorite music, swap channels, lower the room temperature or switch on or off the lights with a single touch. Enjoy a host of features on your i-remote, exclusively available at Sayaji. 
        </p>
</ul>
    
</div>


                </div>
                <div class="col-lg-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            CONTACT US
                        </div>
                        <div class="panel-body">
<span class="glyphicon glyphicon-phone " style="color:green"></span><font color="green">Phone:</font>0731 400 6666<br>
                         

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                            <img src="image/ememap.png" class="img-thumbnail" width="400">
<span class="glyphicon glyphicon-map-marker"style="color:green"></span><font color="green">Location:</font>H/1, Scheme No.54, Vijay Nagar, Indore, Madhya Pradesh 452010111111
<br>
                           </div>
                    </div>
                </div>
            </div>
            
            
        </div>
       
</body>
</html>
