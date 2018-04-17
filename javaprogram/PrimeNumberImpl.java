package day2;

import java.util.Scanner;

public class PrimeNumberImpl {
	public static void main(String[] args) {
		OddNumber number =new OddNumber();
		int checkprime=number.getprimedata((prime)->{
			System.out.println("Enter Number");
			Scanner scan=new Scanner(System.in);
			int numbers=scan.nextInt();
			int count=0;
			  for(int i=2; i<numbers; i++)
		        {
		            if(numbers%i == 0)
		            {
		                count++;
		                break;
		            }
		        }
		        if(count == 0)
		        {
		            System.out.print("Prime Number");
		        }
		        else
		        {
		            System.out.print("Composite Number");
		        }
			return 1;
		});
		 

}
}