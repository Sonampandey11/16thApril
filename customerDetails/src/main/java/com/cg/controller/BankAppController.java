package com.cg.controller;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.model.Statement;
import com.cg.service.CustomerImpl;
import com.cg.service.ISavingAccountService;
import com.cg.service.SavingAccountServiceImpl;
import com.cg.service.StatementImpl;


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
	    final ISavingAccountService service=(SavingAccountServiceImpl)  application.getBean("savings");
	    //SavingAccountServiceImpl service= new SavingAccountServiceImpl();
	    final Scanner scan = new Scanner(System.in);
	    System.out.println("Enter amount to deposit");
	    final float depositAmount=scan.nextFloat();
	  
	    
	    //performing withdraw from savingAccount
	    System.out.println("Enter an amount to withdraw");
	    final float withdrawAmount=scan.nextFloat();
	    service.withdraw(withdrawAmount);
	    System.out.println(withdrawAmount);
	   
	    //adding details of customer
	    final Customer custom=(Customer) application.getBean("customerAdd");
	    final Customer custom2=(Customer) application.getBean("cus");
	    Set<Customer> setvalue=new HashSet<>();
	    setvalue.add(custom);
	    setvalue.add(custom2);
	    System.out.println(setvalue);
	    
	    //viewById details of Customer
	    System.out.println("Enter customerId");
	    int customId=scan.nextInt();
	    if(custom.getCustomerId()==customId || custom2.getCustomerId()==customId)
	    {
	    	System.out.println(setvalue);
	    }
	
	    else
	    {
	    	System.out.println("please enter correct customerId ");
	    }
	    
	    
	    	
	    //displaying ministatement of transaction
	    
	  /* final StatementImpl ministatement=(StatementImpl) application.getBean("mini");*/
	   
	    
	    
	    
	   
	    
	    
	    
	   /* System.out.println(custom);
	    System.out.println(custom2);*/
	  /*  //adding details of customer and view by id and view all
	    final CustomerImpl custom=(CustomerImpl) application.getBean("customerAdd");
	    
	   
	    final float withdrawAmount=scan.nextFloat();
	    final SavingAccount savings=(SavingAccount) application.getBean("saving");
	    System.out.println(savings);
	    //service.deposit(withdraw);
	    service.withdraw(50000);
	    
	  
	    
	    //System.out.println("Enter details of Customer");
	    */
	    
	  
	    
	    
	  
	    
	    
	    
	
}
}
