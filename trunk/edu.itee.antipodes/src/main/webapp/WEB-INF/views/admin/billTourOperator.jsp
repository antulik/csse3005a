<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="<c:url value="/css/smoothness/jquery-ui-1.7.2.custom.css"/>" rel="stylesheet" />
		<style>
			.form-error-field { background-color: #FFC; }
			.form-error-message { font-weight: bold; color: #900; font-size: 10px; }
		</style>
<script type="text/javascript" src="<c:url value="/js/jquery-1.4.2.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/jquery-ui-1.7.2.custom.min.js"/>"></script>
<script type="text/javascript">
	$(function() {
		$("#datepicker_from,#datepicker_to").datepicker({minDate:0,
			onSelect: restrictDates, changeMonth: true, changeYear: true, dateFormat: 'dd/mm/yy'});
		
		function restrictDates(dateStr) {
		    if (this.id == 'datepicker_from') {
		        $('#datepicker_to').datepicker('option', 'minDate', $(this).datepicker('getDate'));
		    }
		    else {
		        $('#datepicker_from').datepicker('option', 'maxDate', $(this).datepicker('getDate'));
		    }
		}
				
	});
</script>
</head>
<body>

<h2>Billing Tour Operators Report</h2>

<!-- Form name: billOperator -->
<!-- Attribute names: fromDate, toDate, tourOperator, exportFormat -->

<form:form commandName="billOperator">

<table border="0" style="border-collapse:collapse; margin-right:30px">

	<tr>
		<td width="170">From:&nbsp;&nbsp;<form:input path="fromDate" size="15" id="datepicker_from" title="DD/MM/YYYY" cssClass="date-picker" cssErrorClass="form-error-field"/></td>
		<td>To:&nbsp;&nbsp;<form:input path="toDate" size="15" id="datepicker_to" title="DD/MM/YYYY" cssErrorClass="form-error-field"/></td>
	</tr>
	
	<tr>
		<td valign="top"><div class="form-error-message"><form:errors path="fromDate"/></div></td>
		<td valign="top"><div class="form-error-message"><form:errors path="toDate" /></div></td>
	</tr>
	
	<tr>
		<td colspan="2">Tour Operator:&nbsp;&nbsp;<form:select path="operatorID">
				<form:options items="${touroperators}" itemValue="operatorID" itemLabel="operatorName" />
			</form:select>
			<div class="form-error-message"><form:errors path="operatorID"/></div>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">Export to:&nbsp;&nbsp;<form:select path="exportFormat">
				<form:option value="pdf" label="PDF" />
				<form:option value="xls" label="XLS" />
				<form:option value="csv" label="CSV" />
			</form:select>
		</td>
			
	</tr>
	
	<tr>
		<td colspan="2"><input type="button" value="Cancel" onClick="window.location.href='<c:url value="produceReport.html"/>'" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Export" style="margin-top:30px;"/></td>
	</tr>
	
</table>

</form:form>

</body>
</html>