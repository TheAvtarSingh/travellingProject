<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>TravelWithMe - #1 Travel Booking Website  </title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" >
      
      <link  href="<c:url value="/resources/css/style.css"/>"rel="stylesheet">
      
      
       <link  href="<c:url value="/resources/css/responsive.css"/>"rel="stylesheet">
       
       
      <!-- fevicon -->
      <link href="<c:url value="/resources/images/fevicon.png"/>" type="image/gif" rel="icon"/>
      <!-- Scrollbar Custom CSS -->
      <link href="<c:url value="/resources/css/jquery.mCustomScrollbar.min.css"/>"rel="stylesheet"/>
     
      </head>
        <body class="main-layout">
     
      <header>
         <!-- header inner -->
         <div class="header">
            <div class="header_white_section">
               <div class="container-fluid">
                  <div class="row">
                     <div class="col-md-12">
                        <div class="header_information">
                           <ul>
                              <li><img src="<c:url value="/resources/images/1.png" />"/>CyberCity , Gurugram, Haryana</li>
                              <li><img src="<c:url value="/resources/images/2.png"/>"/> +91 8766244765</li>
                              <li><img src="<c:url value="/resources/images/3.png" />"/> mailus@twm.com</li>
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
            <div class="container">
               <div class="row">
                  <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                     <div class="full">
                        <div class="center-desk">
                      
                           <div class="logo"> <a href="#"><img src="<c:url value="/resources/images/logo.png"/>"/></a> </div>
                        </div>
                     </div>
                  </div>
                  <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                     <div class="menu-area">
                        <div class="limit-box">
                           <nav class="main-menu">
                              <ul class="menu-area-main">
                                 <li class="active"> <a href="#">Home</a> </li>
                                 <li> <a href="#about">About</a> </li>
                                 <li><a href="#travel">Travel</a></li>
                                 <li><a href="#blog">Blog</a></li>
                                 <li><a href="#contact">Contact Us</a></li>
                              </ul>
                           </nav>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- end header inner -->
      </header>
      <!-- end header -->
      
      
      
      <h1><b> Updation Form : ${name}</b></h1>
      
<div align="center">

<hr> <br>
	
	<form:form action="updatemybookings" method="post" modelAttribute="bookingDetails">
        <label for="hotelid">Hotel Number(*)</label>
	<form:input type="number" path="hotelid" />
	<form:errors path="hotelid" cssClass="error"/><br><br>
	
	<label for="roomNumbers">No of Rooms For that You want to Book : (*)</label>
	<form:input type="number" path="roomNumbers" /> 
	<form:errors path="roomNumbers" cssClass="error"/><br><br>
	
	<label for="noofdays">No of Days (Stay)(*)</label>
	<form:input type="number" path="noofdays" /> 
	<form:errors path="noofdays" cssClass="error"/><br><br>
	
	
	<label for="needCarParking">Need of Car Parking(*)</label>
    <form:select name="needCarParking" path="needCarParking">
        <option value="Y">Yes</option>
        <option value="N">No</option>
    </form:select>
    <br><br>
	
	<label for="needFoodService">Need of Food Service(*)</label>
    <form:select name="needFoodService" path="needFoodService">
        <option value="Y">Yes</option>
        <option value="N">No</option>
    </form:select>
    <br><br>
    <label for="needGamingService">Need of Gaming Service(*)</label>
    <form:select name="needGamingService" path="needGamingService">
        <option value="Y">Yes</option>
        <option value="N">No</option>
    </form:select>
    <br><br>
     <label for="needSecurity">Need of Security Service(*)</label>
    <form:select name="needSecurity" path="needSecurity">
        <option value="Y">Yes</option>
        <option value="N">No</option>
    </form:select>
	<br><br>
		<label for="panNumber">Provide Your Pancard Number(For Security Purposes)(*)</label>
	<form:input type="text" path="panNumber" /> 
	<form:errors path="panNumber" cssClass="error"/><br><br>
	<br><br>
	
	<label for="noofPersons">No of Persons [Max 10](Stay)(*)</label>
	<form:input type="number" path="noofPersons" /> 
	<form:errors path="noofPersons" cssClass="error"/><br><br>
	
	<br><br>
	
	
	<input type="submit" value="submit" />
		
	</form:form>


	<br><br>
	 <a href = "/travellingProject" >Go To Home</a> 
		 <a href = "userHomeDashboard" >Go To Dashboard</a> 
	</div>
</body>
</html>