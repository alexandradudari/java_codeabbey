/* The Collatz conjecture is a conjecture in mathematics that concerns a
 sequence defined as follows: start with any positive integer n. Then each term
 is obtained from the previous term as follows: if the previous term is even,
 the next term is one half the previous term. If the previous term is odd,
 the next term is 3 times the previous term plus 1. The conjecture is that
 no matter what value of n, the sequence will always reach 1. */

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;

		for (int i = 0; i < n; i++) {
			int count = 0;
			a = sc.nextInt();
			while (a != 1) {
				if (a % 2 == 0) {
					a /= 2;
					count++;
				} else {
					a = 3 * a + 1;
					count++;
				}
			}
			System.out.print(count + " ");
		}
		sc.close();
	}
}
