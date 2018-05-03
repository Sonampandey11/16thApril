package com.cg.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.RetailerDaoImpl;
import com.cg.dao.SupplierDaoImpl;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;
@Configuration
@PropertySource(value= {"classpath:application.properties"})
public class Applicationconfig {
	@Autowired
	Environment environment;
	
	String Driver="jdbc.driverClassName";
	String URL="jdbc.url";
	String USERNAME="jdbc.username";
	String PASSWORD="jdbc.password";
	//bean creation for datasource
	@Bean(name="dataSource")
	public DataSource datasource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
	/*	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/retail");
		datasource.setUsername("root");
		datasource.setPassword("root");
		
		*/
		datasource.setDriverClassName(environment.getRequiredProperty(Driver));
		datasource.setUrl(environment.getRequiredProperty(URL));
		datasource.setUsername(environment.getRequiredProperty(USERNAME));
		datasource.setPassword(environment.getRequiredProperty(PASSWORD));
		return datasource;
		
	}
	
	//bean creation for jdbcTemplate
	@Bean(name="template")
	public JdbcTemplate template()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(datasource());
		return template;
		
	}
	
	//creationg bean class for customerDao
	@Bean(name="cdao")
	public CustomerDaoImpl customerDao()
	{
		CustomerDaoImpl customerDao=new CustomerDaoImpl(template());
		return customerDao;
	}

	//creation bean class for customerService
	@Bean(name="customerservice")
	public CustomerServiceImpl customerService()
	{
		CustomerServiceImpl customerService=new CustomerServiceImpl(customerDao());
		
		return customerService ;
		
	}
	@Bean(name="gdao")
	public GoodsDaoImpl goodDao()
	{
		GoodsDaoImpl goods=new GoodsDaoImpl(template());
		return goods;
		
	}
	
	@Bean(name="goodservice")
	public GoodsServiceImpl goodService()
	{
		GoodsServiceImpl goodService=new GoodsServiceImpl(goodDao());
		return goodService;
	}
	
	@Bean(name="sdao")
	public SupplierDaoImpl supplierDao()
	{
		SupplierDaoImpl supplier=new SupplierDaoImpl(template());
		return supplier;
	}
	
	@Bean(name="supplierservice")
	public SupplierServiceImpl supplierService()
	{
		SupplierServiceImpl service=new SupplierServiceImpl(supplierDao());
		return service;
	}
	
	@Bean(name="rdao")
	public RetailerDaoImpl retailer()
	{
		RetailerDaoImpl retailer=new RetailerDaoImpl(template());
		return retailer;
	}
	
	@Bean(name="retailerservice")
	public RetailerServiceImpl retailerService()
	{
		RetailerServiceImpl rService=new RetailerServiceImpl(retailer());
		return rService;
		
	}
}

