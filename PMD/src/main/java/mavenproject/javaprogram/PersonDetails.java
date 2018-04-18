package mavenproject.javaprogram;

//*********************************************************************** 
//	Program name : 			PhoneBook
//	Program Description :	adding details of an person,removing details of an person
//                          
//***********************************************************************

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class PersonDetails {
	
		public static void main(String[] args) {
		final Logger log = Logger.getLogger(PersonDetails.class.getName());
		final Person person= new Person();
		final List<Person> list= new ArrayList<Person>();	
		final Scanner scan=new Scanner(System.in);
			//Displaying menu
		log.info("PERSON DETAILS");
	    log.info("1. add data");
		log.info("2. remove data");
	    log.info("3. search by name");
		log.info("4. search by mobile number");
			
			//getting choice 
			
			while(true)
			{
				log.info("Please enter your choice");
				final int choice=scan.nextInt();
				
			switch(choice)
			{
			case 1:
			{
				//adding details of an person
				log.info("Enter person id:");
				final int id=scan.nextInt();
				person.setId(id);
				log.info("Enter your first name");
				final String firstName=scan.next();
				person.setFirstName(firstName);
				log.info("Enter your last name");
				final String lastname=scan.next();
				person.setLastName(lastname);
				log.info("Enter your mobile number");
				final Long mobile=scan.nextLong();
				person.setPhoneNumber(mobile);
				list.add(person);
				
				System.out.println(list);
				break;
			}
				
			case 2:
			{
				// removing details of an person on basis of name
				log.info("Enter person name:");
				System.out.println(list);
				final String firstname=scan.next();
				if(firstname.equals(person.getFirstName()));
				log.info("remove data");
				list.remove(person);
				System.out.println(list);
				if(list.isEmpty())
				{
					log.info("Your name has been deleted");
				}
				else
				{
					log.info("Your name has not been deleted");
				}
				break;
			}
				
			case 3:
			{
				// searching details of person by name
				log.info("Enter person name you want to search");
				final String name=scan.next();
			  if(name.equals(person.getFirstName()));
			  
			    for(Person person1:list)
			      if(person1.getFirstName().contains(name))
			      {
			    	 log.info("Details searched are" +list);
			      }
			
			    break;
			}
			case 4:
			{
				//searching details by person mobile number
				log.info("Enter person phone number you want to search");
			
				final Long Number=scan.nextLong();
				for(Person person2:list)
				{
					if(Number.equals(person2.getPhoneNumber()))
					{
						log.info("Details searched are"+list);
					}
				}
			    break;
			} 
			
			
			//searching details by person id
			
			case 5:
				
			{
				log.info("Enter person id:");
				final Integer id=scan.nextInt();
				for(Person person3:list)
				{
					if(id.equals(person3.getId()))
					{
						log.info("Details searched are"+list);
					}
				}
				break;
			}
		}
			
		}
		
		}
	}

