package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int totalItems = scan.nextInt(); 
		
		String[] itemNames = new String[totalItems]; 
		int[][] itemsBought = new int[2][totalItems]; 
		
		
		
		for(int i = 0; i< totalItems; i++) {
			itemNames[i] = scan.next(); 
			double trash = scan.nextDouble(); 
		}
		
		 int  totalCustomers = scan.nextInt();

		

			for(int i = 0; i< totalCustomers; i++) {
				String trashName = scan.next();
				trashName = scan.next(); 
				
				int numberOfItemsBought = scan.nextInt(); 
				
				for(int ii = 0; ii <numberOfItemsBought; ii++) {
					int temp = scan.nextInt(); 
					String tempName = scan.next(); 
					int index = 0;
					
					boolean[] hasBought = new boolean[numberOfItemsBought];
					String[] listOfItemNames = new String[numberOfItemsBought];
					listOfItemNames[ii] = tempName; 
					
						for(int iii = 0; iii < totalItems; iii++) {
							if(tempName == itemNames[iii]) {
								itemsBought[0][iii]++; 
								if(hasBought[ii] = false) {
									hasBought[ii] = true;
									itemsBought[1][iii]++; 
							}
						}
						
				}
			

			}
			}
				
			for(int i = 0; i< totalItems; i++) {
			/*
			for(int i = 0; i< totalItems; i++) {

				if(itemsBought[i].equals(0)) {
					System.out.println("No customers bought " + itemNames[i]);
				}
				
				System.out.println(itemsBought[1][i] + "customers bought " + itemsBought[0][i] + " " + itemNames[i] + "\n");
				
				
				}
		
		*/
		
		
		
		
	}
}
