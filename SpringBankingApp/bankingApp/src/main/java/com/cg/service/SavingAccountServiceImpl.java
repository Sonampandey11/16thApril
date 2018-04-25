package com.cg.service;

import com.cg.model.SavingAccount;

public class SavingAccountServiceImpl implements ISavingAccountService {

    SavingAccount saving;
	@Override
	public float transaction() {

		final float interestRate = (float) 0.07;
		final float simpleInterest=saving.getBalance()*interestRate;
		System.out.println("Your interest is"+simpleInterest);

		return saving.getBalance();
	}

	@Override
	public void deposit(final float depositAmount) {

		 float initialBalance=(int) (depositAmount+saving.getBalance());
		System.out.println("balance"+initialBalance);
	}

	@Override
	public void withdraw(final float withdrawlAmount) {
		// TODO Auto-generated method stub
		System.out.println("Your current balance is :" + saving.getBalance());

		//float withdrawl=balance;
		if(withdrawlAmount>saving.getBalance())
		{
			System.out.println(("You have insufficient balance"));
		}
		else
		{
			float initialBalance=(int) (saving.getBalance()-withdrawlAmount);
			System.out.println("balance"+initialBalance);
		}


	}

}
