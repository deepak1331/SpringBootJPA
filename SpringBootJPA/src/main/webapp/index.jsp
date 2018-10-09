<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
<hr><br>
	<form action="addAlien" method="get">
		Enter ID : <input type="text" name="alienId"> <br> Enter Name
		:<input type="text" name="alienName"> <br> Enter Name
		:<input type="text" name="alienTech"> <br><br> <input type="submit"
			value="Submit Details">
	</form>
	
	<hr><br>
	<form action="getAlien" method="get">
		Enter ID : <input type="text" name="alienId"> <br> <br> <input type="submit"
			value="Fetch Details">
	</form>
	
	<hr><br>
	
	<form action="getAlienByTech" method="get">
		Enter Technology : <input type="text" name="alienTech"> <br> <br> <input type="submit"
			value="Fetch Details">
	</form>
	<hr><br>
</body>
</html>