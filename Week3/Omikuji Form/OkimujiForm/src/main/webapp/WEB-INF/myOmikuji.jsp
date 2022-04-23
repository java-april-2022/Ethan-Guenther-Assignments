<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>Omikuji Recieved</title>
</head>
<body>

	<h2>Your Omikuji</h2>
	
	<div class ="container">
		<h3><c:out value="${omikuji}"></c:out></h3>
	</div>
	
	
	<a href="/omikuji">Return</a>

</body>
</html>