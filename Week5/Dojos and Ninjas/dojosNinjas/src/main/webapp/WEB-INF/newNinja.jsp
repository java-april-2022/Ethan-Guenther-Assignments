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
    <title>Ninja Page</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninja/create" method="post" modelAttribute="ninja">
		<form:label path="dojo">Select Dojo</form:label>
		<form:errors path="dojo"/>
		<form:select path="dojo">
		
			<c:forEach var="allDojo" items="${getall}">
				<option value="${allDojo.id}">${allDojo.name}</option>
			</c:forEach>
		</form:select>
		<form:label path="firstName" >FirstName:</form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>

		<form:label path="lastName" >lastName:</form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
		
		<form:label path="age" >age:</form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
		
		<input type="submit" value="Create Ninja"/>
	</form:form>

</body>
</html>