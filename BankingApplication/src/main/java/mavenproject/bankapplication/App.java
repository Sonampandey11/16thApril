package mavenproject.bankapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		
		System.out.println("Enter balance you want to deposit");
		Scanner scan= new Scanner(System.in);

    	
    	
    	
    	
    	
    }
}
