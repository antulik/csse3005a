<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/tiny_mce/jquery.tinymce.js"></script>
<script type="text/javascript" src="js/editor.js"></script>
</head>
<body>

<h2>Add Tour Information</h2>

<!-- Form name: add_tour -->
<!-- Attribute names: tourID, tourName, tourDesc, currency, price, image -->

<form name="add_tour" action="annoformaddexample.html" method="post">
<table border="0" cellspacing="2" style="border-collapse:collapse; padding: 5px">
	<tr>
		<td><input type="hidden" name="tourID" /></td>
	</tr>
	
	<tr>
		<td width="500"><h4>Tour name:</h4></td>
		<td><input type="text" size="40" name="tourName" /></td>
	</tr>

	<tr>
		<td valign="top"><h4>Tour description:</h4></td>
		<td width="500"><textarea name="tourDesc" class="tinymce"></textarea></td>
	</tr>
	
	<tr>
		<td><h4>Currency:</h4></td>
		<td><select name="currency"><option>AUD</option>
			<option>USD</option></select></td>
	</tr>

	<tr>
		<td width="500"><h4>Price:</h4></td>
		<td><input type="text" size="10" name="price" /></td>
	</tr>	
	
	<tr>
		<td width="500"><h4>Image:</h4></td>
		<td><input type="file" size="40" name="image" /></td>
	</tr>

	<tr>
		<td colspan="2" align="right"><input type="button" value="Cancel" onClick="window.location.href='<c:url value="TOhome.html"/>'" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Add" onclick="document['add_tour'].submit()" /></td>
	</tr>
</table>
</form>
</body>
</html>