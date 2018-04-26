package com.cg.service;

import java.util.Set;

import com.cg.model.Bank;

public interface IBankService {
 //creating an abstract method whose bodies are define
//in BankServiceImpl class	
	public Set<Bank> bankName(Bank banks);
	public Set<Bank> branch(Bank branch);

	

}
