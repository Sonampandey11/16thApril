package mavenproject.javaprogram;


/**********************************************************
 *Program:     Palindrome
 *Description: to determine whether number is palindrome or no
 **********************************************/	 
import java.util.Scanner;
import java.util.logging.Logger;



public class Palindrome {
	 //printing a palindrome of integer
	
		public static void main(String[] args) {
			final Logger log = Logger.getLogger(Palindrome.class.getName());
			String number, reverse="";
		      final Scanner scan = new Scanner(System.in);   
		      log.info("Enter an integer");  
		      number = scan.nextLine(); 
		      //find the length of an number
		   
			final int length = number.length();  
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + number.charAt(i);  
		      if (number.equals(reverse))  
		      {
		    	  
		         log.info("It is a palindrome."); 
		      }
		      else 
		      {
		         log.info("It is not a palindrome.");  
		      }
		   }  

}
