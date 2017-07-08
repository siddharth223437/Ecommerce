<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">

	<form:form class="form-signin" method="POST" modelAttribute="loginUser" action="login" >
		<h2 class="form-signin-heading">Please sign in</h2>
		 <label for="inputEmail" class="sr-only">Email address</label>
		 <form:input path="username" class="form-control" placeholder="Username" required="autofocus"/>
		<label for="inputPassword" class="sr-only">Password</label>
		<form:password path="password" class="form-control" placeholder="Password"/>
		<div class="checkbox">
			<label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	</form:form>	
     
    </div> <!-- /container -->

</body>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 <link href="<c:url value="/assets/css/login.css" />" rel="stylesheet">
</html>

   