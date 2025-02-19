package day5.ExceptionHandling;

public class AverageCalculator {
	    // Method to calculate the average of the first n natural numbers
	    public double calAverage(int n) {
	        // Check if n is a natural number
	        if (n <= 0) {
	            throw new IllegalArgumentException("Input must be a natural number greater than 0");
	        }

	        // Calculate the sum of first n natural numbers using the formula n * (n + 1) / 2
	        double sum = (n * (n + 1)) / 2.0;

	        // Return the average
	        return sum / n;
	    }

	    public static void main(String[] args) {
	        AverageCalculator calculator = new AverageCalculator();

	        // Example usage
	        try {
	            int n = 5;  // You can change this value to test
	            double average = calculator.calAverage(n);
	            System.out.println("The average of the first " + n + " natural numbers is: " + average);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

//Output:
//For a valid input, for example n = 5, the output will be:
//The average of the first 5 natural numbers is: 3.0
//
//For an invalid input, for example n = 0 or n = -3, the output will be:
//Error: Input must be a natural number greater than 0
