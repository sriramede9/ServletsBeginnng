<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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

			out.println(fullname + "yo bro");
		%>

		<%!int lengt(String s) {
		return s.length();
	}%>

		<h3>
			so the length of sriramede is
			<%=lengt("sriramede")%></h3>

	</h2>

	<h3>Mama ${exp} it's is better to learn el expressions and xml and
		the damn student object is ${studobj.getName()}</h3>
	<c:out value="C taage is working"></c:out>


	<c:set var="i" value="10"></c:set>

	<c:out value="${i}"></c:out>

	<c:remove var="i" />
	<p>After removing</p>
	<c:out value="${i}"></c:out>


	<a href=" <c:url value= "/index.html"></c:url>">Click to index</a>


	<c:forEach items="${ar}" var="x">
		<p>Now ${x} is my country</p>

	</c:forEach>

	<!-- array list -->

	<c:forEach items="${stlist}" var="x">
		<ul>

			<li>Now ${x.getName()} is my name</li>
		</ul>
	</c:forEach>

	<!-- using tables -->

	<table>

		<c:forEach items="${stlist}" var="x">
			<tr>
				<td>Now ${x.getName()} is my name</td>
				<td>will be second row ${x.getName()}</td>
			</tr>
			<tr>
				<td>and this is</td>
			</tr>
		</c:forEach>
	</table>

	<!-- the damn if block -->
	<c:if test="${2000 > 222}">
		<p>This is how if sucks</p>
	</c:if>


	<!-- choose tag like switch -->

	<c:set var="score" value="10"></c:set>

	<c:choose>

		<c:when test="${score} > 100"></c:when>

		<c:otherwise>
			<p>You did not score that!</p>
		</c:otherwise>

	</c:choose>
	

<c:out value="${fn:toUpperCase('Whatever it takes')}"></c:out>

<!-- end -->









</body>
</html>