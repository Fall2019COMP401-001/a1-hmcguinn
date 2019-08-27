package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double costOfItems = 0.0;


		int totalCustomers = scan.nextInt(); 

		for (int i = 0; i <= totalCustomers; i++)	 {	

			/* 
			 * firstName: First name of customer
			 * lastName: Last name of customer
			 * itemsBought: Number of items bought by customer
			 */
			
				String firstName = scan.next(); 
				String lastName  = scan.next();
				int itemsBought = scan.nextInt(); 
				
				// For loop calculates cost of Items for a single customer
					for (int ii = 0; ii < itemsBought; ii++) {
					
							int quantity = scan.nextInt(); 
							String trash = scan.next(); 
							double priceOfItem = scan.nextDouble(); 
					
							costOfItems = costOfItems + (quantity * priceOfItem); 
						}
					
				String customerTemp = (firstName.charAt(0) + ". " + lastName + 
									 ": " + costOfItems );
				
				
				System.out.println(customerTemp);
		}
				
		

	}
}
