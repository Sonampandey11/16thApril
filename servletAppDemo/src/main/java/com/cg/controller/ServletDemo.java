package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.RetailerServiceImpl;
@Controller
public class ServletDemo extends HttpServlet{

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{
		ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
		RetailerServiceImpl service=application.getBean("retailerservice",RetailerServiceImpl.class);
		Customer customer= new Customer(103,"Sonam","Airoli","Rs200",12);
		List<Customer> list=service.viewCustomer();
		request.setAttribute("customer",customer);
		request.getRequestDispatcher("index.jsp").forward(request, response);

		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}

}
