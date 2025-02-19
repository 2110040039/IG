package day2.oops.question6;

public class Bank {
	    // Method to deposit money
	    public double deposit(double amount, double balance) {
	        balance += amount; // Add the deposit amount to the balance
	        return balance;    // Return the new balance
	    }

	    // Method to withdraw money
	    public double withdraw(double amount, double balance) {
	        if (balance >= amount) {
	            balance -= amount; // Subtract the withdrawal amount from the balance
	            return balance;    // Return the new balance after withdrawal
	        } else {
	            System.out.println("Insufficient funds for withdrawal.");
	            return 0;          // Return 0 if balance is less than the withdrawal amount
	        }
	    }
	}

	
	