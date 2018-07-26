/*The simple measure of body constitution was proposed at the middle of XIX
century. It depends only on the height and weight of a person - and is called
Body Mass Index or BMI*/

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		float weight, height, bmi;

		for (int i = 0; i < count; i++) {

			weight = sc.nextFloat();
			height = sc.nextFloat();
			bmi = weight / (height * height);

			if (bmi < 18.5) System.out.print("under ");
			if (bmi >= 18.5 && bmi < 25.0) System.out.print("normal ");
			if (bmi >= 25.0 && bmi < 30.0) System.out.print("over ");
			if (bmi >= 30.0) System.out.print("obese ");
		}
		sc.close();
	}

}
