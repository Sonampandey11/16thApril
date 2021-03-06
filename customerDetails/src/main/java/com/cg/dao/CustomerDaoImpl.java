package com.cg.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cg.model.Customer;

public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public Set<Customer> addCustomerDetails(final Customer customer) {
		final Set<Customer> set=new HashSet<Customer>();
		set.add(customer);
		return set;
	}

	@Override
	public Set<Customer> viewCustomerDetails(final Customer customer) {
		final Set<Customer> set=new  HashSet<Customer>();
		final Iterator<Customer> view=set.iterator();
		while(view.hasNext())
		{
			System.out.println(view.next());
		}

		return set;
	}

	@Override
	public Set<Customer> retreiveById(final Customer customer) {
		final Customer customer2=new Customer();
        customer2.getCustomerId();
        
		return retreiveById(customer2);
	}

}
