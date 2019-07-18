<%-- 
    Document   : WelcomeUser
    Created on : 7 May, 2017, 12:10:48 AM
    Author     : purvanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELCOME PAGE</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css" />
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <link type="text/css" rel="stylesheet" href="css/font-awesome.css" /> 
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/my.css">
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" >
                <div class="container-fluid">
                <div class="navbar-header">
                          
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#abc">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#Home"><b>ICityGuide</b></a>
                </div>
                   <ul class="nav navbar-nav ">
                   
                </ul>
                    <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.html"><span class=" glyphicon glyphicon-home"></span> Home</a></li>
                    <li><a href="logout.jsp"><span  class=" glyphicon glyphicon-log-out"></span> Sign out</a></li>
                    
                </ul>
                </div>
            </nav>
        
        <!--Sidebar-->
        <div class="container col-lg-12 nopadding" style="padding-top: 50px;">
  <div class="row">
      <div class="col-lg-3 " style="background-color:#a8f3e3;" >
    <nav>
      <ul class="nav nav-pills nav-stacked" data-spy="affix" data-offset-top="205">
          
          <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">School Services <span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li class="dropdown-header">Central Board of Secondary Education</li>
            <li><a href="DalyCollege.jsp">Daly College</a></li>
            <li><a href="DelhiPublicSchool.jsp">Delhi Public School</a></li>
            <li><a href="EmeraldHeights.jsp">Emerald International School</a></li>
            <li><a href="AgarwalPublic.jsp">Agarwal Public School</a></li>
             <li><a href="Shishukunj.jsp">Shishukunj School</a></li>
          </ul>
        </li>
<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Hospital Services <span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li class="dropdown-header">Private Hospitals</li>
            <li><a href="#">Bombay Hospital</a></li>
            <li><a href="#">CHL Apollo</a></li>
            <li><a href="#">Choithram</a></li>
            <li class="dropdown-header">Government Hospitals</li>
             <li><a href="#">Maharaja Yashwant Hospital </a></li>
          </ul>
        </li>
<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">College Services <span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li class="dropdown-header">Engineering Institute</li>
            <li><a href="#">Indian Institute of research and technology</a></li>
            <li><a href="#">IIM Indore</a></li>
            <li><a href="#">IPS Indore</a></li>
            <li><a href="#">IET DAVV</a></li>
             <li><a href="#">SGSITS</a></li>
          </ul>
        </li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>
<li><a href=""></a></li>

      </ul>
    </nav>
      </div>
      <div class="col-lg-9"><h1 style="text-align: center"><strong>WELCOME USER <font style="color: #000099"><%=session.getAttribute("userid")%></font></strong></h1></div>
      </div>
  </div>
    </body>
</html>
