package takeoutTest;


public class Method {
	
	public static void displayMainMenu() {
		System.out.println("Italian?");
		System.out.println("Chinese?");
		System.out.println("American?");
	}
	
	public static void displayItalianFoodMenu() {
		System.out.println("Here are the Italan food list (Enter a number 1-3).");
		System.out.println(" ");
		System.out.println("1. Panzenella - Feeds 5 - 19.99");
		System.out.println("2. Bruschetta - Feeds 6 - 22.99");
		System.out.println("3. Pasta - Feeds 8 - 29.99");
	}
	
	public static void displayChineseFoodMenu() {
		System.out.println("Here are the Chinese food list (Enter a number 1-3).");
		System.out.println(" ");
		System.out.println("1. Dog Salad - Feeds 4 - 19.99");
		System.out.println("2. Cockroach Shake - Feeds 7 - 29.99");
		System.out.println("3. Bat Soup - Feeds 10 - 39.99");

	}
	
	public static void displayAmericanFoodMenu() {
		System.out.println("Here are the American food list (Enter a number 1-3).");
		System.out.println(" ");
		System.out.println("1. Fatty Burger - Feeds 2 - 9.99");
		System.out.println("2. Fatty Pizza - Feeds 4 - 19.99");
		System.out.println("3. Fat Fries - Feeds 6 - 29.99");
		
	}
	
	public static int determineTrays(int people, int feeds) {
		
		
		int a = people/feeds;
		if(people%feeds != 0) {
			a++;
		}
		return a;
		
		
		
	}
	
	public static double getSubtotal(double price, int trays) {
		
		double priceBeforeTax = price*trays;		
		return priceBeforeTax;
		
	}
	
	public static double getTax(double subtotal, double taxrate) {
		double tax = (subtotal*taxrate)/100;
		return tax;
	}
	
	public static double getTip(double subtotal, double tipRate) {
		double tip = (subtotal*tipRate)/100;
		return tip;
	}
	
	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double netTotal = subtotal + tax + tip;
		return netTotal;
	}
	
	
	public static double pricePerPerson(double grandTotal, int people) {
		double price = grandTotal/people;
		return price;
	}
	
	public static int determineLeftOvers(int feeds, int trays, int people) {
		int leftOvers = feeds*trays-people;
		return leftOvers;
		
	}
	
	

}
