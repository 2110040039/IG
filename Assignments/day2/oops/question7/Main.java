package day2.oops.question7;

public class Main {
		    public static void main(String[] args) {
		        // Creating Rectangle object using the first constructor (same length and breadth)
		        Rectangle square = new Rectangle(5.0);
		        System.out.println("Dimensions of the square (same length and breadth):");
		        square.displayDimensions();

		        // Creating Rectangle object using the second constructor (different length and breadth)
		        Rectangle rectangle = new Rectangle(6.0, 3.0);
		        System.out.println("\nDimensions of the rectangle (different length and breadth):");
		        rectangle.displayDimensions();
		    }
		}

//Dimensions of the square (same length and breadth):
//Length: 5.0
//Breadth: 5.0
//
//Dimensions of the rectangle (different length and breadth):
//Length: 6.0
//Breadth: 3.0

