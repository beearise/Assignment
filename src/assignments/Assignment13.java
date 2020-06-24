package assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String n = input.nextLine();
		
		System.out.println("Enter the nationality: ");
		String a = input.nextLine();
		
		System.out.println("Enter the roll: ");
		int r = input.nextInt();
		
		System.out.println(n+" whose nationality is "+a+" has the roll No. of "+r+".");
		
	}

}
