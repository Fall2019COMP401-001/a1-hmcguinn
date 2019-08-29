package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//CLASS FOR EACH CUSTOMER
		
		int totalItems = scan.nextInt(); 

		
		// FOR loop that initalizes an object for each item 
		
		double[] itemCost = new double[totalItems];
		String[] itemName = new String[totalItems];
		
		for(int i = 0; i < totalItems; i++) {
			itemName[i] = scan.next();
			itemCost[i] = scan.nextDouble(); 
		}
		
		int totalCustomers = scan.nextInt(); 
		
		String[] firstName = new String[totalCustomers];
		String[] lastName = new String[totalCustomers];
		String[] itemsBought = new String[totalCustomers];

		
		
		
		
		}
	}

