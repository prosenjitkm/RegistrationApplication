<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome</title>
	</head>
	<body>
		<h2>Welcome to your Profile</h2>
		<s:label value="First Name: "/>		<s:property	value="user.firstName"/><br>
		<s:label value="Last Name: "/>		<s:property	value="user.lastName"/>	<br>
		<s:label value="Gender: "/>			<s:property	value="user.gender"/>	<br>
		<s:label value="Age: "/>			<s:property	value="user.age"/>		<br>
		<s:label value="Email: "/>			<s:property	value="user.email"/>	<br>
	</body>
</html>