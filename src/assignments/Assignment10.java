package assignments;

import java.util.Scanner;
import java.lang.Math;

public class Assignment10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for u: ");
		float u = input.nextFloat();
		
		System.out.println("Enter value for t: ");
		float t = input.nextFloat();
		
		System.out.println("Enter value for a: ");
		float a = input.nextFloat();
		
		System.out.println("Enter value for b: ");
		float b = input.nextFloat();
		
		System.out.println("Enter value for c: ");
		float c = input.nextFloat();
		
		
		double s = (u*t)+0.5*a*t*t;
		
		System.out.println("The value of s is "+s+".");
		
		double r = (s*(s-a)*(s-b)*(s-c));
		double area = Math.sqrt(r);
		
		System.out.println("The area is "+area+".");
		
		double o = b*b-4*a*c;
		
		if (o>0.0) {
			double r1 = (-b + Math.pow(o, 0.5))/(2*a);
			double r2 = (-b - Math.pow(o, 0.5))/(2*a);
			System.out.println("The roots are " +r1+ "and " +r2);;
			
		}else if(o==0.0){
			double r1 = -b/(2*a);
			System.out.println("The root is "+r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}

	}

}
