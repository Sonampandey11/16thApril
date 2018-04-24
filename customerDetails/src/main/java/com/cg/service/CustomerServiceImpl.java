package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Customer;

public class CustomerServiceImpl implements CustomerServiceInterface {
	CustomerServiceImpl dao;
	public String viewAll() {
		List<Customer> list=new ArrayList<Customer>();
       // System.out.println(list);
     return dao.viewAll();
        
	}

}
