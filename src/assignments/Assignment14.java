package assignments;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		double b = input.nextDouble();
		
		
		if(a>b) {
			System.out.println("The first number is greater.");
		}
		else if(a<b) {
			System.out.println("The second number is greater.");
		}else if(a == b) {
			System.out.println("They are equal.");
		}else {
			System.out.println("Please enter a valid numbers.");
		}

	}

}
