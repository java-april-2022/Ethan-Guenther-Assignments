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
    <title>Create Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/dojo/create" method="post" modelAttribute="dojo">
		<form:label path="name" >Dojo Location:</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		
		<input type="submit" value="Create dojo"/>
	</form:form>
</body>
</html>