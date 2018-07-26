/* Given triplets of numbers, the middle of them should be chosen -
i.e. not the largest and not the smallest one.
Such number is called the Median (of the set, array etc)*/

import java.util.Scanner;

public class MedianOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a, b, c;

		for (int i = 0; i < count; i++) {
			int median = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if ((a > b && a < c) || (a > c && a < b)) median = a;
			if ((b > a && b < c) || (b > c && b < a)) median = b;
			if ((c > a && c < b) || (c > b && c < a)) median = c;

			System.out.print(median + " ");
		}
		sc.close();
	}
}
