<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<title>User Login</title>
	
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<link  href="<c:url value="/resources/csslogin/style.css"/>"rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signup">
				<form:form action = "signupUser" method="post" modelAttribute="user">
					<label for="chk" aria-hidden="true">Sign up</label>
					<form:input type="text"  path = "username" placeholder="User name" required="required"/>
					<form:input type="email"  path = "email" placeholder="Email" required="required"/>
					<form:input type="password"  path = "password" placeholder="Password" required="required"/>
					<button>Sign up</button>
				</form:form>
				<center> <a href = "/travellingProject" >Go To Home</a>  </center>
			</div>

			<div class="login" >
				<form action ="userDashboard" method="post">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="text" name="uname" placeholder="User name" required="required">
					<input type="password" name="pass" placeholder="Password" required="required">
					<button>Login</button>
				</form>
				<center> <a href = "/travellingProject" >Go To Home</a>  </center>
			</div>
			
	</div>
</body>
</html>