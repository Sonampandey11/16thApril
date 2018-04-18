package day2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
/*
 Program: Retrieving details of person on basis of  id and phone number
 */
public class PersonDetails {
	public static void main(String[] args) {
		Person person= new Person();
		
	ArrayList<Person> list= new ArrayList<Person>();	
	Scanner scan=new Scanner(System.in);
		//Displaying menu
		System.out.println("PERSON DETAILS");
		System.out.println("1. add data");
		System.out.println("2. remove data");
		System.out.println("3. search by name");
		System.out.println("4. search by serial number");
		
		//getting choice 
		
		while(true)
		{
			System.out.println("Please enter your choice");
			int choice=scan.nextInt();
			
		switch(choice)
		{
		case 1:
		{
			//adding details of an person
			System.out.println("Enter person id:");
			int id=scan.nextInt();
			person.setId(id);
			System.out.println("Enter your first name");
			String firstName=scan.next();
			person.setFirstName(firstName);
			System.out.println("Enter your last name");
			String lastname=scan.next();
			person.setLastName(lastname);
			System.out.println("Enter your mobile number");
			Long mobile=scan.nextLong();
			person.setPhoneNumber(mobile);
			list.add(person);
			System.out.println(list);
			break;
		}
			
		case 2:
		{
			// removing details of an person on basis of name
			System.out.println("Enter person name:");
			System.out.println(list);
			String firstname=scan.next();
			if(firstname.equals(person.getFirstName()));
			System.out.println("remove data");
			list.remove(person);
			System.out.println(list);
			if(list.isEmpty())
			{
				System.out.println("Your name has been deleted");
			}
			else
			{
				System.out.println("Your name has not been deleted");
			}
			break;
		}
			
		case 3:
		{
			// searching details of person by name
			System.out.println("Enter person name you want to search");
			String name=scan.next();
		  if(name.equals(person.getFirstName()));
		  
		    for(Person person1:list)
		      if(person1.getFirstName().contains(name))
		      {
		    	 System.out.println("Details searched are" +list);
		      }
		
		    break;
		}
		case 4:
		{
			//searching details by person mobile number
			System.out.println("Enter person phone number you want to search");
			
			Long Number=scan.nextLong();
			for(Person person2:list)
			{
				if(Number.equals(person2.getPhoneNumber()))
				{
					System.out.println("Details searched are"+list);
				}
			}
		    break;
		} 
		
		
		//searching details by person id
		
		case 5:
			
		{
			System.out.println("Enter person id:");
			Integer id=scan.nextInt();
			for(Person person3:list)
			{
				if(id.equals(person3.getId()))
				{
					System.out.println("Details searched are"+list);
				}
			}
			break;
		}
	}
		
	}
	
	}
}
