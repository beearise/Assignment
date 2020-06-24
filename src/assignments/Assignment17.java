package assignments;

import java.util.Scanner;

public class Assignment17 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int a = input.nextInt();
		
		if(a%4 == 0){
			if(a%100 == 0){
				if(a%400 == 0) {
					System.out.println("It is a leap year.");
				}else {
					System.out.println("It is not a leap year.");
				}
			}else {
				System.out.println("It is a leap year.");
			}
			
		}else {
			System.out.println("It is not a leap year");
		}
		

	}

}
