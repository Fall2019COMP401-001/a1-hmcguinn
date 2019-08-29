package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int totalCustomers = scan.nextInt(); 

		// FOR loop that iterates once for each customer in input-set
		
		for (int i = 0; i <= totalCustomers; i++)	 {	

				/* 
				 * firstName: First name of customer
				 * lastName: Last name of customer
				 * itemsBought: Number of items bought by customer
				 * costOfItems: Variable used to print total cost for one customer
				 */
				double costOfItems = 0.0;

				String firstName = scan.next(); 
				String lastName  = scan.next();
				int itemsBought = scan.nextInt(); 
				
					// For loop calculates cost of items for a single customer
				
					for (int ii = 0; ii < itemsBought; ii++) {
					
								int quantity = scan.nextInt(); 
								String trash = scan.next(); 
								double priceOfItem = scan.nextDouble(); 

								costOfItems = costOfItems + (quantity * priceOfItem); 
							}
					
				// Prints out total cost per customer in correct format 
					
					String printCost = String.format("%.2f", costOfItems);
					System.out.println(firstName.charAt(0) + ". " + lastName + 
							": " + printCost );
	


	}
}
}
