<%@ include file="/WEB-INF/views/include.jsp" %>

<html>

<head>
	<title><fmt:message key="title" /></title>
</head>

<body>
	<jsp:include page="/WEB-INF/views/navlinks.jsp" />
	<h1>Reports</h1>
	
	Billing tour operators (<a href="reports/BillingTourOperators.pdf">pdf</a>)
(<a href="reports/BillingTourOperators.csv">csv</a>)
(<a href="reports/BillingTourOperators.xls">xls</a>)<br>

Monitoring System Utilisation (<a href="reports/MonitoringSystemUtilisation.pdf">pdf</a>)
(<a href="reports/MonitoringSystemUtilisation.csv">csv</a>)
(<a href="reports/MonitoringSystemUtilisation.xls">xls</a>)<br>

Monitoring Search Criteria Utilisation (<a href="reports/MonitoringSearchCriteriaUtilisation.pdf">pdf</a>)
(<a href="reports/MonitoringSearchCriteriaUtilisation.csv">csv</a>)
(<a href="reports/MonitoringSearchCriteriaUtilisation.xls">xls</a>)<br>

Detecting abuse (<a href="reports/DetectingAbuse.pdf">pdf</a>)
(<a href="reports/DetectingAbuse.csv">csv</a>)
(<a href="reports/DetectingAbuse.xls">xls</a>)<br>
	
	
	
	
	<br /><br /><br /><br /><br />
	<h1>PDF Format</h1>
		<a href="reports/simpleReport.pdf">My test</a><br>
		<a href="reports/simpleReport.pdf">Pre-Compiled Report File</a><br>
		<a href="reports/simpleReportCompile.pdf">Dynamically Compiled Report File</a><br>
        <h1>Other Formats</h1>
		<a href="reports/simpleReportHtml.html">HTML</a><br>
		<a href="reports/simpleReportCsv.csv">CSV</a><br>
		<a href="reports/simpleReportExcel.xls">Excel</a><br>
        <h1>Sub-Reports</h1>
        <a href="reports/subReport.pdf">In PDF Format</a>
				
				<h1>Using Multi-Format View</h1>
				<a href="reports/simpleReportMulti.pdf">PDF</a>
				<a href="reports/simpleReportMulti.csv">CSV</a>
				<a href="reports/simpleReportMulti.html">HTML</a>
				<a href="reports/simpleReportMulti.xls">Excel</a>
				
				<h1>Using a POST</h1>
				<h2>With .pdf Extension</h2>
				<form name="testForm1" method="POST" action="reports/simpleReportPost.pdf">
					<input name="reportTitle" value="foo" type="test"/>
					<input type="Submit" value="Try with a POST"/>
				</form>
				<h2>With .action Extension</h2>
				<form name="testForm2" method="POST" action="reports/simpleReportPost.action">
					<input name="reportTitle" value="foo" type="test"/>
					<input type="Submit" value="Try with a POST"/>
				</form>
</body>
	
</html>