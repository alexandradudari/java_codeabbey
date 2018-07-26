/* When we speak about arithmetic progression (or arithmetic sequence) we mean a
 series of numbers with a special property - each value is followed by the other,
  greater by predefined amount (step).

Input data: first line contains the number of test-cases.
Other lines contain test-cases in form of triplets of values A B N
where A is the first value of the sequence, B is the step size and
N is the number of first values which should be accounted.
Answer: you are to output results (sums of N first members) for each sequence,
separated by spaces. */
 

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int a, step, nrTerms;

		for (int i = 0; i < count; i++) {

			int result = 0;
			int n = 0;

			a = sc.nextInt();
			step = sc.nextInt();
			nrTerms = sc.nextInt();

			while (n < nrTerms) {
				result += a + (n * step);
				n++;
			}
			System.out.print(result + " ");
		}
		sc.close();
	}

}
