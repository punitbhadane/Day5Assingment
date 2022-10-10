package Day5;

import java.util.Scanner;

public class Poblem10LargestThreeNumbers {

	public static void main(String[] args)

	{
//		 first declare 3 variable int type
		int a, b, c;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the first number:");
		a = num.nextInt();
		System.out.print("Enter the second number:");
		b = num.nextInt();
		System.out.print("Enter the third number:");
		c = num.nextInt();
//	        with use of if else statement compare with each other which no is large
		if (a > b && a > c) {
			System.out.println("Largest number is:" + a);
		} else if (b > c) {
			System.out.println("Largest number is:" + b);
		} else {
			System.out.println("Largest number is:" + c);
		}

	}
}
