/*Linear function is defined by an equation:

y(x) = ax + b

Where a and b are some constants.
For example, with a=3, b=2 function will yield values y = 2, 5, 8, 11...
for x = 0, 1, 2, 3...

The task is to determine a and b by two points, belonging to the function.
I.e. you are told two pairs of values (x1, y1), (x2, y2) which satisfy the
function equation - and you should restore the equation itself.*/

import java.util.Scanner;

public class LinearFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//number of test-cases

		int x1, x2, y1, y2;

		for (int i = 0; i < n; i++) {
			int a = 0;
			int b = 0;

			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			a = (y2 - y1) / (x2 - x1);
			b = y1 - x1 * a;
			String s = String.format("(%d %d) ",a, b);
			System.out.print(s);
		}
		sc.close();
	}
}
