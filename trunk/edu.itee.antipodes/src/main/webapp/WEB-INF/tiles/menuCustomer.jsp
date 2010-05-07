<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>



<html>
<head>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>

<body>
<div id="menu">
    <ul class="menu">
        <li><a href="<c:url value="/search.html"/>"><span><img src="<c:url value="/img/Home-icon.png"/>">Home</span></a></li>
        <li><a href="<c:url value="/searchResult.html"/>"><span><img src="<c:url value="/img/Search-icon.png"/>">Search Results</span></a></li>
        <li><a href="<c:url value="/tourInfo.html"/>"><span><img src="<c:url value="/img/Tour-icon.png"/>">Tour Info</span></a></li>
        <li><a href="<c:url value="/companyInfo.html"/>"><span><img src="<c:url value="/img/Tour-icon.png"/>">Company Info</span></a></li>
        <sec:authorize ifAnyGranted="ROLE_ADMIN,ROLE_OPERATOR">   
        <li class="last"><a href="<c:url value="/j_spring_security_logout"/>"><span><img src="<c:url value="/img/Logout-icon.png"/>">Logout</span></a></li>
        <li class="log"><a><span>Logged in as <font color='blue'><sec:authentication property="principal.username" /></font></span></a></li>
        </sec:authorize>
    </ul>
</div>
</body>

</html>