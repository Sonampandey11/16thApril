package com.cg.service;

import java.util.Set;

import com.cg.dao.CustomerDaoImpl;
import com.cg.model.Customer;

public class CustomerImpl implements ICustomerService {
    CustomerDaoImpl dao;
	@Override
	public Set<Customer> addCustomerDetails(final Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomerDetails(customer);
	}

	@Override
	public Set<Customer> viewCustomerDetails(final Customer customer) {
		// TODO Auto-generated method stub
		return dao.viewCustomerDetails(customer);
	}

	@Override
	public Set<Customer> retreiveById(final Customer customer) {
		// TODO Auto-generated method stub
		return dao.retreiveById(customer);
	}

}
