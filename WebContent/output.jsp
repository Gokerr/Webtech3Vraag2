<%@page import="ahmet.ap.edu.MedicijnenOphalen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@ page import="org.restlet.resource.ClientResource" %>
<%@page import="java.io.StringWriter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		String search = request.getParameter("zoeken");
		if (search != null){
	%>
		<h1>medicijn "<%=search %>":</h1>
	
	<%	
	ClientResource res = new ClientResource("http://127.0.0.1:8186/medicijn/medicijn/"+search);
	StringWriter writer = new StringWriter();
	res.get().write(writer);
	String[] medicijn = writer.toString().split("{");
	%>
	<ul>
	<% for (String f : medicijn) {%>
		<li><%=f %></li>
	<%} %>
	</ul>
	<%
		
		}
	%>
	<a href="Input.jsp">Back to Search</a>




</body>
</html>