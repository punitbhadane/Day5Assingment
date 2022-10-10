package Day5;

import java.util.Scanner;

public class Problem5Factor {

	public static void main(String[] args) {
//		getting number input from user to find its factor
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find  its factors:: ");
		int num = sc.nextInt();
//		loop for getting Prime Factors
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				num = num / i;
				System.out.println("Prime factors are : " + i);
			}
		}
		sc.close();
	}
}
