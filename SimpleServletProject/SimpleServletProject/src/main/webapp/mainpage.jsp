<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="java.util.List" %>
    <%@page import="com.cg.bean.Customer" %>
    <%@page import="java.util.ArrayList" %>
    <%@ page isELIgnored="false" %> 
    

<html>
<body>
<form action="ServletHome" method="post">
<h1>Welcome to customer Details</h1>
<table>
<th>customerId</th>
<th>customerName</th>
<th>customerAddress</th>
<th> paymentMode</th>
<th>retailerId</th>
<tr>
 <c:forEach items="${customer}" var="list"> 
<td>${list.customerId}</td>
 <td>${list.customerName}</td>
 <td>${list.customerAddress}</td>
 <td>${list.paymentMode}</td>
 <td>${list.retailerId}</td>
                   
                    </td></tr>
				</c:forEach>
            </table>
        </div>

</form>
</body>
</html>
