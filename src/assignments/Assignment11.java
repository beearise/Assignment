package assignments;

import java.util.Scanner;

public class Assignment11 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter a value for the first number: ");
		int f = input.nextInt();
		
		System.out.println("Enter a value for the second number: ");
		int s = input.nextInt();
		
		System.out.println("The first and second numbers you put in are "+f+ " and " +s+ " concurrently.");
		
		System.out.println("Do you want to use temp variable? if so type YES.");
		String d = input.next();
		
		if (d.contentEquals("YES")) {			
			
			f = f+s;
			s = f-s;
			f = f-s;			
			System.out.println("Now they are swapped f represents "+f+" and s represents "+s+".");
			System.out.println("without temp");
		
		}
		else {			
			
			int temp = f; //by using temp variable
			f = s;
			s = temp;
			System.out.println("Now they are swapped f represents "+f+" and s represents "+s+".");
		}
		
		
		
		
		
		
	}

}
