<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<title>Partner Login</title>
	
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<link  href="<c:url value="/resources/csslogin/style.css"/>"rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signup">
				<form:form action = "signupPartner" method="post" modelAttribute="owner">
					<label for="chk" aria-hidden="true">Sign up</label>
					<form:input type="text"  path = "ownerName" placeholder="Your name" required="required"/>
					<form:input type="text"  path = "owneraddress" placeholder="Your Address" required="required"/>
					<form:input type="number"  path = "ownernumber" placeholder="Your Number" required="required"/>
					<form:input type="email"  path = "owneremail" placeholder="Your Email" required="required"/>
					
					<button>Sign up</button>
				</form:form>
				
			</div>

			<div class="login" >
				<form action ="partnerDashboard" method="post">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="text" name="uname" placeholder="Your name" required="required">
					<input type="password" name="number" placeholder="Your Number" required="required">
					<button>Login</button>
				</form>
				<center> <a href = "/travellingProject" >Go To Home</a>  </center>
			</div>
			
	</div>
</body>
</html>