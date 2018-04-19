package mavenproject.javaprogram;

import java.util.Scanner;
import java.util.logging.Logger;
//*********************************************************************** 
//Program name : 			Contain Duplicate
//Program Description :	if it contains more than 2 character same then result is true 
//                       for eg apple else return false
//***********************************************************************
public class Index {
	static final Logger log = Logger.getLogger(Index.class.getName());
	public static void main(String[] args) {
		String input;
		  final Scanner scan= new Scanner(System.in);
		  log.info("Enter a String");
	 input=scan.nextLine();
			
		System.out.println(isDublicate(input));	
	}

	public static String isDublicate(String input) {
		
	
		final char[] array=input.toCharArray();
		int count =0;
		//
	   for(int i=0;i<input.length()-1;i++)
	   {
		  for (int j=i+1;j<input.length();j++)
		  {
			  //comparing the index of first charcter with second
			  if(array[i]==array[j])
			  {
				 count++;
				 
			  }
		  }
		
		  }
	   if(count>0)
	   {
		 return "true";
	   
		}
	   else
	   {
		   return "false";
	   }

	}
	
		

}
