/* Given several Fibonacci numbers, return their indices in the sequence.*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		BigInteger bigInt;
		final BigDecimal goldenRatio = BigDecimal.ONE.add(new BigDecimal(Math.sqrt(5))).divide(new BigDecimal(2));
		BigDecimal sen = new BigDecimal(0.37);
		//System.out.println(goldenRatio);

		for (int i = 0; i < n; i++) {
			BigDecimal div;
			int count = 0;
			bigInt = sc.nextBigInteger();
			BigDecimal bigDec = new BigDecimal(bigInt);
			div = bigDec.divide(goldenRatio, MathContext.DECIMAL128);

			while (div.compareTo(sen) >= 0) {
				div = div.divide(goldenRatio, MathContext.DECIMAL128);
				count++;
			}
			System.out.print(count + " ");
		}
		sc.close();
	}

}
