<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Safe Travels</title>
</head>
<body>

<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td><a href="show/${expense.id}">${expense.name}</a></td>
				<td><c:out value="${expense.vendor}"></c:out></td>
				<td><c:out value="${expense.amount}"></c:out></td>
				<td><a href="/edit/${expense.id}">Edit</a></td>
				<td><form action="/expenses/${expense.id}" method="post">
    			<input type="hidden" name="_method" value="delete">
    			<input type="submit" value="Delete">
				</form>
				</td>
			</tr>	
		</c:forEach>
    </tbody>
</table>

	<h1>Add Expense</h1>
	<form:form action="/" method="post" modelAttribute="expense">
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