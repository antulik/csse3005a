<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<style>
			.form-error-field { background-color: #FFC; }
			.form-error-message { font-weight: bold; color: #900; font-size: 10px; }
		</style>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/tiny_mce/jquery.tinymce.js"></script>
<script type="text/javascript" src="js/editor.js"></script>
</head>
<body>

<h2>Edit Company Information</h2>

<!-- Form name: addCompanyInfo -->
<!-- Attribute names: operatorID, operatorName, companyInfo, address, telephone, email -->

<form:form commandName="editCompanyInfo">
<table border="0" cellspacing="2" style="border-collapse:collapse; padding: 5px">
	<tr>
		<!-- Insert operator ID -->
		<td><form:hidden path="operatorID" /></td>
	</tr>
	
	<tr>
		<!-- Insert company name -->
		<td width="500"><h4>Company name:</h4></td>
		<td><form:input path="operatorName" size="40" cssErrorClass="form-error-field"/><div class="form-error-message"><form:errors path="operatorName"/></div></td>
	</tr>

	<tr>
		<!-- Insert company description -->
		<td valign="top"><h4>Company description:</h4></td>
		<td width="500"><form:textarea path="companyInfo" cssClass="tinymce" /><div class="form-error-message"><form:errors path="companyInfo"/></div></td>
	</tr>
	
	<tr>
		<!-- Insert email -->
		<td><h4>Email:</h4></td>
		<td><form:input path="email" size="40" cssErrorClass="form-error-field"/><div class="form-error-message"><form:errors path="email"/></div></td>
	</tr>	
	
	<tr>
		<!-- Insert currency -->
		<td><h4>Currency:</h4></td>
		<td><form:select path="currency">
				<form:option value="USD" label="USD" />
				<form:option value="AUD" label="AUD" />
				<form:option value="EUR" label="EUR" />
				<form:option value="GBP" label="GBP" />
				<form:option value="YEN" label="YEN" />
			</form:select></td>
	</tr>	

	<tr>
		<!-- Cancel or submit -->
		<td colspan="2" align="right"><input type="button" value="Cancel" onClick="window.location.href='<c:url value="TOhome.html"/>'" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Edit"/></td>
	</tr>
</table>
</form:form>
</body>
</html>