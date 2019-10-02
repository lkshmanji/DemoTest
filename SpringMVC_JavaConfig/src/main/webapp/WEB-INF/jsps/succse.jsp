<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Deatails</h1>

	<table>
		<tr>
			<th>Studaent sid</th>
			<th>Student name</th>
			<th>Student email</th>
			<th>Student address</th>
		</tr>
		<tr>
			<td>${s.sid}</td>
			<td>${s.name}</td>
			<td>${s.email}</td>
			<td>${s.address}</td>
		</tr>
	</table>

</body>
</html>
<a href="http://localhost:7080/SpringMVC_JavaConfig/fc">Again Login</a>