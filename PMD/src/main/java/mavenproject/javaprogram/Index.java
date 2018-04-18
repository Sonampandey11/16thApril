package mavenproject.javaprogram;

import java.util.Scanner;
import java.util.logging.Logger;
//*********************************************************************** 
//Program name : 			Contain Duplicate
//Program Description :	if it contains more than 2 character same then result is true 
//                       for eg apple else return false
//***********************************************************************
public class Index {
	public static void main(String[] args) {
		final Logger log = Logger.getLogger(Index.class.getName());
		  final Scanner scan= new Scanner(System.in);
			log.info("Enter a String");
			final String input=scan.nextLine();
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
			  log.info("true");
		   
			}
		   else
		   {
			   log.info("false");
		   }

		}

}
