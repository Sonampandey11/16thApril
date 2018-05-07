package com.cg.controller;

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
import com.cg.bean.Goods;
import com.cg.bean.Supplier;
import com.cg.service.RetailerServiceImpl;
//@WebServlet("/ServletHome")
public class ServletDemo extends HttpServlet{
 
	@Autowired
	RetailerServiceImpl retailerservice;
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Hii");
		final ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
		//final RetailerServiceImpl service=application.getBean("retailerservice",RetailerServiceImpl.class);
		final List<Customer> list=retailerservice.viewCustomer();
		request.setAttribute("customer",list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		/*//displaying entire goods
		final List<Goods> listgoods=service.viewGoods();
		request.setAttribute("goods", listgoods);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
		//displaying supplier details
		final List<Supplier> lists=service.viewSupplier();
		request.setAttribute("supplier", lists);
		request.getRequestDispatcher("home.jsp").forward(request, response);*/
	
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}

}
