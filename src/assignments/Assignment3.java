package assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner inputa = new Scanner(System.in);
		
		System.out.println("Enter the first number:  ");
		
		int a = inputa.nextInt();
		
		Scanner inputb = new Scanner(System.in);
		
		System.out.println("Enter the second number:  ");
		
		int b = inputb.nextInt();
		
		
		int sum = a+b;
		System.out.println("The sum of these numbers is: " + sum);
		
		int average = sum/2;
		System.out.println("The average of these numbers is: " + average);

	}

}
