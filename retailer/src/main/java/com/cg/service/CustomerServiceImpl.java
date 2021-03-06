package com.cg.service;

import com.cg.bean.Customer;
import com.cg.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements ICustomerService {

	public CustomerDaoImpl cdao;
	/**
	 * @param cdao
	 */
	public CustomerServiceImpl(CustomerDaoImpl cdao) {
		this.cdao = cdao;
	}

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cdao.addCustomer(customer);
	}

	@Override
	public int removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cdao.removeCustomer(customer);
	}

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cdao.updateCustomer(customer);
	}

}
