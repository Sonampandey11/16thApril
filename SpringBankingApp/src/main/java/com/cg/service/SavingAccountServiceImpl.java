package com.cg.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.SavingAccount;

public class SavingAccountServiceImpl implements ISavingAccountService {

	/*final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	final SavingAccount saving=(SavingAccount) application.getBean("sav");
	*/
	SavingAccount saving= new SavingAccount();
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
			System.out.println("You have insufficient balance");
		}
		else
		{
			float finalBalance=(int) (saving.getBalance()-withdrawlAmount);
			//System.out.println("balance"+initialBalance);
			System.out.println("Your final balance is "+finalBalance);
		}


	}
	/*
	 * (non-Javadoc)
	 * @see com.cg.service.ISavingAccountService#deleteAccount()
	 */

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

}
