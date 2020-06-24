package assignments;

import java.util.Scanner;

public class Assignment6 {

public static void main(String[] args) {
		
		Scanner inputl = new Scanner(System.in);
		System.out.println("Enter value for Length : ");
		float l = inputl.nextFloat();
		
		Scanner inputb = new Scanner(System.in);
		System.out.println("Enter value for Breadth: ");
		float b = inputb.nextFloat();
		
		Scanner inputh = new Scanner(System.in);
		System.out.println("Enter value for third side of triangle: ");
		float h = inputh.nextFloat();
		
		Scanner inputr= new Scanner(System.in);
		System.out.println("Enter value for Radius of Circle: ");
		float r = inputr.nextFloat();
		
		double C = 2*r*3.14;
		
		double R = l+l+b+b;
		
		double T = l+b+h;
		
		System.out.println("Perimeter of circle is :" + C);
		System.out.println("Perimeter of rectangle is :" + R);
		System.out.println("Perimeter of triangle is :" + T);
		
	}

}
