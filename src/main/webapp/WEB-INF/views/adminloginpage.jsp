<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<title>Admin Login</title>
	
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<link  href="<c:url value="/resources/csslogin/style.css"/>"rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<br><br>	<br><br>
<br><br><br><br>
			<div class="login" >
				<form action ="adminDashboard" method="post">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="text" name="uname" placeholder="Your name" required="required">
					<input type="text" name="pass" placeholder="Your Password" required="required">
					<button>Login</button>
				</form>
				<center> <a href = "/travellingProject" >Go To Home</a>  </center>
			</div>
			
	</div>
</body>
</html>