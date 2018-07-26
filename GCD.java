/*Greatest Common Divisor or GCD of a and b is such an integer value c that
both of a, b are divisible by it (e.g. leave no remainder) - and also c is the
largest possible. For example gcd(20, 35) = 5 and gcd(13, 28) = 1.
Euclid's algorithm is quite simple - we keep on subtracting smaller
value (of a and b) from larger - and repeat this operation until values become
equal - this last value will be gcd. For speeding up the process we can use
modulo operation instead of subtraction.*/

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b, c, r, x, y, m;
		for (int i = 0; i < n; i++) {

			a = sc.nextInt();
			b = sc.nextInt();

			x = a;
			y = b;
			if (b == 0) {
				c = a;
			} else {
				while (b != 0) {
					r = a % b;
					a = b;
					b = r;
				}
			c = a;
			}

			if (c == 0) {
				System.out.println("Both numbers are zero. Can not be calculated!");
			} else {
				if (x == 0 || y == 0) {
					System.out.println("Least Common Multiple can not be calculated!");
					System.out.println("GCD= " + c);
				} else {
					m = x*y/c;
					String s = String.format("(%d %d) ", c, m);
					System.out.print(s);
				}
			}

		}
		sc.close();
	}

}
