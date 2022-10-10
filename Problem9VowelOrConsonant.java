package Day5;

public class Problem9VowelOrConsonant {
	public static void main(String[] args) {
// 			i stores in char variable
		char ch = 'i';
//			Now to check ch is vowel or constant we use if else statement
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");

	}
}
