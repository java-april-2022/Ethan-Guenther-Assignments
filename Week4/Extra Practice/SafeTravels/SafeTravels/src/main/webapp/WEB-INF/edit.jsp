<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Edit Expense</title>
</head>
<body>

<h1>Edit Expense</h1>
	<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
	    <input type="hidden" name="_method" value="put">
		<div>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name" type="text"/>		
		</div>
		<div>
			<form:label path="vendor">Vendor:</form:label>
			<form:errors path="vendor"/>
			<form:input path="vendor" type="text"/>
		</div>	
		<div>
			<form:label path="amount">Amount:</form:label>
			<form:errors path="amount"/>
			<form:input path="amount" type="double"/>
		</div>
		<div>
			<form:label path="description">Description:</form:label>
			<form:errors path="description"/>
			<form:input path="description" type="text"/>
		</div>
		
		<input type="submit" value="submit">
		
	</form:form>
</body>
</html>