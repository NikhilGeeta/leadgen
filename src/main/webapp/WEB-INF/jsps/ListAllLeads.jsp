<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListAllLeads.com</title>
</head>
<body>
	<h1>List of All Leads....</h1>
	<table border="3">
		<tr>
			<th>id</th>
			<th>firstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>phone</th>
			<th>delete</th>
		</tr>
		<c:forEach var="lead" items="${lead}">
			<tr>
				<td>${lead.id}</td>
				<td>${lead.firstName}</td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.phone}</td>
				<td><a href="delete?id=${lead.id}">delete</a></td>
				<td><a href="update?id=${lead.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>