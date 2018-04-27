package com.cg.dao;

import java.util.Set;

import com.cg.model.Customer;

public interface ICustomerDao {

	public Set<Customer> addCustomerDetails(Customer customer);
	public Set<Customer> viewCustomerDetails(Customer customer);
    public Set<Customer> retreiveById(Customer customer);
    public int updateCustomerDetails(Customer customer);
    public int deleteCustomerDetails(Customer customer);

}
