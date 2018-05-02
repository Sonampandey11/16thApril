package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Customer;

public class RetailerSupplier {
	ApplicationContext application=  new ClassPathXmlApplicationContext("applicationContext.xml");   
	Customer customer=(Customer) application.getBean("cdao");
   	
	

}
