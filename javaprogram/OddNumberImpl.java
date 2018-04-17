package day2;

import java.util.Scanner;

public class OddNumberImpl
{
	public static void main(String[] args) {
		OddNumber number =new OddNumber();
		
		 boolean checkodd=number.getdata((odd)->{
			 System.out.println("Enter number");
				Scanner scan=new Scanner(System.in);
				int number1=scan.nextInt();
			
           if(number1 % 2 == 0)
			{
        	   System.out.println("Even");
				return false;
			}
			else
			{
				System.out.println("Odd");
				return true;
			}
          
		});	
		 
		
	}
}
	
	

