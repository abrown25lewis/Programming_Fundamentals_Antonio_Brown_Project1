/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 1
 */

import java.util.Scanner;
import java.util.Random;
import java.lang.System;

public class Cipher {

	public static void main(String[] args) {

		// Create instance of classes
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		// setting up variables
		int cnum1, cnum2, cnum3, cnum4, cnum5, nsum = 0;
		// Variable for random numbers
		int rkey = gen.nextInt(20);

		// adding in header that will display at the start
		System.out.println("Programming Fundamentals ");
		System.out.println("NAME: Antonio Brown");
		System.out.println("Programming Assignment 1");
		System.out.println("\n"); // creates spacing in output
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enetr 5 numbers beween 0 and 19");

		// the if statement to determine if user enters in the right number
		// this continues until either the program errors out or all 5 numbers are
		// enetered
		System.out.print("1st number: ");
		cnum1 = scan.nextInt();

		if (cnum1 < 0 || cnum1 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("2nd number: ");
		cnum2 = scan.nextInt();

		if (cnum2 < 0 || cnum2 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("3rd number: ");
		cnum3 = scan.nextInt();

		if (cnum3 < 0 || cnum3 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("4th number: ");
		cnum4 = scan.nextInt();

		if (cnum4 < 0 || cnum4 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("5th number: ");
		cnum5 = scan.nextInt();

		if (cnum5 < 0 || cnum5 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		else {

			// Closes scanner
			scan.close();
			System.out.println("\n");
		}
		// Totaling the user inputs if all five are entered
		nsum = cnum1 + cnum2 + cnum3 + cnum4 + cnum5;

		// Calculating coded number for two digit numbers
		// Separating the ones and tens place
		int x = (nsum / 10);
		int y = (nsum % 10);

		// encoding each digit with random key
		x = (x + rkey) % 10;
		y = (y + rkey) % 10;

		// putting the code encoded numbers back together
		x = (x * 10) + y;

		System.out.println("Total = " + nsum);
		System.out.println("Your random key is " + rkey);
		System.out.println("Your encoded number is " + x);

	}

	}
