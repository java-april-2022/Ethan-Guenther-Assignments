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
    <title>Login And Register</title>
</head>
<body>

	<h1>Register</h1>
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
	<h1>Login</h1>
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