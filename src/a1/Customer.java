package a1;

public class Customer {
		
		public String firstName;
		public String lastName; 
		public int[] itemsBought; 
		public String[] itemName;	
		public double totalSpent; 
		
		public Item[][] arrayOfItemsBought;
		}


public void setItemsBought(int newItemsBought) {
	itemsBought = newItemsBought;
	
}

public int getItemsBought() {
	return itemsBought;
}

public void setFirstName(String newFirstName) {
		firstName = newFirstName;
}

public String getFirstName() {
	return firstName;
}

public void setLastName(String newLastName) {
	lastName = newLastName; 
}

public String getLastName() {
	return lastName;
}

public void setItemName(String newItemName) {
	itemName = newItemName;
}

public String getItemName() {
	return itemName[];
}

public void setTotalSpent(double newTotalSpent) {
	totalSpent = newTotalSpent;
}

public double getTotalSpent() {
	return totalSpent;
}

public void setItemsBought(Item newItem) {
	arrayOfItemsBought[][] = newItem;
}

public Item getTotalSpent() {
	return arrayOfItemsBought[][];
}


}
