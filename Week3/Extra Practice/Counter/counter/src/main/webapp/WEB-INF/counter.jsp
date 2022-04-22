<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>You have visited <a href="/"><c:out value="${urlPage}"/></a> <c:out value="${currentCount}"/> time(s).</p>
	<p>Keep counting if you dare</p>
	<p><a href="/">Count again???? Maybe???</a></p>
	<p><a href="/double-counter/">Count 2 times, wow you're incredible</a></p>
	<p><a href="/reset-counter/">Set Counter to 0, try it again</a></p>
</body>
</html>