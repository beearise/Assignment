package assignments;

import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {
		// Program to reverse a number.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you want to reverse: ");
		int n = input.nextInt();

		int x = 0;
		while(n>0) {
			x = x*10;
			x = x+ n%10;
			
			n = n/10;
			
			
		}
		System.out.println(x);
		input.close();
	}

}
