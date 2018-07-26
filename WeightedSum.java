/* Let us calculate sum of digits, as earlier, but multiplying each digit by its
position (counting from the left, starting from 1). For example, given the value
 1776 we calculate such weighted sum of digits (let us call it "wsd") as:

            wsd(1776) = 1 * 1 + 7 * 2 + 7 * 3 + 6 * 4 = 60
*/

import java.util.Scanner;

public class WeightedSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a, aCopy, reminder;

		for (int i = 0; i < count; i++) {

			int lenOfa = 0;
			int result = 0;
			a = sc.nextInt();
			aCopy = a;

			//determine the numbers of digits
			while (aCopy > 0) {
				aCopy /= 10;
				lenOfa++;
			}

			while (lenOfa > 0) {
				reminder = a % 10;
				a /= 10;

				result += reminder * lenOfa;
				lenOfa--;
			}
			System.out.print(result + " ");
		}
		sc.close();
	}

}
