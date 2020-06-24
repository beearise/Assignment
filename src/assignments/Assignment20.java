package assignments;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number.");
		double a = input.nextDouble();
		
		System.out.println("Enter the second number. ");
		double b = input.nextDouble();
		
		System.out.println("what operation do you want to do?");
		String s = input.next();
		
		switch(s) {
		
			case "+": {
				System.out.println(a+b);
				break;
			}
			case "-":{
				System.out.println(a-b);
				break;
			}
			case "/":{
				System.out.println(a/b);
				break;
			}
			case "*":{
				System.out.println(a*b);
				break;
			}
			default:{
				System.out.println("WHat????");
				break;
			}
		
		}
		
	}

}
