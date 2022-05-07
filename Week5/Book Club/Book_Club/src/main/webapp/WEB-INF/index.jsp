<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Login/Register BookClub</title>
</head>
<body>

	<h1>Book Club</h1>
	<p>A place for friends to share thoughts on books</p>

	<h3>Register</h3>
	<form:form action="/register" modelAttribute="newUser">
		<div>
			<form:label path="userName">UserName:</form:label>
			<form:errors path="userName"/>
			<form:input path="userName"/>
		</div>
		
		<div>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</div>
		<div>
			<form:label path="password">Password:</form:label>
			<form:errors path="password"/>
			<form:input type="password" path="password"/>
		</div>
		<div>
			<form:label path="Confirm">Confirm Password:</form:label>
			<form:errors path="Confirm"/>
			<form:input type="password" path="Confirm"/>
		</div>
		<input type="submit" value="Register">
	</form:form>
	<h3>Login</h3>
	<form:form action="/login" modelAttribute="newLogin">
		<div>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</div>
		<div>
			<form:label path="password">Password:</form:label>
			<form:errors path="password"/>
			<form:input type="password" path="password"/>
		</div>
		<input type="submit" value="Login">
	</form:form>

</body>
</html>



<%-- div class="container">

	<h1>Welcome to the Book Club!</h1>

	<h2>Register</h2>

	<div class="container">
		<form:form action="/register" modelAttribute="newUser" class="form">
		
			<div class="form-row">
			 	<form:errors path="userName"/>
				<form:label for="userName" path="userName">User Name:</form:label>
				<form:input type="text" path="userName" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="email"/>
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="text" path="email" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="password"/>
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="text" path="password" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="confirm"/>
				<form:label for="" path="confirm">Confirm:</form:label>
				<form:input type="text" path="confirm" class="form-control"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Submit" class="btn-primary"/>
			</div>
			
		</form:form>
	</div>

	<div class="container">
		<form:form action="/login" modelAttribute="newLogin" class="form">
			<div class="form-row">
				<form:errors path="email"/>
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="text" path="email" class="form-control"/>
			</div>
			
			<div>
				<form:errors path="password"/>
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="text" path="password" class="form-control"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Submit" class="btn-primary"/>
			</div>
		
		</form:form>
	</div>

</div>
 --%>