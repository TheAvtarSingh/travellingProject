<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      
      <h1><b>  Hotel List</b></h1>
      
<div align="center">
<table border=1>
		<thead>
		
			<tr>
			
				<td><i><b>Hotel ID</b></i></td>
				<td><i><b>Number Of Rooms</b></i></td>
				<td><i><b>Number of Days</b></i></td>
					<td><i><b>Car Parking</b></i></td>
						<td><i><b>Food Service</b></i></td>
							<td><i><b>Gaming Service</b></i></td>
								<td><i><b> Pan Number</b></i></td>
									<td><i><b>Security</b></i></td>
				<td><i><b>Persons</b></i></td>
<td><i><b>Booking Status</b></i></td>
				
				
			</tr>
			
		</thead>

		
		<c:forEach var="UserBookingDetails" items="${list}">
			<%-- ${hotels} <br> --%>
			<tr>
				<td>${UserBookingDetails.hotelid }</td>
				<td>${UserBookingDetails.roomNumbers }</td>
				<td>${UserBookingDetails.noofdays }</td>
						<td>${UserBookingDetails.needCarParking }</td>
				<td>${UserBookingDetails.needFoodService }</td>
				<td>${UserBookingDetails.needGamingService }</td>
				<td>${UserBookingDetails.panNumber }</td>
				<td>${UserBookingDetails.needSecurity }</td>
						<td>${UserBookingDetails.noofPersons }</td>
						<td>${UserBookingDetails.bookingStatus }</td>
					
				
				
			</tr>
		</c:forEach>

	</table> 
	<br><br>
	 <a href = "/travellingProject" >Go To Home</a> 
	 <a href="BookMe"><button> Click Here To  Book </button></a>
<a href="CheckBookings"><button> Click Here To Check Your Bookings </button></a>

<a href="DeleteBookings"><button> Click Here To Delete Bookings </button></a>
<a href="UpdateBookings"><button> Click Here To Update Bookings </button></a>
	
	
	</div>
</body>
</html>