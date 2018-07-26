// Adds 300 numbers to an array and then finds the minimum and the maximum number.
import java.util.Scanner;

public class MaxMinOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[300];

		for (int i = 0; i < 300; i++) {
			nums[i] = sc.nextInt();
		}

		int min = nums[0];
		int max = nums[0];

		for (int i = 0; i < 300; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(max + " " + min);
		sc.close();
	}

}
