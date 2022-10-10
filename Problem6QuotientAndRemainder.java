package Day5;

import java.util.Scanner;

public class Problem6QuotientAndRemainder {
	public static void main(String[] args) {
//		getting input of dividend and divisor 
		Scanner div = new Scanner(System.in);
		System.out.println("Enter divedent : ");
		int dividend = div.nextInt();
		Scanner divi = new Scanner(System.in);
		System.out.println("Enter divisor :");
		int divisor = divi.nextInt();
		// Formula for getting Quotient and Reminder
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
//		printing statement for Quotient and Reminder
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

}
