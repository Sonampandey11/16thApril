package com.cg.duplicate;

import java.util.Scanner;

public class Index {
public static void main(String[] args) {
		
   Scanner scan= new Scanner(System.in);
	System.out.println("Enter a String");
	String input=scan.nextLine();
	char[] array=input.toCharArray();
	int count =0;
	
   for(int i=0;i<input.length()-1;i++)
   {
	  for (int j=i+1;j<input.length();j++)
	  {
		  if(array[i]==array[j])
		  {
			 count++;
			 
		  }
	  }
	
	  }
   if(count>0)
   {
	  System.out.println("true");
   
	}
   else
   {
	   System.out.println("false");
   }

}
}
