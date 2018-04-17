package day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		OddNumber number =new OddNumber();
		int checkpalindrome=number.getpalindrome((palindrome)->{
			
			System.out.println("Enter Number");
			Scanner scan=new Scanner(System.in);
			String number1, reverse="";
		        
		     String digit = scan.nextLine(); 
		      //find the length of an number
		      int length = digit.length();  
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + digit.charAt(i);  
		      if (digit.equals(reverse))  
		      {
		    	  
		         System.out.println("palindrome."); 
		      }
		      else 
		      {
		         System.out.println("not palindrome.");  
		      }
		   return 1;
		});
	}

}
