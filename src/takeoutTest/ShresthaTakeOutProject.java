package takeoutTest;

import java.util.Scanner;

public class ShresthaTakeOutProject {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		boolean check = true;
		System.out.println("How many people will be Ordering?");
		int n = input.nextInt();
		
		int feeds = 0;
		double grossPrice = 0;
		double taxRate = 7;
		double tipRate = 15;
		
		
		//if people are less than 10, it discontinues.
		if(n>=10) {
			
			//to have the user select the right menu.
			do {
				System.out.println("What type of food would you like to order?");
				
				//calls method to display menu.
				Method.displayMainMenu();
				String menuChoice = input.next();
				
				
				switch (menuChoice) {
				case "Italian": {
					
					//calls method to display Italian menu.
					Method.displayItalianFoodMenu();
					int feedAmount = input.nextInt();
					
					//this keeps track of the feedAmount to figure out trays.
					if(feedAmount == 1) {
						feeds = feeds+5;
						grossPrice = grossPrice+19.99;
					}else if(feedAmount == 2) {
						feeds = feeds+6;
						grossPrice = grossPrice+22.99;
					}
					else if(feedAmount == 3) {
						feeds = feeds+8;
						grossPrice = grossPrice+29.99;
					}else {
						System.out.println("Wrong choice!");
						grossPrice = 0;
					}

					check = false;
					break;
				}
				case "Chinese": {
					
					//calls method to display Chinese menu.
					Method.displayChineseFoodMenu();
					int feedAmount = input.nextInt();
					
					//this keeps track of the feedAmount to figure out trays.
					if(feedAmount == 1) {
						feeds = feeds+4;
						grossPrice = grossPrice+19.99;
					}else if(feedAmount == 2) {
						feeds = feeds+7;
						grossPrice = grossPrice+29.99;
					}
					else if(feedAmount == 3) {
						feeds = feeds+10;
						grossPrice = grossPrice+39.99;
					}else {
						System.out.println("Wrong choice!");
					}
					check = false;
					break;
						}
				case "American": {
					
					//calls method to display American menu.
					Method.displayAmericanFoodMenu();
					int feedAmount = input.nextInt();
					
					//this keeps track of the feedAmount to figure out trays.
					if(feedAmount == 1) {
						feeds = feeds+2;
						grossPrice = grossPrice+9.99;
					}else if(feedAmount == 2) {
						feeds = feeds+4;
						grossPrice = grossPrice+19.99;
					}
					else if(feedAmount == 3) {
						feeds = feeds+6;
						grossPrice = grossPrice+29.99;
					}else {
						System.out.println("Wrong choice!");			
					}
					check = false;
					break;
				}
				default:
					System.out.println("Please enter the correct option!");
					check = true;
				}
				
			}while(check == true);
			
			if(grossPrice > 0) {	
				//calls method to determine trays.
				int trays = Method.determineTrays(n,feeds);
				System.out.println("You need "+trays+" trays.");
				System.out.println("Feeds "+feeds+".");
				
				//calls method to get price before tax.
				double subTotal = Method.getSubtotal(grossPrice, trays);
				System.out.println("Price for "+n+" people ("+trays+" trays): "+subTotal+".");
				
				//calls method to get total tax.
				double totalTax = Method.getTax(subTotal, taxRate);
				
				String tTax = String.format("%.02f", totalTax);
				System.out.println("Tax: "+tTax+".");
				
				//calls method to get total tip.
				double totalTip = Method.getTip(subTotal, tipRate);
				
				String tt = String.format("%.02f", totalTip);				
				System.out.println("Tip: "+tt+".");
					
				//calls method to get grand total.
				double gTotal = Method.getGrandTotal(subTotal, totalTax, totalTip);
				
				String gt = String.format("%.02f", gTotal);				
				System.out.println("Total(food, tax, tip): "+ gt+".");
				
				//calls method to get price per person.
				double pPrice = Method.pricePerPerson(gTotal, n);
				
				String pp = String.format("%.02f", pPrice);				
				System.out.println("Price per person: "+pp+".");
				
				
				//calls method to get leftovers for delivery person.
				int leftOverServing = Method.determineLeftOvers(feeds, trays, n);
				System.out.println("Leftover servings for the delivery person: "+leftOverServing+".");
			}
			
			
		}else {
			System.out.println("You need at least 10 people to order TakeOut!");
		}
		
	
		input.close();

	}

}
