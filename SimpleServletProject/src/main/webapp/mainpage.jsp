<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.cg.bean.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<title>Home</title>
</head>

<body>
	</form>
	<h1>Welcome to customer Details</h1>
	<table>
		<tr>
			<th>customerId</th>
			<th>customerName</th>
			<th>customerAddress</th>
			<th>paymentMode</th>
			<th>retailerId</th>
		</tr>

		<c:forEach items="${customer}" var="value">
			<td>${value.customerId}</td>
			<td>${value.customerName}</td>
			<td>${value.customerAddress}</td>
			<td>${value.paymentMode}</td>
			<td>${value.retailerId}</td>

		</c:forEach>

	</table>

</body>
</html>
