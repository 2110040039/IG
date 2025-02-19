package day2.oops.question10;

public class Main {
	public static void main(String[] args) {
        // Create an instance of CalculatorImpl (which implements Calculator)
        Calculator calculator = new Calc();

        // Perform addition and subtraction using the Calculator services
        int a = 10, b = 5;

        int sum = calculator.addition(a, b);
        int difference = calculator.subtraction(a, b);

        // Output the results
        System.out.println("Addition of " + a + " and " + b + " is: " + sum);
        System.out.println("Subtraction of " + a + " and " + b + " is: " + difference);
    }
}
//Addition of 10 and 5 is: 15
//Subtraction of 10 and 5 is: 5

