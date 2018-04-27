package com.cg.service;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.BankAppController;
import com.cg.model.SavingAccount;

public class SavingAccountServiceImpl implements ISavingAccountService {
	private static final Logger log = Logger.getLogger(SavingAccountServiceImpl.class.getName());
	/*final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	final SavingAccount saving=(SavingAccount) application.getBean("sav");
	*/
	final SavingAccount saving= new SavingAccount();
	@Override
	public float transaction() {

		final float interestRate = (float) 0.07;
		final float simpleInterest=saving.getBalance()*interestRate;
		log.info("Your interest is"+simpleInterest);

		return saving.getBalance();
	}

	@Override
	public void deposit(final float depositAmount) {

		final float initialBalance=(int) (depositAmount+saving.getBalance());
		System.out.println("balance"+initialBalance);
	}

	@Override
	public void withdraw(final float withdrawlAmount) {
		
		// TODO Auto-generated method stub
		System.out.println("Your current balance is :" + saving.getBalance());

		//float withdrawl=balance;
		if(withdrawlAmount>saving.getBalance())
		{
			log.info("You have insufficient balance");
		}
		else
		{
			final float finalBalance=(int) (saving.getBalance()-withdrawlAmount);
			//System.out.println("balance"+initialBalance);
			System.out.println("Your final balance is "+finalBalance);
		}


	}
	
	@Override
	public void deleteAccount() {
		
		
	}

}
