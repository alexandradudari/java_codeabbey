/*Given two polynomials represented by two arrays, write a function that
multiplies given two polynomials*/

public class MultiplyTwoPolynomials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poly1 = {5, 0, 10, 6};
		int[] poly2 = {1, 2, 4};

		int m = poly1.length;
		int n = poly2.length;
		int len = m + n - 1;
		int[] prod = new int[len];

		for (int i = 0; i < len; i++) {
			prod[i] = 0;
		}

		for (int i = 0; i < m; i++) {
			for (int j= 0; j < n; j++) {
				prod[i+j] += poly1[i] * poly2[j];
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(prod[i] +" ");
		}

	}

}
