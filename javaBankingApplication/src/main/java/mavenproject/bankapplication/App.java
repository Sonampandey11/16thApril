package mavenproject.bankapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import mavenproject.bankapplication.bean.Address;
import mavenproject.bankapplication.bean.Bank;
import mavenproject.bankapplication.bean.CheckingAccount;
import mavenproject.bankapplication.bean.Contact;
import mavenproject.bankapplication.bean.Customer;
import mavenproject.bankapplication.bean.FlexibleSavingAccount;
import mavenproject.bankapplication.bean.SavingAccount;



/**
 *
//*********************************************************************** 
//	Program name : 			BankingApplication
//	Program Description :	This project define about the various functionalities
 *                          to withdraw money and deposit money
 */
//                        
//***********************************************************************


public class App 
{
	private static final Logger log = Logger.getLogger(App.class.getName());
	public static void main( String[] args )
	{
		//SavingAccount account=new SavingAccount();
		final List<Bank> list= new ArrayList<Bank>();
		log.info("Welocome to bank application");
		final Bank bank= new Bank("BankOfIndia", "Airoli");
		final Bank bank2=new Bank("StandardChartered","Vikhroli");
		final Bank bank3= new Bank("AxisBank","Thane");
		list.add(bank);
		System.out.println(bank);
		final List<Customer> list1=new ArrayList<Customer>();
		final Address address=new Address("airportroad","101","452005,", "mumbai");
		Customer custom=new Customer(101,"Sonam","Pandey","xyz");
		Contact contact=new Contact(900121234,890765,"abc@gmail.com",address);
		//Customer custom=new Customer(102,"Pooja","Jain","Jain");
		System.out.println(contact);
		list1.add(custom);
		System.out.println(custom);
		System.out.println(bankingApplication());

	}
	
	public static int bankingApplication(){
		{
			SavingAccount account=new SavingAccount();
			Scanner scan=new Scanner(System.in);
			//displaying menu
			while(true)
			{
				System.out.println("-------------------------------------");
				System.out.println("Please Enter Your Choice");
				System.out.println("1.SavingAccount");
				System.out.println("2.CheckingAccount");
				System.out.println("3.FlexibleSavingAccount");
				System.out.println("4. exit");
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
						account.transaction();				
						break ;

					case 2:

						CheckingAccount accc= new CheckingAccount();
						System.out.println("Welcome to checking Amount");
						//float checkingBalance=scan.nextFloat();
						accc.transaction();

						break;

					case 3:
						FlexibleSavingAccount saving=new FlexibleSavingAccount();		
						System.out.println("Welcome to flexibleSavingAmount");
						saving.transaction();
						break;
					case 4:
						System.out.println("Thank You");
						System.exit(0);

					}
				}
			}
		}
	}

	public void savingAccount1()
	{
		final SavingAccount saving=new SavingAccount();
		System.out.println(saving.getBalance());


	}

}
