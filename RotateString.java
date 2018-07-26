/* To rotate string by K characters means to cut these characters from the
 beginning and transfer them to the end. If K is negative, characters,
 on contrary should be transferred from the end to the beginning.*/

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();              //number of test-cases
		int k;							   //rotate string by k characters
		String s;
		int len;


		for (int i = 0; i < n; i++) {
			String charT = "";
			String result = "";
			k = sc.nextInt();
			s = sc.next();
			len = s.length();

			if (k < 0) {
				charT = s.substring(len + k);
				result += charT + s.substring(0, len + k);
			} else {
				charT = s.substring(0, k);
				result += s.substring(k, len) + charT;
			}
			System.out.print(result + " ");
		}
		sc.close();
	}

}
