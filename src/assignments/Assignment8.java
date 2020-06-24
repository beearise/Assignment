package assignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature you want to convert. ");
		float v = input.nextFloat();

		System.out.println("Is this in Farhenheit or Celcius? Enter 1 for Farhenheit or 2 for Celcius. ");
		int s = input.nextInt();

		if (s == 1) {
			float C = (v - 32) * 0.55f;
			System.out.println("The temperature in Celcius is : " + C + "C");

		} else {

			System.out.println("what?");
		}

	}

}
