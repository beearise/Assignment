package assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner inputl = new Scanner(System.in);
		System.out.println("Enter value for Length : ");
		float l = inputl.nextFloat();
		
		Scanner inputb = new Scanner(System.in);
		System.out.println("Enter value for Breadth: ");
		float b = inputb.nextFloat();
		
		Scanner inputh = new Scanner(System.in);
		System.out.println("Enter value for Height: ");
		float h = inputh.nextFloat();
		
		Scanner inputr= new Scanner(System.in);
		System.out.println("Enter value for Radius: ");
		float r = inputr.nextFloat();
		
		double C = r*r*3.14;
		
		double R = l*b;
		
		double T = h*l/2;
		
		System.out.println("Area of circle is :" + C);
		System.out.println("Area of rectangle is :" + R);
		System.out.println("Area of triangle is :" + T);
		
	}

}
