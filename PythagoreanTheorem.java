/* Triangle is called right when one of its three angles is right angle, equal
to 90° - i.e. sides of this angle are orthogonal.

Such triangles are important since for them the Pythagorean Theorem works.

Sides, adjacent to the right angle of such triangle, are called legs and
the third side is hypotenuse. The theorem states that length of hypotenuse
is determined by the lengths of legs with simple formula:
              c^2 = a^2 + b^2
In this task you will use this theorem to write a program which could determine,
 whether the triangle is right, or it is acute, or obtuse:

  * for acute triangle its longest side is shorter than hypotenuse should be;
  * for obtuse triangle its longest side is longer than hypotenuse should be.
*/

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double a, b, c, h1, h2;

		for (int i = 0; i < n; i++) {

			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			h1 = a*a + b*b;
			h2 = c*c;
			if (h1 == h2) {
				System.out.print("R ");
			} else if (h1 > h2) {
				System.out.print("A ");
			} else if (h1 < h2) {
				System.out.print("O ");
			}
		}
		sc.close();
	}

}
