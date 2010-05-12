<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.test {
	width: 500px;
}

</style>
<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAQlV1b2FPUM74rst4A4cFzxT2yXp_ZAY8_ufC3CFXhHIE1NvwkxQSgLSOP2XkswKd7txk3wHZjh27CA&sensor=false" type="text/javascript"></script>
<script type="text/javascript" src="<c:url value="/js/tourInfo.js"/>"></script>
</head>

<body onload="initialize()" onunload="GUnload()">
<h2>[TourName]<c:out value="${listedTour.tour.tourName}" /></h2>
<table border="0" align="center" width=100% style="border-collapse:collapse">
	<tr>
		<td rowspan="5" valign="top" width=35% ><div id="map_canvas" style="width: 500px; height: 300px; margin-right:20px"></div></td>
		<td valign="top"><h4>Price:<c:out value="${listedTour.tour.price}" /></h4></td>
	</tr>
	<!-- not working for multiple dates -->
	<c:forEach items="${listedTour.tour.tourDates}" var="tourDate">
		<tr>
			<td valign="top"><h4>Start Date: <c:out value="${tourDate.startDate}" /></h4></td>
		</tr>
		<tr>
			<td valign="top"><h4>Finish Date: <c:out value="${tourDate.finishDate}" /></h4></td>
		</tr>
	</c:forEach>
	<tr>
		<td valign="top">
			<h4>Tour Operator: <c:out value="${listedTour.operator.operatorName}" /></h4>
			<form style="margin:0px; padding:0px;" name="company info_${listedTour.operator.operatorID}" 
				action="companyInfo.html" method="post">
				<input type="hidden" name="operatorID" value="${listedTour.operator.operatorID}" />
			</form>
			<a href="#" style="color: blue;" 
				onclick="document['company info_${listedTour.operator.operatorID}'].submit()">Company info</a>
		</td>
		<tr>
		<td>
		Departures:
		</td>
		</tr>
	</tr>
	<tr>
		<td><input type="button" value="Contact Tour Operator" style="margin-top: 50px" onClick="window.location.href='<c:url value="contactTourOperator.html"/>'"/></td>
	</tr>
</table>

<h4>Location:</h4>
<h4>Activity:</h4>
<h4>Description:</h4>
<h4><c:out value="${listedTour.tour.tourDesc}" escapeXml="false"/></h4>

<p class="test">The best framed views of Lake Wakatipu can be experienced on an interpretive guided tour using flying foxes as low impact adventure access. 
Join us on a series of lines that traverse the forest in a way that will never be forgotten. 
This tour is perfect for families, groups and those who have never ziplined before.
</p>

<h4>Images:</h4>

</body>
</html>