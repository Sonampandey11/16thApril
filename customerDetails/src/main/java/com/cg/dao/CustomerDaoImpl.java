package com.cg.dao;

import com.cg.service.CustomerServiceImpl;

public class CustomerDaoImpl implements CustomerInterface{

	CustomerServiceImpl customer;

	public String viewAll() {
		
		return customer.viewAll();
	}

}
