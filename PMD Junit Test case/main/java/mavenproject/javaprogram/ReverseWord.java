package mavenproject.javaprogram;

import java.util.Scanner;
import java.util.logging.Logger;


/************************************************************************************
 * Program Name: Reverse String
 * Description : reverse the order of charecter in each word within sentence 
 ***********************************************************************************/


public class ReverseWord {
	public static void main(String[] argsS) {
		final Logger log = Logger.getLogger(ReverseWord.class.getName());
		final Scanner scan = new Scanner(System.in);
		log.info("Enter a sentence");
		final String string =scan.nextLine();
	    log.info(reverseWord(string));
		
	}
	 
	static String reverseWord(final String reverse)
		{
		final String[] array= reverse.split(" ");
		final StringBuilder builder =new StringBuilder();
		 for(final String string1: array)
		 {
			 if(!string1.equals(""))
			 {
				 final StringBuilder builder2=new StringBuilder(string1);
				 final String reverse1=builder2.reverse().toString();
				 builder.append(reverse1+" ");
				 
			 }
		 }
			return builder.toString();
		}
		

}
