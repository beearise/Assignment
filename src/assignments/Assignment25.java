package assignments;

import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {
		// Student with highest score
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int s = input.nextInt();
		float maxScore = 0;
		String maxName = null;
		float x2=0;
		
		
		for(int i=1; i<=s; i++) {
			System.out.println("Enter the first name of student: ");
			String n = input.next();
			System.out.println("Enter their score: ");
			float x = input.nextFloat();
			
			
			if(x>=x2) {
				x2=x;
				maxScore = x;
				maxName = n;
			}
		}
		System.out.println("The Student with highest score is "+maxName+" with the score of "+maxScore+".");
		
		
	}

}
