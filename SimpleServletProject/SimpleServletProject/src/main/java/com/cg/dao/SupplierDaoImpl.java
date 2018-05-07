package com.cg.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.bean.Supplier;
@Repository
public class SupplierDaoImpl implements ISupplierDao{
 
@Autowired
	JdbcTemplate template;
	
	
	public SupplierDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	//JdbcTemplate jdbcTemplate;

	@Override
	public int addSupplier(final Supplier supplier) {
		String sqlquery="insert into supplier values('"+ supplier.getSupplierId() + "','"
				                                       + supplier.getSupplierName() + "','"
				                                       + supplier.getSupplierAddress() +"','"
				                                       + supplier.getQuantityOrder()  +"','"
				                                       + supplier.getOrderId() +"','"
				                                       +supplier.getAmount()  + "','" 
				                                       +supplier.getRetailerId() + "')";
		template.update(sqlquery);
		return supplier.getSupplierId();
	}

	@Override
	public int removeSupplier(final Supplier supplier) {
		String sqlquery="delete from supplier where supplierId= '"+supplier.getSupplierId() +"'";
		return template.update(sqlquery);
	}

	@Override
	public int updateSubblier(final Supplier supplier) {
		String sqlquery = "update supplier set amount='" +supplier.getAmount() + 
				         "'where supplierId='" +supplier.getSupplierId() + "'";
		
		return template.update(sqlquery);
	}
	

}
