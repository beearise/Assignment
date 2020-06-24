package assignments;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		float p = input.nextFloat();
		
		float q = (float) (p*0.453592);
		
		System.out.println(p+" pounds in kilograms is: " +q+ "kg.");

	}

}
