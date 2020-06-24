package assignments;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		// Print Factorial of a number.
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number you want to find the factorial of?");
		int n = input.nextInt();
		int x = 1;
		for(int i = 1; i<=n; i++) {
			x = x*i;
			
		}
		System.out.println("The factorial of "+n+" is: "+x+".");
		
		input.close();
		
	}
}

