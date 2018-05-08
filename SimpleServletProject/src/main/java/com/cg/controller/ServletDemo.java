package com.cg.controller;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cg.bean.Customer;
import com.cg.service.RetailerServiceImpl;

public class ServletDemo extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hii >>>>>>>>>>>");
		final ApplicationContext application = new AnnotationConfigApplicationContext(Applicationconfig.class);
		final RetailerServiceImpl service = application.getBean("retailerservice", RetailerServiceImpl.class);
		final List<Customer> list = service.viewCustomer();

		/*
		 * final List<Customer> list= service.addCustomer("cus"); List<Customer>
		 * list2=service.updateCustomer( customer)
		 */
		request.setAttribute("customer", list);

		System.out.println(list);
		System.out.println("I am in servlet demo");
		request.getRequestDispatcher("mainpage.jsp").forward(request, response);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hii >>>>>>>>>>>");
		final ApplicationContext application = new AnnotationConfigApplicationContext(Applicationconfig.class);
		final RetailerServiceImpl service = application.getBean("retailerservice", RetailerServiceImpl.class);
		final List<Customer> list = service.viewCustomer();

		/*
		 * final List<Customer> list= service.addCustomer("cus"); List<Customer>
		 * list2=service.updateCustomer( customer)
		 */
		request.setAttribute("customer", list);

		System.out.println(list);
		System.out.println("I am in servlet demo");
		request.getRequestDispatcher("mainpage.jsp").forward(request, response);
	}

}
