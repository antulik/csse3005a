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

<h2>Welcome, [AdministratorName]</h2>

<h3>Now you can perform these operations:</h3>
<a class="home" href="<c:url value="addAccount.html"/>" >Add accounts</a><br/>
<a class="home" href="<c:url value="deleteAccount.html"/>" >Delete accounts</a><br/>
<a class="home" href="<c:url value="editAccount.html"/>" >Edit accounts</a><br/>
<a class="home" href="<c:url value="maintainSearchCriteria.html"/>" >Maintain search criteria</a><br/>
<a class="home" href="<c:url value="report.html"/>" >Report</a><br/>

</body>
</html>