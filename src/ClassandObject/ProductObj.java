package ClassandObject;

import java.util.ArrayList;

public class ProductObj {

	public static void main(String[] args) {

		// Create a new product object
		Product product1 = new Product("Sunglasses", 19.99, 5);

		// Call instance methods on the product object
		product1.printProductDetails();
		System.out.println("Is available: " + product1.isAvailable());
		System.out.println("Total price: $" + product1.calculateTotalPrice());
		product1.decreaseQuantity(5);
		System.out.println("Total price after decreasing: $" + product1.calculateTotalPrice());
		System.out.println("Quantity after decrease: " + product1.quantity);

		System.out.println("----------------------------------------");

		// Create a new product object with different values
		Product product2 = new Product("Shirt", 29.99, 5);
		product2.printProductDetails();

		System.out.println("----------------------------------------");

		// Create a new product object with different values
		Product product3 = new Product("Watch", 49.99, 3);
		product3.printProductDetails();

		System.out.println("----------------------------------------");

		Product product4 = new Product();
		product4.name = "Iphone";
		product4.price = 1200.00;
		product4.quantity = 15;

		product4.printProductDetails();
		System.out.println("Total Price: $" + product4.calculateTotalPrice());

		System.out.println("----------------------------------------");

		Product product5 = new Product();
		product5.name = "Ipad";
		product5.price = 850.00;
		product5.quantity = 4;

		product5.printProductDetails();
		System.out.println("Total Price: $" + product5.calculateTotalPrice());

		System.out.println("----------------------------------------");

		Product product6 = new Product("Airpods", 169.99, 0);

		// Call instance methods on the product object
		product6.printProductDetails();
		System.out.println("Is available: " + product6.isAvailable());
		System.out.println("Total price: $" + product6.calculateTotalPrice());
		System.out.println("Quantity: " + product6.quantity);

		System.out.println("----------------------------------------");

		
		// Declare an array named "products" that can hold 6 Product objects
		Product products[] = new Product[6];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		products[4] = product5;
		products[5] = product6;

		
		for (int i = 0; i < products.length; i++) {
			 System.out.println("Product " + (i+1) + ":");
			    products[i].printProductDetails();
			    System.out.println();
		}
		
	
		System.out.println("WITH ARRAYLIST");
		
		// Create a new ArrayList that can hold Product objects
		ArrayList<Product> productsArray = new ArrayList<Product>();

		// Add each product to the ArrayList
		productsArray.add(product1);
		productsArray.add(product2);
		productsArray.add(product3);
		productsArray.add(product4);
		productsArray.add(product5);
		productsArray.add(product6);

		
		// Iterate through the ArrayList and print the details of each product
		for (int i = 0; i < productsArray.size(); i++) {
		    
			System.out.println("ARRAY Product:" + (i+1));
		    productsArray.get(i).printProductDetails();
		    System.out.println();
		}
	}

}
