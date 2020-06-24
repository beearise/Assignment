package assignments;

import java.util.Scanner;


public class Assignment4 {

	public static void main(String[] args) {
		
		Scanner inputp = new Scanner(System.in);
		System.out.println("Enter value for P: ");
		float P = inputp.nextFloat();
		
		
		Scanner inputt = new Scanner(System.in);
		System.out.println("Enter value for T: ");
		float T = inputt.nextFloat();		
		
		Scanner inputr = new Scanner(System.in);
		System.out.println("Enter value for R: ");
		float R = inputr.nextFloat();
		
		float SI = P*T*R/100;
		System.out.println("The simple interest is : " + SI);

	}

}
