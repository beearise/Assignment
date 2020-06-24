package assignments;

import java.util.Scanner;

public class Assignment31 {
	
	public void pattern(int a) {
		int i = 1;
		int j = 0;
		while(i<=a) {
			j = j*10+i;
			System.out.println(j);
			i++;
		}
	}

	public static void main(String[] args) {
		// Patterns
		
		Scanner input = new Scanner(System.in);
		System.out.println("Up to which iteration of pattern do you want?");
		int n = input.nextInt();
		
		Assignment31 ob = new Assignment31();
		ob.pattern(n);

	}

}
