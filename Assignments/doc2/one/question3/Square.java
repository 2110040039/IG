package doc2.one.question3;

public class Square extends Shape{

	    public Square(int length) {
	        super(length);  // A square only requires the side length
	    }

	    @Override
	    public double calculateArea() {
	        return length * length;  // Formula for square area
	    }
	}



