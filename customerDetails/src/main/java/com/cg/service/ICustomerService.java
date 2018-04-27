package com.cg.service;

import java.util.Set;

import com.cg.model.Customer;

/**
 * @author trainee
 *
 */
public interface ICustomerService {

	public Set<Customer> addCustomerDetails(Customer customer);
	public Set<Customer> viewCustomerDetails(Customer customer);
    public Set<Customer> retreiveById(Customer customer);
	
}
