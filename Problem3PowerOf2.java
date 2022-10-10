package Day5;

public class Problem3PowerOf2 {
	public static void main(String[] args) {

        // read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int i = 0;                // count from 0 to N
        int powerOfTwo = 0;       // the ith power of two

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}

