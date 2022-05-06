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
    <title>Logged In</title>
</head>
<body>

	<h1>You have successfully logged in</h1>
	<h2>Welcome, <c:out value="${user.userName}"></c:out>!</h2>
	<a href="/">Logout</a>

</body>
</html>