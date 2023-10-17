<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateLead.com</title>
</head>
<body>
	<h1>Updating the Lead</h1>
	<form action="saveLeadsUpdate" method="post">
		<input type="hidden" value="${lead.id}"  name="id">
		firstName:<input type="text" name="firstName" value="${lead.firstName}">
		LastName:<input type="text" name="lastName" value="${lead.lastName}">
		email :<input type="text" name="email" value="${lead.email}">
		phone:<input type="text" name="phone" value="${lead.phone}">
		<input type="submit" value="Update">
	</form>
</body>
</html>