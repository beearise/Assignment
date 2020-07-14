package lab1;

import java.util.Scanner;

public class BankAccount {
	
	private String name;
	private double balance;
	private static int accountNumber = 1000;
	
	public BankAccount(String name) {
		this.name = name;
		this.balance=0;
		accountNumber++;
	}
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance=balance;
		accountNumber++;
	}
	
	public void withdrawFunds (double amount) {
		balance = balance - amount;
	}
	
	public void withdrawFunds (double amount, double fees) {
		fees = (fees*balance)/100;
		balance = balance-amount-fees;

	}
	public void depositFunds(double amount) {
		
		balance = balance+amount;
		
	}
	
	public void depositFunds(double amount, double interest) {
		interest = (interest*balance)/100;
		balance = balance+amount+interest;
	}
	
	public void displayAccountInfo() {
		System.out.println("----------------------------");
		System.out.println("User : " +name);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Current Balance : "+balance);
		System.out.println("----------------------------");
	}
	
	
	public static void main(String[] args) {
		
		int interest = 5;
		int fee = 10;
		String confirmation = "Yes";
		BankAccount a1 = new BankAccount("Biraj");
		BankAccount a2 = new BankAccount("Suraj",1000);
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter 1 to deposit and 2 to withdraw money.");
			int condition= input.nextInt();
			
			switch (condition) {
			case 1: {
				System.out.println("Enter amount.");
				int amount = input.nextInt();
				
				a1.depositFunds(amount,  interest);
				a1.displayAccountInfo();
				confirmation = "No";
				break;
			}
			case 2: {
				
				System.out.println("Enter amount: ");
				int amount = input.nextInt();
				
				a1.withdrawFunds(amount, fee);
				a1.displayAccountInfo();
				confirmation = "No";
				break;
			}
			default:
				System.out.println("Type 1 to Deposit or 2 to Withdraw.");
				
			}
		}while(confirmation!= "No");
	input.close();
	}	
	
}
