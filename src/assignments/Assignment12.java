package assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a negative number: ");
		double n = input.nextDouble();
		
		if(n<0) {
			System.out.println("The number you entered is: "+n+".");
		}
		else{
			System.out.println("The number is not negative!");
		}

	}

}
