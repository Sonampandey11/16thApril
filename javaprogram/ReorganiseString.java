package day2;

import java.util.Scanner;

/*
 * program: to reorganize character so that they are not adjacent to each other
 */
public class ReorganiseString {
public static void main(String[] args) {
	   
	    String string="";
	    Scanner scan =new Scanner("Enter a string to be rearranged:");
	    String input=scan.next();
	    //converting string into sequence of character
	    char [] value=input.toCharArray();
	    int length=input.length();
	    int  count=0;
	    //checking index of an input and comparing
	    
	    for ( int i = length - 1; i >= 0; i-- )  
	   
	      if (value[i]!=value[i+1])  
	      {
	    	  
	         System.out.println("It is a palindrome."); 
	      }
	    for(int i =length;i>=0;i--)
	    {
	    	if(value[i]==value[i+1])
         {
	        
	          count++;
          }
	    	// Swapping of characters
	    	else
	    	{
	    		char temp;
	    		temp=value[i];
	    		value[i]=value[i+1];
	    		value[i+1]=temp;
	    		string=String.valueOf(value);
	    	}
	    	//if input are adjacent to each other for example aaa
	    	if( count!=3)
	    	{
	    		for(int j = length - 1; j >= 0; j--)
	    		{
	    			if(string.charAt(j)==string.charAt(j+1))
	    			{
	    				System.out.println("input is adjacent and cant be changed");
	    			}
	    			else
	    			{
	    				System.out.println("Expected data is"+string);
	    			}
	    		}
	    	}
	    }
}
}

	
