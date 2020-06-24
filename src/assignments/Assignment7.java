package assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		Scanner inputl = new Scanner(System.in);
		System.out.println("Enter value for Length : ");
		float l = inputl.nextFloat();
		
		Scanner inputr= new Scanner(System.in);
		System.out.println("Enter value for Radius of : ");
		float r = inputr.nextFloat();
		
		double V = r*r*l*3.14;
		
		
		
		System.out.println("Volume of cylinder is :" + V);


	}

}
