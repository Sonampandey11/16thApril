package com.cg.dao;


import java.util.Set;

import com.cg.model.Bank;

public interface IBankDao {
	public Set<Bank> bankName(Bank banks);
	public Set<Bank> branch(Bank branch);
	
	

}
