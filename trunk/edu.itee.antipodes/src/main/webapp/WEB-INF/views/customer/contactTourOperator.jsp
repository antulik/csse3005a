<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Contact Tour Operator</h2>

<!-- Form name: email_operator -->
<!-- Attribute names: name, email, telephone, subject, content -->

<form name="email_operator" action="annoformaddexample.html" method="post">
<table border="0" cellspacing="2" style="border-collapse:collapse; padding: 5px">
	<tr>
		<td width="100"><h4>Name:</h4></td>
		<td><input type="text" size="40" name="name" /></td>
	</tr>

	<tr>
		<td><h4>Email:</h4></td>
		<td><input type="text" size="40" name="email" /></td>
	</tr>
	
	<tr>
		<td><h4>Telephone:</h4></td>
		<td><input type="text" size="40" name="telephone" /></td>
	</tr>
	
	<tr>
		<td><h4>Subject:</h4></td>
		<td><input type="text" size="40" name="subject" /></td>
	</tr>
	
	<tr>
		<td colspan="2"><textarea name="content" rows="15" cols="60"></textarea></td>
	</tr>

	<tr>
		<td colspan="2" align="right"><input type="button" value="Cancel" onClick="window.location.href='<c:url value="tourInfo.html"/>'" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Submit" onclick="document['email_operator'].submit()" /></td>
	</tr>

</table>
</form>
</body>
</html>