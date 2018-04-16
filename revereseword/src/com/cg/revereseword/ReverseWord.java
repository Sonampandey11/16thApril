package com.cg.revereseword;

import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String string =scan.nextLine();
    System.out.println(reverseWord(string));
	
}
 static String reverseWord(String reverse)
	{
	 String[] array= reverse.split(" ");
	 StringBuilder builder =new StringBuilder();
	 for(String string1: array)
	 {
		 if(!string1.equals(""))
		 {
			 StringBuilder builder2=new StringBuilder(string1);
			 String reverse1=builder2.reverse().toString();
			 builder.append(reverse1+" ");
			 
		 }
	 }
		return builder.toString();
	}
	
		
	}


