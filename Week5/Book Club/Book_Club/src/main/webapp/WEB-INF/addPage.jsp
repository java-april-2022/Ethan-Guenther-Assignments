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
    <title>Add Book</title>
</head>
<body>

	<h1>Add A Book To Your Shelf</h1>
	<a href="/books">Back To Shelves</a>
	
	<form:form action="/addBook" modelAttribute="books" method="post">
	
		<div>
				<form:errors path="user"/>
				<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>
		</div>
		<div>
			<form:label path="title">Title</form:label>
			<form:errors path="title"/>
			<form:input type="text" path="title"/>
		</div>
		<div>
			<form:label path="author">Author Name</form:label>
			<form:errors path="author"/>
			<form:input type="text" path="author"/>
		</div>
		<div>
			<form:label path="thoughts">Thoughts</form:label>
			<form:errors path="thoughts"/>
			<form:textarea path="thoughts"/>
		</div>
		
		<input type="submit" value="submit"/>
	</form:form>

</body>
</html>


