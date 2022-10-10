package Day5;

import java.util.Scanner;

public class Problem4HarmonicNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type number : ");
//		get number input from user and store it n variable
		int n = sc.nextInt();
		sc.close();
		double sum = 0;
//		loop to apply the formula
		for (int i = 1; i <= n; i++) {
			sum = sum + 1 / i;
		}
		System.out.println(sum);
	}
}