/* Given several triplets of values representing lengths of the sides of triangles.
You should tell from which triplets it is possible to build triangle and for which it is not.*/

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a, b, c;

		for (int i = 0; i < count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if ((a + b > c) && (a + c > b) && (b + c > a))
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		sc.close();
	}

}
