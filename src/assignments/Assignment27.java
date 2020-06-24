package assignments;

import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		// sum and product
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number.");
		int n = input.nextInt();
		int x = 0;
		int y = 0;
		int a = 1;
		int b = 0;
		while(n>0) {
			
			x = n%10;
			y = x+y;
			
			b = n%10;
			a = a*b;
			
			n = n/10;	
		}
		
		System.out.println("The sum of the numbers is: "+y);
		System.out.println("The product of the numbers is: "+a);
		input.close();
	}

}
