package com.cg.controller;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.service.SavingAccountServiceImpl;


/**
 * @author trainee
 *
 */
public class BankAppController {
	private static final Logger log = Logger.getLogger(BankAppController.class.getName());
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	    final Bank bank=(Bank) application.getBean("bankApp");
	    final Set<Bank> bankSet=new HashSet<Bank>();
	    bankSet.add(bank);
	    System.out.println(bank);
	    final Customer customer1=(Customer) application.getBean("customer");
	    System.out.println(customer1);
	    
	    
	    
	    // performaing  deposit of savingAccount
	    final SavingAccountServiceImpl service=(SavingAccountServiceImpl)  application.getBean("savings");
	    
	    
	    //SavingAccountServiceImpl service= new SavingAccountServiceImpl();
	    
	    
	    final Scanner scan = new Scanner(System.in);
	    System.out.println("Enter amount to deposit");
	    final float depositAmount=scan.nextFloat();
	    service.deposit(8000);
	    System.out.println();
	    
	    
	    //performing withdraw from savingAccount
	    System.out.println("Enter an amount to withdraw");
	    final float withdrawAmount=scan.nextFloat();
	    service.withdraw(withdrawAmount);
	    System.out.println(withdrawAmount);
	   
	   
	    /*final float withdrawAmount=scan.nextFloat();
	    final SavingAccount savings=(SavingAccount) application.getBean("saving");
	    System.out.println(savings);
	    //service.deposit(withdraw);
	    service.withdraw(50000);
	    
	  */
	    
	    
	    
	    
	    
	  
	    
	    
	    
	
}
}
