package com.cg.service;

/**
 * @author trainee
 *
 */
public class CheckingServiceImpl implements ICheckingAccountService{

	@Override
	public void checkBalance() {
		
			final int balance=1000;
			final float interestRate = (float) 0.07;
			final float simpleInterest=balance*interestRate;
			System.out.println("Your interest is"+simpleInterest);
	
	}


}
