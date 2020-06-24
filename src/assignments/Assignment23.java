package assignments;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		// sum 1 to nth natural number
		
		Scanner input = new Scanner(System.in);
		System.out.println("Up to what number do you want the sum?");
		int n = input.nextInt();
		int x = 0;
		for(int i = 1; i<=n; i++) {
			x = x+i;
			
		}
		System.out.println("The sum of numbers up to "+n+" is: "+x+".");
		
		input.close();
		
	}
}
