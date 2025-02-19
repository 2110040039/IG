package doc2.one.question3;

public class Shape {
	    // Parent class has an attribute length
	    protected int length;

	    // Constructor to initialize length
	    public Shape(int length) {
	        this.length = length;
	    }

	    // Generic method to be overridden by subclasses
	    public double calculateArea() {
	        // Default implementation, can be overridden by subclasses
	        System.out.println("Calculating area for generic shape.");
	        return 0;
	    }
	}



