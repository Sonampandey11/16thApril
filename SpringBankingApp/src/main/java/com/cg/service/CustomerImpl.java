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

	/**
	 * @return the dao
	 */

	/**
	 * @param dao the dao to set
	 */
	public void setDao(CustomerDaoImpl dao) {
		this.dao = dao;
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

	@Override
	public void updateCustomerDetails(Customer customer,String name) {
		// TODO Auto-generated method stub
		dao.updateCustomerDetails(customer,name);
	}

	@Override
	public void deleteCustomerDetails(Customer customer,String firstname) {
		// TODO Auto-generated method stub
		//dao.deleteCustomerDetails(customer);
	}

}
