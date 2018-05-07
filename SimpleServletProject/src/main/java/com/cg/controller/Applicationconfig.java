package com.cg.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
}
