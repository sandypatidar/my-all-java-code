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
        <title>HOTEL RADDISON BLUE, INDORE</title>
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
            <img src="hotels/raddison logo.png" alt="raddison" align="middle" style="padding-bottom:25px;"/>
            <font color="GREEN" SIZE="100" style="text-align:center"><b>Raddison Blue </b></font>   <font color="YELLOW" SIZE="100" style="text-align:center"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"><span class="glyphicon glyphicon-star"></span></font> 
        </div>
        <div class="container">
       <div class="row">
                <div class="col-lg-8" style="text-align:justify;">
                        
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="hotels/raddison1.jpg" style="width:100%">
  <div class="text">Front view</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="hotels/raddison2.jpg" style="width:100%">
  <div class="text">Disney world</div>
</div>
    


<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="hotels/radisson3.jpg" style="width:100%">
  <div class="text">Auditorium</div>
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
         
            <img src="hotels/raddison1.jpg" alt="raddison" align="middle" style="padding-bottom:25px;"/><br>
      
            
    <ul class="dropdown-menu"><p><b>
        One of the nicest and most elegant accommodations in the area, the Radisson Blu Hotel Indore promises an unforgettable stay with unparalleled service from our staff, embodying the Yes I Can!SM attitude. Our location is only a 20-minute drive from the Devi Ahilyabai Holkar Airport (IDR), making arrivals and departures less of a hassle. Coming to Indore to meet with clients? We’re also close to the industrial towns of Devas and Pithampur.

When work allows, stretch out in comfortable accommodations with modern amenities like Free high-speed, wireless Internet, and then come by one of our four restaurants for a decadent dining experience. In the evenings, let the live music in the Lobby Bar lure you to unwind with a beer or glass of wine.

With over 3,250 square meters of meeting space with sophisticated interiors and state-of-the-art technology, the Radisson Blu also stands out as one of the best meeting and event venues in Indore. Before leaving, be sure to visit our rooftop pool, spa and salon, featuring dazzling city views and revitalizing experiences.

        </p>
</ul>
    
</div>

<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"> <font <span class="glyphicon glyphicon-cutlery"   color="white" SIZE="25" style="text-align:center">  Restaurants</font> 
    
        <span class="caret"></span></button>
        <img src="hotels/radisson3.jpg" alt="raddison" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b>
        FOUR MODERN RESTAURANTS WITH DELICIOUS CUISINE
At the Radisson Blu in Indore, guests can indulge in fresh international dishes, flavorful options from India, exquisite Chinese offerings and decadent desserts without ever leaving the hotel. Begin each day at The Creative Kitchen for a filling buffet before morning meetings, and in the evenings, choose from the bold spices at Indiya Oye or the intriguing atmosphere of Ni Hao. For important business dinners, Ni Hao also offers private dining rooms that can be reserved. After dinner, be sure to stop by Cakewalk for a light and buttery sweet treat before heading to your comfortable room or suite.

                
                </p>
</ul>
    
</div>
<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">   <font <span class="glyphicon glyphicon-home" color="white" SIZE="25" style="text-align:center">  Room Service</font>  
    
        <span class="caret"></span></button>
<img src="hotels/raddison2.jpg" alt="raddison" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b>
        COMFORTABLE HOTEL ROOMS AND SUITES IN INDORE
Each chic room and suite at the Radisson Blu Hotel Indore offers a soothing color palette and stylish furnishings, as well as modern amenities like Free high-speed, wireless Internet and thermostat-controlled air conditioning. Coming to Indore for work? Ask about our two Business Class floors, offering exclusive access to the Business Class Lounge, for a more productive visit. Guests celebrating anniversaries can upgrade to a suite for posh bathrooms with steam-function showers and deep whirlpool tubs. If you require non-smoking, accessible or interconnecting rooms, a baby crib or a rollaway bed, please let us know.

        
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
                            <span class="glyphicon glyphicon-phone " style="color:green"></span><font color="green">Phone:</font>0731 473 8888<br>                         

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                            <img src="image/ememap.png" class="img-thumbnail" width="400">
                        <span class="glyphicon glyphicon-map-marker"style="color:green"></span><font color="green">Location:</font> 12, Scheme No. 94C, Ring Road, Indore, Madhya Pradesh 452010 <br>

                           </div>
                    </div>
                </div>
            </div>
            
            
        </div>
       
</body>
</html>
