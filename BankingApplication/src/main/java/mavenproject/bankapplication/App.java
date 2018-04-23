package mavenproject.bankapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mavenproject.bankapplication.bean.Account;
import mavenproject.bankapplication.bean.Bank;
import mavenproject.bankapplication.bean.Customer;
import mavenproject.bankapplication.bean.SavingAccount;

/**
 * Hello world!
 *
 */
public class App 
{
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
		
		System.out.println("1.SavingAccount");
		System.out.println("2.CheckingAccount");
		System.out.println("3.FlexibleSavingAccount");
		System.out.println("4. exit");
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
