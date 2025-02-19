package day2.oops.question7;

public class Rectangle {
	    private double length;
	    private double breadth;

	    // Constructor with one parameter (initializes length and breadth with the same value)
	    public Rectangle(double side) {
	        this.length = side;
	        this.breadth = side;
	    }

	    // Constructor with two parameters (initializes length and breadth with different values)
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    // Method to display the dimensions of the rectangle
	    public void displayDimensions() {
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	    }
	}

	


