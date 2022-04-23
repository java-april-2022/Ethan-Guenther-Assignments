<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/css/style.css">

    <meta charset="UTF-8" />
    <title>okmiujiform</title>
</head>
<body>
	<h1>OKIMUJI FORM</h1>
	<div>
		<form action="/process" method="post">
		
		<div>
			<label>Pick any number from 5 to 25</label>
			<input type="number" name="number">
		</div>
		<div>
			<label>Enter the name of any city</label>
			<input type="text" name="city">
		</div>
		<div>
			<label>Enter the name of any Real Person</label>
			<input type="text" name= "person">
		</div>
		<div>
			<label>Enter the professional endeavor or hobby</label>
			<input type="text" name="hobby">
		</div>
		<div>
			<label>Enter any type of living thing</label>
			<input type="text" name="living">
		</div>
		<div>
			<label>Say something nice to someone</label>
			<textarea name="text" cols="30" rows="15"></textarea>
		</div>
		
		<p>Send to a Friend</p>
		<input type="submit" value="submit">
		
		</form>
	</div>

</body>
</html>