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
    <title>HomePage</title>
</head>
<body>

	<h1>You have successfully logged in</h1>
	<h2>Welcome, <c:out value="${user.userName}"></c:out>!</h2>
	<a href="/logout">Logout</a>
	<a href="/addPage">Add Book To Shelf</a>
	<p>Books From Everyones Shelves:</p>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Title Name</th>
			<th>Author Name</th>
			<th>Posted By</th>
		</tr>
		
		<c:forEach var="book" items="${allBooks}">
			<tr>
				<td><c:out value="${book.id}"/></td>
				<td><a href="/books/${book.id}"><c:out value="${book.title}"/><a/></td>
				<td><c:out value="${book.author}"/></td>
				<td><c:out value="${book.user.userName}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>


<%-- <div class="container">
		<h1>Welcome, <c:out value="${user.userName}"/></h1>
		
		<h3>Books from everyone shelves:</h3>
		<a href="/logout">logout</a>
		<a href="/addPage">+ Add to my shelf</a>
		
		<table class="table">
		
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach var="book" items="${books}">
			
				<tr>
					<td><c:out value="${book.id}"/></td>
					<td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
					<td><c:out value="${book.author}"/></td>
					<td><c:out value="${book.user.userName}"/></td>
				</tr>
			</c:forEach>
		
		</table>
	</div>
 --%>