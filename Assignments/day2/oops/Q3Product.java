package day2.oops;

public class Q3Product {
	    // Attributes of the Product class
	    private int productno;
	    private String productname;
	    private float price;
	    private int quantity;

	    // Method to initialize the variables
	    public void initializeProduct(int productno, String productname, float price, int quantity) {
	        this.productno = productno;
	        this.productname = productname;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Method to display the product details
	    public void displayProductDetails() {
	        float totalAmount = price * quantity;
	        System.out.println("Product No   Product Name   Quantity   Price   Total Amount");
	        System.out.println("---------------------------------------------------------");
	        System.out.println(productno + "          " + productname + "        " + quantity + "       " + price + "     " + totalAmount);
	    }

	    public static void main(String[] args) {
	        // Creating a Product object
	        Q3Product product = new Q3Product();

	        // Initializing product details
	        product.initializeProduct(101, "Laptop", 50000.0f, 3);

	        // Displaying product details
	        product.displayProductDetails();
	    }
	}


//Product No   Product Name   Quantity   Price   Total Amount
//---------------------------------------------------------
//101          Laptop         3          50000.0     150000.0




