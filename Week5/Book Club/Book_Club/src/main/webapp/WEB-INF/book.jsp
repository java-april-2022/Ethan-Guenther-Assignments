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
    <title>ShowPage</title>
</head>
<body>

	<h1><c:out value="${book.title}"></c:out> </h1>
	<a href="/books">Back To The Shelves</a>
	<a href="/logout">Logout</a>
	
	<h3><c:out value = "${book.user.userName}"/> read 
		<c:out value="${book.title}"/> by
		<c:out value="${book.author}"/>
	</h3>
	
	<h4>Here are <c:out value="${book.user.userName}"/>'s thoughts</h4>
	<p><c:out value="${book.thoughts}"/></p>
</body>
</html>



<%-- 	<div class="container">
		<h1>Welcome, <c:out value="${user.userName}"/></h1>
		
		<h3>Books from everyone shelves:</h3>
		<a href="/logout">logout</a>
		<a href="/addPage">+ Add to my shelf</a>
		<a href="/home">Home</a>
		
		<div class="container">
			<h3><span style="color: red;"><c:out value="${book.user.userName}"/></span> read 
			<span style="color: rebeccapurple;"><c:out value="${book.title}"/></span> by 
			<span style="color: darkgreen;"><c:out value="${book.author}"/></span></h3>
		</div>
		
		<div class="container">
			<h4>Here are their thoughts:</h4>
			<hr />
			
			<p><c:out value="${book.thoughts}"/></p>
			<hr />
		
		</div>
		
		<button class="btn-warning"><a href="/books/${book.id}/edit">edit</a></button>
	</div> --%>