/* Check the amount of passes and amount of swaps made before the given
 array becomes ordered. */

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();              //array size
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int temp;
		int passes = 0;
		int swaps = 0;
		boolean swapped = true;

		while (swapped == true) {
			swapped = false;
			for (int i = 0; i < n-1; i++) {
				if (nums[i] > nums[i+1]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					swaps++;
					swapped = true;
				}
			}
			passes++;
		}
		String s = String.format("%d %d", passes, swaps);
		System.out.println(s);
		sc.close();
	}

}
