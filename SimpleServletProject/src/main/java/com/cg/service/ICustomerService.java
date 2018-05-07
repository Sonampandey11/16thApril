package com.cg.service;

import com.cg.bean.Customer;

public interface ICustomerService {
	public int addCustomer(Customer customer);
	public int removeCustomer(Customer customer);
	public int updateCustomer(Customer customer);

}
