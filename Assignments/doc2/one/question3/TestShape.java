package doc2.one.question3;

public class TestShape {
	    public static void main(String[] args) {
	        // Declare an array of Shape references with size 3
	        Shape[] shapes = new Shape[3];

	        // Populate the array with objects of Rectangle, Square, and Triangle
	        shapes[0] = new Rectangle(5, 10);  // Rectangle with length 5 and height 10
	        shapes[1] = new Square(4);         // Square with side length 4
	        shapes[2] = new Triangle(6, 8);    // Triangle with base 6 and height 8

	        // Loop through the array and invoke the calculateArea method polymorphically
	        for (Shape shape : shapes) {
	            System.out.println("Area: " + shape.calculateArea());
	        }
	    }
	}


//Area: 50.0
//Area: 16.0
//Area: 24.0

