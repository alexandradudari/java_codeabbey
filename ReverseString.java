import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();

		String result = "";
		int len = word.length();

		for (int i = len - 1; i >= 0; i--) {
			result += word.charAt(i);
		}

		System.out.println(result);
	}
}
