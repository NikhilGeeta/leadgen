<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentsLeads.com</title>
</head>
<body>
	<h1>Students Leads Form....</h1>
	<form action="saveLead" method="post">
		FirstName:<input type="text" name="firstName"> LastName:<input
			type="text" name="LastName"> email:<input type="text"
			name="email"> Phone:<input type="text" name="phone">
		<input type="submit" value="SaveLead">
	</form>
	${msg}
</body>
</html>