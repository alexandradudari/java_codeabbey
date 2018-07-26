/*Cryptography is one of most interesting branches of programming.
Studying its algorithms usually begins with the simple method named after
famous Roman emperor Julius Caesar who used it for communicating his military
secrets (and perhaps for love letters to Cleopatra).

We will practice deciphering encrypted messages in this problem.

The idea of the algorithm is simple. Each letter of the original text is
substituted by another, by the following rule:

    * find the letter (which should be encrypted) in the alphabet;
    * move K positions further (down the alphabet);
    * take the new letter from here;
    * if "shifting" encountered the end of the algorithm, continue from its start.
*/


import java.util.Scanner;

public class CaesarShiftCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = 26 - sc.nextInt();
		String encrypted;

		for (int i = 0; i < n + 1; i++) {

			String decrypted = "";
			int d;
			encrypted = sc.nextLine();
			for (int j = 0; j < encrypted.length(); j++) {

				if(Character.isLetter(encrypted.charAt(j))) {
					d = (((encrypted.charAt(j) + key) - 65) % 26) + 65;
					decrypted += (char) d;

				}
				else {
					decrypted += encrypted.charAt(j);
				}
			}
			System.out.print(decrypted + " ");
		}
		sc.close();
	}

}
