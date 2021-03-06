package com.cg.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;

public class RetailerDaoImpl implements IRetailerDao{
	
	JdbcTemplate template;

	/**
	 * @param template
	 */
	public RetailerDaoImpl(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Goods> viewGoods() {
		final List<Goods> list = template.query("select * from goods",new BeanPropertyRowMapper<Goods>(Goods.class));

		return list;
	}

	@Override
	public List<Customer> viewCustomer() {
		final List<Customer> list=template.query("select * from customer", new BeanPropertyRowMapper<Customer>(Customer.class));
		return list;
	}

	@Override
	public List<Supplier> viewSupplier() {
		final List<Supplier> list=template.query("select * from supplier", new BeanPropertyRowMapper<Supplier>(Supplier.class));
		return list;
	}
}
/*
 *
 */
