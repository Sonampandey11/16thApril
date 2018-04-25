package com.cg.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.service.BankServiceImpl;
import com.cg.service.SavingAccountServiceImpl;


public class BankAppController {
	private static final Logger log = Logger.getLogger(BankAppController.class.getName());
	public static void main( String[] args )
	{
		final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	    Bank bank=(Bank) application.getBean("bankApp");
	    final Set<Bank> bankSet=new HashSet<Bank>();
	    System.out.println();
	    bankSet.add(bank);
	    System.out.println(bank);
	    Customer customer1=(Customer) application.getBean("customer");
	    System.out.println(customer1);
	  
	    // performaing withdraw and deposit
	    log.info("Enter amount to withdraw");
	    Scanner scan = new Scanner(System.in);
	    float withdraw=scan.nextFloat();
	    SavingAccount savings=(SavingAccount) application.getBean("saving");
	    System.out.println(savings);
   
	
}
}
