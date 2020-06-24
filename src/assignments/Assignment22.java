package assignments;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		// Table of given number
		
		Scanner input = new Scanner(System.in);
		System.out.println("What number table do you want?");
		int n = input.nextInt();
		int j = n;
		
		for(int i=1;i<=10;i++) {
			j = n*i;
			System.out.println(n +" X "+i+" = " +j);
			
		}
		
		
		
		input.close();
	}

}
