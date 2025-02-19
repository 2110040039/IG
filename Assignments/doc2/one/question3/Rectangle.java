package doc2.one.question3;

public class Rectangle extends Shape{
	
	    // Additional attribute for height
	    private int height;

	    // Constructor to initialize length and height
	    public Rectangle(int length, int height) {
	        super(length);  // Calling parent class constructor
	        this.height = height;
	    }

	    // Override calculateArea method
	    @Override
	    public double calculateArea() {
	        return length * height;  // Formula for rectangle area
	    }
	}



