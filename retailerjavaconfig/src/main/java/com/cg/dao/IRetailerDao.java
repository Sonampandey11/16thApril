package com.cg.dao;

import java.util.List;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;


public interface IRetailerDao {
	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();

}
