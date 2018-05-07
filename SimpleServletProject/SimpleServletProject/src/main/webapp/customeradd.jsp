<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Adding customer Detail</h1>
		<form action="ServletDemo" method="post">
			<table style="with: 50%">
				<tr>
					<td>CustomerId</td>
					<td><input type="text" name="customerId" /></td>
				</tr>
				<tr>
					<td>CustomerName</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Customeraddress</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Paymentmode</td>
					<td><input type="text" name="mode" /></td>
				</tr>
				
				<tr>
					<td>RetailerId</td>
					<td><input type="text" name="yop" /></td>
				</tr>
			</table>
			<input type="submit" value="Add" />
		</form>
	</div>

</body>
</html>