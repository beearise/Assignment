package assignments;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first side of the triangle: ");
		double a = input.nextDouble();
		
		System.out.println("Please enter the second side of the triangle: ");
		double b = input.nextDouble();
		
		System.out.println("Please enter the third side of the triangle: ");
		double c = input.nextDouble();
		
		if(a == b && a == c) {
			System.out.println("It is an equilateral Traiangle.");
		}else if (a==b && a != c){
			System.out.println("It is an Isosceles Triangle.");
		}else if (a==c && a!=b ) {
			System.out.println("It is an Isosceles Triangle.");
		}else if (b==c && b!=a) {
			System.out.println("It is an Isosceles Triangle.");
		}else {
			System.out.println("It is a Scalene Triangle.");
		}

	}

}
