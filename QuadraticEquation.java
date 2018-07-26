import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long a, b, c, delta, x1, x2;

		for (int i = 0; i < n; i++) {

			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			delta = b*b - 4*a*c;

			if (delta < 0) {
				delta *=-1;
				delta = Math.round(Math.sqrt(delta));
				delta = Math.round(delta/(2*a));

				b = ((-1)*b)/(2*a);
				b = Math.round(b);
				String s = String.format("%d+%di %d-%di; ", b, delta, b, delta);
				System.out.print(s);

			} else if (delta == 0) {

				x1 = ((-1)*b)/(2*a);
				x2 = x1;
				String s = String.format("%d %d; ", x1, x2);
				System.out.print(s);

			} else {

				x1 = (((-1)*b) + (int) Math.sqrt(delta))/(2*a);
				x2 = (((-1)*b) - (int) Math.sqrt(delta))/(2*a);
				String s = String.format("%d %d; ", x1, x2);
				System.out.print(s);
			}
		}
		sc.close();
	}

}
