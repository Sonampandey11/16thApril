package com.cg.dao;

import java.util.HashSet;
import java.util.Set;

import com.cg.model.Bank;


public class BankDaoImpl implements IBankDao{

	

	@Override
	public Set<Bank> bankName(final Bank banks) {
		final Set<Bank> set=new HashSet<Bank>();
		set.add(banks);
		return set;
		
		
		/*
		 *public List<Bank> addBank(Bank bank) {
		List<Bank> list=new ArrayList();
	
		list.add(bank);
		// TODO Auto-generated method stub
		return list;  
		 */
		
	}

	@Override
	public Set<Bank> branch(final Bank branch) {
		final Set<Bank> setAll=new HashSet<Bank>();
		setAll.add(branch);
		return setAll ;
			
		
		
	}

}
