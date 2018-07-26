/* Given the coordonates for three points, calculate area of triangle with Heron's formula.*/

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double x1, y1, x2, y2, x3, y3;
		double a, b, c;
		double p;                     //semiperimeter
		double area;

		for (int i = 0; i < n; i++) {

			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();

			//calculate the three sides of triangle
			a = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
			a = Math.sqrt(a);

			b = Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2);
			b = Math.sqrt(b);

			c = Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2);
			c = Math.sqrt(c);

			//calculate semiperimeter
			p = (a + b + c) / 2;

			//calculate area
			area = p * (p - a) * (p - b) * (p - c);
			area = Math.sqrt(area);

			System.out.print(area + " ");
		}
		sc.close();
	}

}
