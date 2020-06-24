package assignments;

import java.util.Scanner;

public class Assignment28 {
	
	
	//checks if a number is prime
	public String isPrimeNumber(int a) {
		
		String isPrime = "";
		
		if(a%2==1) {
			if(a/a == 1) {
				isPrime = "It is Prime.";
			}else {
				isPrime = "It is not Prime";
			}
			
			
		}else {
			isPrime = "It is not Prime";
		}
		return isPrime;
	}
	
	//prints out first Nth Prime number
	
	public void firstNthPrime(int b) {
		
		for(int i = 1; i<=b; i++){
			if(i%2==1) {
				if(i/i==1) {
					System.out.println(i);
				}
			}
		}
	}
	
	public void allPrimeBetween(int start,int end) {
		while(start<=end) {
			if(start%2 == 1) {
				if(start/start == 1) {
					System.out.println(start);
				}
			}
			start++;
		}
	}
		

	public static void main(String[] args) {
		// prime, first prime, all prime
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Prime.");
		int p = input.nextInt();
		
		
		//calls method to check if it is prime
		Assignment28 ob = new Assignment28();
		String isPrime = ob.isPrimeNumber(p);
		System.out.println(isPrime);
		
		//calls method to print Nth prime numbers.
		System.out.println("Upto which numbers do you want the prime numbers of?");
		int c = input.nextInt();
		
		ob.firstNthPrime(c);
		
		//
		System.out.println("Now to find prime numbers between frist and second numbers.");
		System.out.println("Enter first number!");
		int f = input.nextInt();
		System.out.println("Enter second number!");
		int s = input.nextInt();
		ob.allPrimeBetween(f, s);
		
		input.close();
		}



}
