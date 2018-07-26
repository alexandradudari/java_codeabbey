/* There are several pairs of numbers. For each pair you are to divide first by
second and return the result, rounded to the nearest integer.*/

import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		double z = 0;

		for (int i = 0; i < count; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			z = a/b;
			if (z % 1 >= .5) {
				z += 1 - z % 1;
			} else {
				z += z % 1;
			}
			System.out.print((int) (z) + " ");
		}
		sc.close();
	}
}
