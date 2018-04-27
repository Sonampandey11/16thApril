package com.cg.controller;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.Account;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.model.Statement;
import com.cg.service.CustomerImpl;
import com.cg.service.ICustomerService;
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
       // log.info("Enter your customId");
		final Scanner scan = new Scanner(System.in);
		log.info("Enter amount to deposit");
		final float depositAmount=scan.nextFloat();
        service.deposit(depositAmount);

		//performing withdraw from savingAccount
		log.info("Enter an amount to withdraw");
		final float withdrawAmount=scan.nextFloat();
		service.withdraw(withdrawAmount);
		System.out.println(withdrawAmount);

		//adding details of customer
		final Customer custom=(Customer) application.getBean("customerAdd");
		final Customer custom2=(Customer) application.getBean("cus");
		Set<Customer> setvalue=new HashSet<>();
		setvalue.add(custom);
		setvalue.add(custom2);
		setvalue.add(customer1);
		// System.out.println(setvalue);

		//viewById details of Customer
		System.out.println("Enter customerId");
		Integer customId=scan.nextInt();

		if(customId.equals(custom.getCustomerId()))
				{
                System.out.println(setvalue);

				}
		/* if(customer1.getCustomerId()==customId || custom.getCustomerId()==customId || custom2.getCustomerId()==customId)
	    {
	    	System.out.println(setvalue);
	    }

	    else
	    {
	    	System.out.println("please enter correct customerId ");
	    }*/



		//displaying ministatement of transaction
       


		//displaying details of customer on basis of customerId

		final Account acccount=(Account) application.getBean("accountId");
		System.out.println(acccount);	    
   



		//update Customer Details
		final ICustomerService serviceDetail=(CustomerImpl) application.getBean("customerservice");
		log.info("enter the customerId that you want to update");
		final Integer customerId=scan.nextInt();
		if(customerId==custom.getCustomerId())
		{
			System.out.println("Enter your firstNAme you want to change");
			String name=scan.next();
			serviceDetail.updateCustomerDetails(custom, name);
			System.out.println("Updated details of customer"+custom);
		}
		else
		{
			log.info("please enter valid customer detail");
		}


      //delete details of customer
		log.info("Enter customerId that you want to delete");
		Integer cId=scan.nextInt();
		if(cId==custom.getCustomerId())
		{
			serviceDetail.deleteCustomerDetails(custom, null);
			log.info("Deleted data of customer");
		}
		else
		{
		   log.info("Please enter valid emailId");
		}
		
       
		


		/*
	    System.out.println(savings);
	    //service.deposit(withdraw);
	    service.withdraw(50000);



	    //System.out.println("Enter details of Customer");
		 */









	}
}
