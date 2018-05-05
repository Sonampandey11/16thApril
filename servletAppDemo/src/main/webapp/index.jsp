<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.cg.bean.Customer" %>
<%@taglib uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs"prefix="c %>
<!--  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">   -->
<html>
<body>

<%

List<Customer> list= new ArrayList<Customer>();
request.getAttribute("customer");


%>
<center>
<h2>Retailer Application</h2>
CustomerId :<br>
<input type="text" name="id">
<textarea rows="2" cols="2"></textarea><br>

CustomerName :<br>
  <input type="text" name="cname" >
  <textarea rows="4" cols="5"></textarea>
  <br>

Customeraddress:
<br><input type="text" name="customerAddress">
<textarea rows="5" cols="6"></textarea><br>


  paymentMode:<br>
  <input type="text" name="payment">
  <textarea rows="5" cols="6"></textarea>
  <br>
  <input type="submit" value="Submit">
</center>

</body>
</html>
