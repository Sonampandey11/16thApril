package mavenproject.javaprogram;
/*
 * program: to reorganize character so that they are not adjacent to each other
 */

import java.util.Scanner;
import java.util.logging.Logger;


public class ReorganiseString {
	public static void main(String[]args) {
		final Logger log = Logger.getLogger(ReorganiseString.class.getName());

		String string = "";
		final Scanner scan = new Scanner("Enter a string to be rearranged:");
		final String input = scan.next();
		// converting string into sequence of character
		final char[] value = input.toCharArray();
		final int length = input.length();
		int count = 0;
		// checking index of an input and comparing

		for (int i = length - 1; i >= 0; i--)

			if (value[i] != value[i + 1]) {
				log.info("It is a palindrome");

			}
		for (int i = length; i >= 0; i--) {
			if (value[i] == value[i + 1]) {

				count++;
			}
			// Swapping of characters
			else {
				char temp;
				temp = value[i];
				value[i] = value[i + 1];
				value[i + 1] = temp;
				string = String.valueOf(value);
			}
			// if input are adjacent to each other for example aaa
			if (count != 3) {
				for (int j = length - 1; j >= 0; j--) {
					if (string.charAt(j) == string.charAt(j + 1)) {
						log.info("input is adjacent and cant be changed");
					} else {
						log.info("Expected data is" + string);
					}
				}
			}
		}
	}
}
