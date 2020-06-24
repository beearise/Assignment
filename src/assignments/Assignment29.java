package assignments;

import java.util.Scanner;

public class Assignment29 {
	
	public float mathematical(int n) {
		int i = 1;
		float j = 0;
		float k = 1;
		float l = 0;
		while(i<=n) {
			j = j+i;
			k = k*i;
			i++;
		}
		l = j/k;
		return(l);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Upto which number do you want to find the of n/n!?");
		int n = input.nextInt();
		
		Assignment29 ob = new Assignment29();
		
		float x = ob.mathematical(n);
		System.out.println(x);
		
		input.close();
		
		
	}

}
