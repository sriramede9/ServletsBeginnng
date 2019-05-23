<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color: orange'>
	<h4>For god sake why do you have html and what is your deal?</h4>
	<!--  <h1 style='background-color:yellow'>	<%= request.getAttribute("exp")%></h1>-->

	<h2>
		<%
			String fullname = request.getAttribute("exp").toString();

			out.println(fullname+"yo bro");
		%>
		
		<%!
		
		int lengt(String s){
			return s.length();
		}
		
		%>
		
		<h3> so the length of sriramede is <%= lengt("sriramede") %></h3>
		
	</h2>
</body>
</html>