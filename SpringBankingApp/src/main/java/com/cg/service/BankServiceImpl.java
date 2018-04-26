package com.cg.service;

import java.util.Set;

import com.cg.dao.BankDaoImpl;
import com.cg.model.Bank;

public class BankServiceImpl implements IBankService{

	
    BankDaoImpl dao= new BankDaoImpl();
	@Override
	public Set<Bank> bankName(Bank banks) {
		return dao.bankName(banks);
		
		
	}

	@Override
	public Set<Bank> branch(Bank branch) {
		return dao.branch(branch);
		
		
	}

}
