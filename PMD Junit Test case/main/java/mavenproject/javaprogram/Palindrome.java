package mavenproject.javaprogram;

/**********************************************************
 *Program:     Palindrome
 *Description: to determine whether number is palindrome or no
 **********************************************/
import java.util.Scanner;
import java.util.logging.Logger;

public class Palindrome {
	// printing a palindrome of integer
	private static final Logger log = Logger.getLogger(Palindrome.class.getName());

	public static void main(String[] args) {
		final Logger log = Logger.getLogger(Palindrome.class.getName());
		String number;
		final Scanner scan = new Scanner(System.in);
		log.info("Enter an integer");
		number = scan.nextLine();
		// find the length of an number
		System.out.println(isPalindrome(number));

	}

	public static String isPalindrome(String number) {
		String reverse = "";
		final int length = number.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + number.charAt(i);
		if (number.equals(reverse)) {

			return "It is a palindrome.";
		} else {
			return "It is not a palindrome.";
		}

	}

}
