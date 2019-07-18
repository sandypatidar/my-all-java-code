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
        <title>HOTEL LEMON TREE, INDORE</title>
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
            <img src="hotels/lemon logo.jpg" alt="lemon tree" align="right" style="padding-bottom:25px;"/><br>
            <font color="GREEN" SIZE="100" style="text-align:center"><b>LEMON TREE </b></font>   <font color="YELLOW" SIZE="50" style="text-align:center"><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star"></font> 

        </div>
        <div class="container">
       <div class="row">
                <div class="col-lg-8" style="text-align:justify;">
                        
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="hotels/lemon 1.jpg" style="width:100%">
  <div class="text">Front view</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="hotels/lemon2.jpg" style="width:100%">
  <div class="text">food</div>
</div>
    


<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="hotels/lemon3.jpg" style="width:100%">
  <div class="text">room</div>
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
         
            <img src="hotels/lemon 1.jpg" alt="lemon tree" align="middle" style="padding-bottom:25px;"/><br>
      
            
    <ul class="dropdown-menu"><p><b>
        One of the nicest and most elegant accommodations in the area, the Lemon Tree Hotel Indore promises an unforgettable stay with unparalleled service from our staff, embodying the Yes I Can!SM attitude. 
       
When work allows, stretch out in comfortable accommodations with modern amenities like Free high-speed, wireless Internet, and then come by one of our four restaurants for a decadent dining experience. In the evenings, let the live music in the Lobby Bar lure you to unwind with a beer or glass of wine.

        </p>
</ul>
    
</div>

<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"> <font <span class="glyphicon glyphicon-cutlery"   color="white" SIZE="25" style="text-align:center">  Restaurants</font> 
    
        <span class="caret"></span></button>
        <img src="hotels/lemon3.jpg" alt="lemon tree" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b>Rooms & Suites
Lemon Tree Hotel, Indore, with 100 bright rooms and suites, offers you a wide array of accommodation options at an unbeatable value. These cozy rooms are designed to give you a great night’s sleep with an orthopaedic mattress, excellent sound insulation and near-perfect black-out curtains. The rooms offer you ‘close to home’ comfort and keep that spring in your step, when you travel on business.

We help make your stay ‘just right’ with our WiFi, satellite television, mini bars and well appointed bathrooms with bathtubs, including one for differently abled guests. The rooms also have a workstation and an ergonomically designed chair, to make business on the go productive.
</p>
</ul>
    
</div>
<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">   <font <span class="glyphicon glyphicon-home" color="white" SIZE="25" style="text-align:center">  Room Service</font>  
    
        <span class="caret"></span></button>
<img src="hotels/lemon2.jpg" alt="lemon tree" align="middle" style="padding-bottom:25px;"/><br>
    <ul class="dropdown-menu"><p><b>
        Restaurants
Lemon Tree Hotel, Indore, with its dining outlets, offers an array of treats that are as unique as their ambience and decor. Explore lip smacking delights at our multi-cuisine café or unwind with your favorite cocktail at our recreation bar.
 
Citrus Café
•	 Multi-Cuisine
•	 Ghar Ka Khaana/ Home-Style Food
•	 Local Specialities
Your taste buds will travel the world at this bright and inviting multi-cuisine restaurant with its eclectic Indian and international menu. What’s more, we have also snuck in a ‘ghar ka khaana’menu – to cheer up those occasional lonesome moments.
 
Slounge
•	 Bar
•	 Finger Food
•	 Unwind
If you are looking for a fun memorable way to chill or a spirited night out – all you have to do is walk in.  Grab a drink of your choice at this hip recreation bar that has a pool table, PlayStation and a playlist of your favorite tunes.


        
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
<span class="glyphicon glyphicon-phone " style="color:green"></span><font color="green">Phone:</font> 0731 442 3232 <br>
                         

                        </div>
                        
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            VISIT US
                        </div>
                        <div class="panel-body">
                            <img src="image/ememap.png" class="img-thumbnail" width="400">
                           <span class="glyphicon glyphicon-map-marker"style="color:green"></span><font color="green">Location:</font>3, R.N.T. Road, Indore, Madhya Pradesh 452001

                           </div>
                    </div>
                </div>
            </div>
            
            
        </div>
       
</body>
</html>
