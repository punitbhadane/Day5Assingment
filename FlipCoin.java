package Day5;

import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		Random num = new Random();
		float total = 0;
		float perc;

		int toss;
//	      For loop for getting random number
		for (int i = 1; i <= 5; i++) {
			toss = num.nextInt(2);
			total = total + toss;
//	         Hear printing random number
			System.out.print(toss + " ");
		}
		System.out.println();
		System.out.println(total);
		perc = total / 5;
		System.out.println(perc);
		float percentage = perc * 100;
//		Hear print all result
		System.out.println(" Percentage Of Getting Head is " + percentage);
		System.out.println(" Percentage of Getting Tail is " + (100 - percentage));
		System.out.println(" Congratulations Your Result is: ");
		if (perc < 0.5) {
			System.out.println(" Tails");
		} else {
			System.out.println(" Heads");
		}
	}
}
