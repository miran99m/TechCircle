package ClassandObject;

public class Product {
	public String name; // Instance variable for the name of the product
	public double price; // Instance variable for the price of the product
	public int quantity; // Instance variable for the quantity of the product

	
	public Product() {
		// DEFAULT CONSTRUCTOR TO SET THE VALUES TO THE INSTANCE VARIABLES
	}
	
	
	public Product(String name, double price, int quantity) { // Constructor method to initialize the instance variables
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public double calculateTotalPrice() { // Instance method to calculate the total price of the product
		double totalPrice = this.price * quantity;
	    return Double.parseDouble(String.format("%.2f", totalPrice));	
	}

	public void printProductDetails() { // Instance method to print the details of the product
		System.out.println("Product: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity);
	}

	public boolean isAvailable() { // Instance method to check if the product is available
		return quantity > 0;
	}

	public void decreaseQuantity(int amount) { // Instance method to decrease the quantity of the product by a certain
												// amount
		if (amount > quantity) { // Check if there is enough quantity available
			System.out.println("Not enough quantity available.");
		} else {
			quantity -= amount; //

		}
	}
}
