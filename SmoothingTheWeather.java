/* Little Merlin wants to become a meteorologist. He measures the temperature
of the air each hour so that after several days he has a long sequence of values.

However, his instruments are not ideal so the measurements are not exact - they
randomly jump up and down by several degrees from the real values.

Observing this, Merlin decided to make his data more smooth. To achieve this he
only needs every value to be substituted by the average of it and its two
neighbors. For example, if he have the sequence of 5 values like this:

              3 5 6 4 5

Then the second (i.e. 5) should be substituted by (3 + 5 + 6) / 3 = 4.66666666667,
the third (i.e. 6) should be substituted by (5 + 6 + 4) / 3 = 5,
the fourth (i.e. 4) should be substituted by (6 + 4 + 5) / 3 = 5.
By agreement, the first and the last values will remain unchanged.*/

import java.util.Scanner;

public class SmoothingTheWeather {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] nums = new double[n];
		double[] smooth = new double[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				smooth[0] = nums[0];
			} else if (i == n - 1) {
				smooth[n - 1] = nums[n - 1];
			} else {
			smooth[i] = (nums[i - 1] + nums[i] + nums[i + 1]) / 3;
			}
			System.out.print(smooth[i] + " ");
		}

		sc.close();
	}

}
