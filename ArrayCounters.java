/*Imagine that some forester is trying to count pines, firs and birches on the
some section of wood. He can go through this section three times, counting only
pines on first pass, only firs on the second and only birches on the third.

More efficient way is to make only one pass through wood and for each tree add
a dot to one of tree pages in his notebook - the first page for pines, next for
firs and last for birches. That is the idea of counting similar elements in the
sequence using array of counters (instead of notebook).

Here is an array of length M with numbers in the range 1 ... N, where N is less
than or equal to 20. We are to go through it and count how many times each
number is encountered. */

import java.util.Scanner;

public class ArrayCounters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//length of array
		int c = sc.nextInt();				//numbers of counters

		int[] values = new int[n];  		//array for numbers
		int[] counter = new int[c];			// array for counters

		for (int i = 0; i < n; i++) {
			values[i] = sc.nextInt();		//add elements to array of numbers
		}

		for (int j = 0; j < n; j++) {
			counter[values[j] - 1]++;
		}

		for (int i = 0; i < c; i++) {
			System.out.print(counter[i] + " ");
		}
		sc.close();
	}
}
