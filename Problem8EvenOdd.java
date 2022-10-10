package Day5;

import java.util.Scanner;

public class Problem8EvenOdd {
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

//        Getting input from user
		System.out.print("Enter a number: ");
		int num = number.nextInt();
//      If statement for finding a number even or odd
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}

}
