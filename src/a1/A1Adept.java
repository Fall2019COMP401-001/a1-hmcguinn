package a1;

import java.util.HashMap;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//CLASS FOR EACH CUSTOMER
		
		int totalItems = scan.nextInt(); 
		
		// hashmap 
		
	    HashMap<String, Double> hashOfItems = new HashMap<String, Double>();
	    
	    for(int i = 0; i < totalItems; i++) {
	    	hashOfItems.put(scan.next(), scan.nextDouble());
	    }
	    
	    
	  int  totalCustomers = scan.nextInt();
		String[][] customerNames = new String[2][totalCustomers];
				
		int[] numberOfItemsBought = new int[totalCustomers]; 
		double[] totalCostPerCustomer = new double[totalCustomers]; 

		for(int i = 0; i< totalCustomers; i++) {
			customerNames[0][i] = scan.next();
			customerNames[1][i] = scan.next(); 
			
			numberOfItemsBought[i] = scan.nextInt(); 
			
			for(int ii = 0; ii<numberOfItemsBought[i]; ii++) {
				int tempInt = scan.nextInt(); 
				totalCostPerCustomer[i] = totalCostPerCustomer[i] +(tempInt * hashOfItems.get(scan.next()));
			}

		}
	    
	   // Calculate biggest value
		double biggest = 0;
		int biggestIndex =0; 
		for(int i = 0; i<totalCustomers; i++) {
			if(biggest < totalCostPerCustomer[i]) {
				biggest = totalCostPerCustomer[i];
				biggestIndex = i; 
			}	
		}
		
		// Calculate smallest value 
		double smallest = 10000000; 
		int smallestIndex = 0; 
		
		for(int i = 0; i < totalCustomers; i++) {
			if(smallest > totalCostPerCustomer[i]) {
				smallest = totalCostPerCustomer[i];
				smallestIndex = i; 
			}
		}
		
		
		
	   // Calculate average value
		double average = 0;
		for(int i = 0; i<totalCustomers; i++) {
			average = average + totalCostPerCustomer[i];
		}
		average = average / totalCustomers; 
		
	   // Return proper values
		
		System.out.println("Biggest: " + customerNames[0][biggestIndex] + " " + customerNames[1][biggestIndex] +
				" (" + String.format("%.2f", biggest) + ")");
		System.out.println("Smallest: " + customerNames[0][smallestIndex] + " " + customerNames[1][smallestIndex] +
				" (" + String.format("%.2f", smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	    
	}
}