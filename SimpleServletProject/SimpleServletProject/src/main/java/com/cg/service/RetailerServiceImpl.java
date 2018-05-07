package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;
import com.cg.dao.RetailerDaoImpl;
@Service
public class RetailerServiceImpl implements IRetailerService{
	@Autowired
	RetailerDaoImpl rdao;
	/**
	 * @param rdao
	 */
	public RetailerServiceImpl(RetailerDaoImpl rdao) {
		this.rdao = rdao;
	}

	
	@Override
	public List<Goods> viewGoods() {
		// TODO Auto-generated method stub
		return rdao.viewGoods();
	}

	@Override
	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return rdao.viewCustomer();
	}

	@Override
	public List<Supplier> viewSupplier() {
		// TODO Auto-generated method stub
		return rdao.viewSupplier();
	}
}
