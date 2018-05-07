<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.cg.bean.Customer" %>
<%@ page import="com.cg.bean.Goods" %>
<%@ page import="com.cg.bean.Supplier" %>
<%@ page isELIgnored="false" %> 

<html>
<body>

<%-- <%List<Customer> list= new ArrayList<Customer>();
request.getAttribute("customer");
%> --%>


<form action="ServletHome" method="post">
AddCustomer:
<input type="submit" value="addDetails">
</form>

<form>
RemoveCustomer:<input type="text" name="id2"><br>
<input type="submit" value="removeCustomerId">
</form>

<form>
UpdateCustomer:<input type="text" name="id3"><br>
<input type="submit" value="updateCustomer">
</form>



</body>
</html> 
</body>
</html>
