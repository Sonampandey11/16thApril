package mavenproject.bankapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.logging.Logger;

import mavenproject.bankapplication.bean.Address;
import mavenproject.bankapplication.bean.Bank;
import mavenproject.bankapplication.bean.Contact;
=======

import mavenproject.bankapplication.bean.Account;
import mavenproject.bankapplication.bean.Bank;
>>>>>>> 53e06f018329a432a719fed011937b22203e825b
import mavenproject.bankapplication.bean.Customer;
import mavenproject.bankapplication.bean.SavingAccount;



/**
 *
//*********************************************************************** 
//	Program name : 			BankingApplication
//	Program Description :	This project define about the various functionalities
//                        
//***********************************************************************

 */
public class App 
{
<<<<<<< HEAD
	private static final Logger log = Logger.getLogger(App.class.getName());
	public static void main( String[] args )
	{
		SavingAccount account=new SavingAccount();
		final List<Bank> list= new ArrayList<Bank>();
		log.info("Welocome to bank application");
		final Bank bank= new Bank("BankOfIndia", "Airoli");
		final Bank bank2=new Bank("StandardChartered","Vikhroli");
		final Bank bank3= new Bank("AxisBank","Thane");
		list.add(bank);
		System.out.println(bank);
		final List<Customer> list1=new ArrayList<Customer>();
		final Address address=new Address("airportroad","101","452005,", "mumbai");
		//Customer custom=new Customer(101,"Sonam","Pandey","xyz",address);
		Contact contact=new Contact(900121234,890765,"abc@gmail.com",address);
		Customer custom=new Customer(102,"Pooja","Jain","Jain");
		System.out.println(contact);
		list1.add(custom);
		System.out.println(custom);
		Scanner scan =new Scanner(System.in);
		//displaying menu
		while(true)
		{
		System.out.println("-------------------------------------");
		System.out.println("Please Enter Your Choice");
=======
    public static void main( String[] args )
    {
	    List<Bank> list= new ArrayList<Bank>();
	    System.out.println("Welocome to bank application");
		Bank bank= new Bank("BankOfIndia", "Airoli");
		Bank bank2=new Bank("StandardChartered","Vikhroli");
		Bank bank3= new Bank("AxisBank","Thane");
		list.add(bank);
		System.out.println(bank);
		
		
		List<Customer> list1=new ArrayList<Customer>();
		Customer custom=new Customer(101,"Sonam","Pandey","xyz");
		Customer customer=new Customer(102,"Pooja","Jain","Jain");
		list1.add(custom);
		System.out.println(custom);

		  
		System.out.println("-------------------------------------");
		
>>>>>>> 53e06f018329a432a719fed011937b22203e825b
		System.out.println("1.SavingAccount");
		System.out.println("2.CheckingAccount");
		System.out.println("3.FlexibleSavingAccount");
		System.out.println("4. exit");
<<<<<<< HEAD
		int choice=scan.nextInt();

		if(choice<1 || choice >4)
		{
			System.out.println("Invalid enter");
			continue;
		}
		else	
		{		
			switch(choice)
			{
			case 1:
			
				System.out.println("Welcome to Saving Account");
				System.out.println("Enter an amount to deposit");
				//Scanner scan=new Scanner(System.in);
				 float depositAmount=scan.nextFloat();
				account.deposit(depositAmount);
				//System.out.println();
				System.out.println("Enter an amount to withdraw");
				Scanner scann=new Scanner(System.in);
				 int withdrawAmount=scann.nextInt();
				account.withdraw(withdrawAmount);
				
				break ;
			
			case 2:
			
			
				System.out.println("Welcome to checking Amount");
				break;
			
			case 3:
			
				System.out.println("Welcome to flexibleSavingAmount");
				break;
			

			}
		}
		}
	}
	
		public void savingAccount1()
		{
			final SavingAccount saving=new SavingAccount();
			System.out.println(saving.getBalance());


		}

		public void flexibleSavingAmount()
		{

		}

		public void checkingAmount()
		{

		}
	}
=======
		Scanner scan =new Scanner(System.in);
    	String input=scan.next();
    	
		while(true)
		{
			System.out.println("Please Enter Your Choice");
            int choice=scan.nextInt();
			
		
			
			
		switch(choice)
		{
		case 1:
		{
		System.out.println("Welcome to Saving Account");
		String value=scan.next();
	

	          System.out.println("Would you like to: ");
	          System.out.println("1. Deposit Amount ");
	          System.out.println("2. Withdraw Amount ");
	          System.out.println("4. Check current balance ");
	          
       break ;
       
		
    	
		}
		case 2:
		{
			System.out.println("Welcome to checking Amount");
			break;
		}
		case 3:
		{
			System.out.println("Welcome to flexibleSavingAmount");
			break;
		}
		
		case 4:
		{
			
		}
		}
		}
    }
}
>>>>>>> 53e06f018329a432a719fed011937b22203e825b
