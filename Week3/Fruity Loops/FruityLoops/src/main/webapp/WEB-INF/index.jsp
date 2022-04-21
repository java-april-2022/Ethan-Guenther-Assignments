<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Dojo Page</title>
</head>
<body>
	<h1>Fruit Store</h1>

	<div class="container">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="fruits" items="${fruits}">
				<tr>
					<td>${fruits.name}</td>
					<td>${fruits.price}</td>
				</tr>
			</c:forEach>
			

		</table>
	
	</div>

</body>
</html>
