package assignments;

import java.util.Scanner;

public class Assignment30 {
	
	
	public void fibonacci(int a) {
		int j = 1;
		int k = 0;
		int l = 0;
		System.out.println(k);
		
		for(int i = 2; i<=a; i++) {
			
			l = j+k;
			j=k;
			k=l;
			
			
			System.out.println(l);
			
		}
	}

	public static void main(String[] args) {
		// Fibonacci
		
		Scanner input = new Scanner(System.in);
		System.out.println("Upto with iteration do you want to find the fibonacci series of?");
		int n = input.nextInt();
		
		Assignment30 ob = new Assignment30();
		ob.fibonacci(n);
	}

}
