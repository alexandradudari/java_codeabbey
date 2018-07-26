/*Many mathematical problems are solved in programming not precisely,
but approximately, by several computations of the result, each of which is more
and more close to the goal.

Let us practice the method of approximate calculation of the square root with
 the following approach:

  *  Let us search for square root r of the given value X.
  *  Use some arbitrary value, say r = 1 as the first approximation
     (surely it is too rough).
  *  For proper square root the equation r = X / r should hold.
  *  So let us calculate d = X / r (it would not be equal to r since r is not
     precise root).
  *  And take average between r and d as the new approximation.

Return approximations for each case, separated by space.
*/

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();              //number of test cases

		int steps;
		double v, r, d;

		for (int i = 0; i < n; i++) {
			r = 1;
			v = sc.nextInt();
			steps = sc.nextInt();

			while (steps > 0) {
				d = v / r;
				r = (r + d) / 2;
				steps--;
			}
			System.out.print(r + " ");
		}
		sc.close();
	}

}
