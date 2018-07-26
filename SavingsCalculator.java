/* Calculate how many years it is need to wait depending on given starting
amount of money S, required sum R and bank's interest rate P.
At the end of each year account is increased and rounded down to whole cents */

import java.util.Scanner;

public class SavingsCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();             //number of test-cases

		double s, r, p;

		for (int i = 0; i < n; i++) {
			s = sc.nextDouble();          //given starting amount of money
			r = sc.nextDouble();          //required sum
			p = sc.nextDouble();          //bank's interest rate

			int years = 0; 			      //number of years

			while (s < r) {
				s += s * (p / 100);
				years++;
			}
			System.out.print(years + " ");
		}
		sc.close();
	}
}
