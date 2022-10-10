package Day5;

import java.util.Scanner;

public class Problem7SwipeNumbers {

	public static void main(String[] args) {
		Scanner fir = new Scanner(System.in);
//		Getting input from user First number
		System.out.println("Enter First Number : ");
		int first = fir.nextInt();
//		Getting input from user Second number
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int second = sec.nextInt();
// 		Printing Before swapping number first and second
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		// Value of first is assigned to temporary
		int temp = first;

		// Value of second is assigned to first
		first = second;

		// Value of temporary (which contains the initial value of first) is assigned to
		// second
		second = temp;
// 		Printing After swapping number first and second
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}
