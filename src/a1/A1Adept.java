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
		double[] totalCost = new double[totalCustomers]; 
		
		for(int ii = 0; ii < totalCustomers; ii++) { 
			firstName[ii] = scan.next(); 
			lastName[ii] = scan.next(); 
			
			int numberOfItems = scan.nextInt(); 
			
			int tempQuantity = scan.nextInt(); 
			String tempName = scan.next(); 
			double tempCost = 0.0; 
			double costForCustomer = 0.0;
				for(int iii = 0; iii < totalItems; iii++) {
					if(tempName.equals(itemName[iii])) {
						costForCustomer = costForCustomer + (tempQuantity * tempCost); 
					}
					totalCost[ii] = costForCustomer;
				}
			
			
			
		}
	
		// CALCULATE AVERAGE COST PER CUSTOMER
		double averageCost = 0.0; 
		
		for(int x = 0; x < totalCustomers; x++) {
			double sumOfCosts = 0.0;
			
			sumOfCosts = sumOfCosts + totalCost[x]; 
		}
		
		averageCost = averageCost / totalCustomers; 
		
		// CALCULATE MAX COST 
		
		int maxCostIndex = -1;
		double maxCost = 0.0;
		
		for (int z = 0; z < totalCustomers; z++) {
			if (totalCost[z] > maxCost)
				maxCost = totalCost[z];
				maxCostIndex = z; 
		}
		
		// CALCULATE SMALLEST COST
		
		int smallestCostIndex = -1;
		double smallestCost = 1000000;
		
		for (int w= 0; w < totalCustomers; w++) {
			if (totalCost[w] < smallestCost)
				smallestCost = totalCost[w];
				smallestCostIndex = w; 
		}
		
		
		// Print the proper output 
		
		System.out.println("Biggest: " + firstName[maxCostIndex] + " " + lastName[maxCostIndex] + 
						"(" + maxCost + ")"); 
		
		System.out.println("Smallest: " + firstName[smallestCostIndex] + " " + lastName[smallestCostIndex] + 
				"(" + smallestCost + ")"); 
		
		System.out.println("Average: " + averageCost ); 


		
		
		
		}
	}

