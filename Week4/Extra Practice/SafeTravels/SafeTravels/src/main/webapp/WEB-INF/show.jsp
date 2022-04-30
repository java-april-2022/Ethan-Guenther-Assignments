<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Results</title>
</head>
<body>
	<h1>Details</h1>
	<a href="/">Homepage</a>
	
	<table>
		<tr>
			<th>Expense Name</th>
			<td><c:out value="${expense.name}"/></td>
		</tr>
		<tr>
			<th>Expense Vendor</th>
			<td><c:out value="${expense.vendor}"/></td>
		</tr>
		<tr>
			<th>Expense Amount</th>
			<td><c:out value="${expense.amount}"/></td>
		</tr>
		<tr>
			<th>Expense Description</th>
			<td><c:out value="${expense.description}"/></td>
		</tr>
	</table>

</body>
</html>