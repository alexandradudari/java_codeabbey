/* Count how many vowels are in a given string.*/

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		String line;

		for (int i = 0; i < count; i++) {
			int vowelCount = 0;
			line = sc.nextLine();

			for (int j = 0; j < line.length(); j++) {
				switch (line.charAt(j)) {
				case 'a':
					vowelCount++;
					break;
				case 'e':
					vowelCount++;
					break;
				case 'i':
					vowelCount++;
					break;
				case 'o':
					vowelCount++;
					break;
				case 'u':
					vowelCount++;
					break;
				case 'y':
					vowelCount++;
					break;
				}
			}
			System.out.print(vowelCount + " ");
		}
		sc.close();

	}

}
