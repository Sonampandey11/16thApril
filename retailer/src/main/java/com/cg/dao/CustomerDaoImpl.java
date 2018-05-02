package com.cg.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.bean.Customer;

public class CustomerDaoImpl implements IcustomerDao {

	// DataSource datasource;
	JdbcTemplate template;

	/**
	 * @param datasource
	 *            the datasource to set
	 */
	 
		public CustomerDaoImpl(JdbcTemplate template) {
			super();
			this.template = template;
		}
	
	

	/**
	 * @return the template
	 */
	public JdbcTemplate getTemplate() {
		return template;
	}



	/**
	 * @param template the template to set
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



	/**
	 * 
	 */
	public CustomerDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addCustomer(Customer customer) {

		String sqlquery = "insert into customer values('" + customer.getCustomerId() + "','"
				+ customer.getCustomerName() + "','" + customer.getCustomerAddress() + "','" + customer.getPaymentMode()
				+ "','" + customer.getRetailerId() + "')";
		template.update(sqlquery);
		return customer.getCustomerId();
	}

	@Override
	public int removeCustomer(Customer customer) {
		String sqlquery = "delete from customer where customerId='" + customer.getCustomerId() + "'";
		return template.update(sqlquery);
	}

	@Override
	public int updateCustomer(Customer customer) {
		String sqlquery = "update customer '" + customer.getPaymentMode() + "' where customer_id='"
				+ customer.getCustomerId() + "'";
		return template.update(sqlquery);
	}

}
