/* Given an array of numbers, it should be sorted first (in non-decreasing order)
 - and then for each value its initial index should be printed (indexes start from 1)*/

import java.util.Scanner;
import java.util.ArrayList;

public class SortWithIndexes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			nums.add(sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			indexes.add(nums.get(i));
		}

		int temp;
		boolean swapped = true;

		while (swapped == true) {
			swapped = false;
			for (int i = 0; i < n-1; i++) {
				if (nums.get(i) > nums.get(i+1)) {
					temp = nums.get(i);
					nums.set(i, nums.get(i+1));;
					nums.set(i+1, temp);
					swapped = true;
				}
			}
		}
		int currentIndex = 0;
		for (int i = 0; i < n; i++) {
			currentIndex = indexes.indexOf(nums.get(i)) + 1;
			System.out.print(currentIndex + " ");
		}
		sc.close();
	}

}
