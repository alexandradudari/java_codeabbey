import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    //initial integer number in the first line
		BigInteger n = sc.nextBigInteger();
		String op;
		BigInteger nextNum;


		op = sc.next();
		nextNum = sc.nextBigInteger();
		while (!(op.equals("%"))) {
			if (op.equals("+")) {
				n = n.add(nextNum);
			} else if (op.equals("*")) {
				n = n.multiply(nextNum);
			}
			op = sc.next();
			nextNum = sc.nextBigInteger();
		}
		n = n.mod(nextNum);
		System.out.println(n);
		sc.close();
	}

}
