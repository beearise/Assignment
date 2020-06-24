package assignments;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a ASCII code.(any number between 0-128).");
		int a = input.nextInt();
		
		
		if (a>=0 && a<=128) {
			
			if(a<32) {
				System.out.println("The ASCII code is for unprintable character.");
			}
			else if(a>32) {
				char c = (char)a;
				System.out.println("The character for that ASCII code is: (" +c+") .");
			}
			
		}
		else {
			System.out.println("Please enter a number between 0-128");
		}
	}

}
