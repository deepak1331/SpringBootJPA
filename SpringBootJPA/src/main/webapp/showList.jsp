<%@page import="com.deepakEdu.model.Alien"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Data</title>
</head>
<body>
	<h1>Matching Records are as follows:</h1>

	<%
		List<Alien> results = (List<Alien>) request.getAttribute("alien");
		// 		results.forEach(p -> System.out.println(p));
		for (Alien a : results)
			out.print(a);
	%>

</body>
</html>