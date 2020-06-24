package assignments;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double a = input.nextDouble();
		
		if (a>0){
			if (a%2 == 0) {
				System.out.println("The number is even.");
			}
			else {
				System.out.println("The number is odd.");
			}
		}else {
			System.out.println("Please enter a valid number.");
		}

	}

}
