package a1;

public class Item {

	public String nameOfItem;
	public double priceOfItem;
	


public void setItemName(String newItemName) {
	nameOfItem = newItemName;
}

public void setItemPrice(double newPriceOfItem) {
	priceOfItem = newPriceOfItem;
}

public String getItemName() {
	return nameOfItem;
}

public String getItemPrice() {
	return priceOfItem;
}
}