package mavenproject.javaprogram;

import java.util.Scanner;
import java.util.logging.Logger;

//*********************************************************************** 
//	Program name : 			Calculator
//	Program Description :	Create a generic function power and return result 
//                           after the n^p operation is perform.
//                    
//***********************************************************************

public class MyCalculator {

	public static void main(String[] args) throws CalculatorException {
		final Logger log = Logger.getLogger(MyCalculator.class.getName());
		long result;
		final Scanner scan = new Scanner(System.in);
		log.info("Enter the value of n");
		final Integer n = scan.nextInt();
		log.info("Enter the value of p");
		final Integer p = scan.nextInt();
		result = power(n, p);
		System.out.println(result);
	}

	// creating a power function to calculate for eg result=3^4
	public static long power(int n, int p) throws CalculatorException 

	{
		int num = 1;
		if (n <= 0 && p <= 0) {

			throw new CalculatorException("n and p should not be zero");

		} else if (n <= -1 && p <= -1) {
			throw new CalculatorException("n and p should not be negative");
		}

		else {
			//calculating power function eg n=3 and p=2 then num=1*3 
			// and so on ...
			for (int i = 1; i <= p; i++) {
				num = num * n;

			}
		}

		return num;

	}

}
