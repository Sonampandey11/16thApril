/*package com.cg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Customer;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.RetailerServiceImpl;

public class ServletMain extends HttpServlet{

	@Autowired
	CustomerServiceImpl customer;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Hii");
		final ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
		//final RetailerServiceImpl service=application.getBean("retailerservice",RetailerServiceImpl.class);

		final List<Customer> list=customer.updateCustomer(customer);
		String customerId=request.getParameter("customerId");
		String paymentmode=request.getParameter("paymentmode");
		
		request.getRequestDispatcher("home.jsp").forward(request, response);

		


	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}

}


*/