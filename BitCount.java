/*A program which counts the number of non-zero bits in a given value.*/

import java.util.Scanner;

public class BitCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		String bi;

		for(int i = 0; i < n; i++) {

			int count = 0;
			a = sc.nextInt();
			bi = Integer.toBinaryString(a);

			for (int j = 0; j < bi.length(); j++) {
				if (bi.charAt(j) == '1') {
					count++;
				}
			}
			System.out.print(count + " ");
		}
		sc.close();
	}

}
