package com.cg.dao;

import com.cg.bean.Customer;

public interface IcustomerDao {
	public int addCustomer(Customer customer);
	public int removeCustomer(Customer customer);
	public int updateCustomer(Customer customer);


}
