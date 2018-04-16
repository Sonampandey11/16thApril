package com.cg.palindrome;

import java.util.Scanner;

public class Palindrome {
   //printing a palindrome of integer
	public static void main(String[] args) {
		String number, reverse="";
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter an integer");  
	      number = scan.nextLine(); 
	      //find the length of an number
	      int length = number.length();  
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + number.charAt(i);  
	      if (number.equals(reverse))  
	      {
	    	  
	         System.out.println("It is a palindrome."); 
	      }
	      else 
	      {
	         System.out.println("It is not a palindrome.");  
	      }
	   }  
	
}
