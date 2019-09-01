package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//CLASS FOR EACH CUSTOMER
		
		int totalItems = scan.nextInt(); 

		Item[] itemArray = new Item[totalItems]; 
		
		for(int i=0; i< totalItems; i++) {
			itemArray[i] = new Item();
			}
		
	for(int i=0; i < totalItems; i++) {
			String newItemName = scan.next(); 
		  	itemArray[i].setItemName(newItemName);
		  	double newPriceOfItem = scan.nextDouble(); 
		  	itemArray[i].setItemPrice(newPriceOfItem);
		 }
	
	int totalCustomers = scan.nextInt(); 
	// DO THE SAME BUT FOR THE CUSTOMER OBJECT
	Customer[] customerArray = new Customer[totalCustomers];
	
	for(int i=0; i< totalCustomers; i++) {
		customerArray[i] = new Customer();
		}
	
	for(int i=0; i < totalCustomers; i++) {
		String tempString = scan.next();
		customerArray[i].setFirstName(tempString);
		tempString= scan.next(); 
		customerArray[i].setLastName(tempString);
		
		int tempTotalItems= scan.nextInt(); 
		customerArray[i].setItemsBought(tempTotalItems);
		
		for (int ii = 0; ii< tempTotalItems; i++) {
			
		String tempName = scan.next();
		customerArray[i].setItemName(tempName);
		int tempQuantity = scan.nextInt();
		customerArray[i].setItemsBought(tempQuantity);
		}	
	} 
		
	for(int z =0; z<totalCustomers; z++) {
		for(int i=0; i< totalItems; i++) {
			String tempItemName = itemArray[i].getItemName();
			if(tempItemName.equals(customerArray[z].getItemName[i])) {
				double totalSpentTemp = (itemArray[i].getItemPrice() * customerArray[z].getItemsBought[i]());
				customerArray[z].setTotalSpent(totalSpentTempt);
			}
		}
	}
	
		}
	}

