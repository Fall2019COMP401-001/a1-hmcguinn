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
					
						for(int iii = 0; iii < totalItems; iii++) {
							if(tempName == itemNames[iii]) {
								itemsBought[0][iii]++; 
							}
						}
						
				}
			

			}
		
		
		
		
		
		
		
		
		
	}
}
