package day2.oops.question6;

public class Main {
	    public static void main(String[] args) {
	        Bank bank = new Bank();  // Creating an instance of the Bank class
	        
	        double balance = 5000.0; // Initial balance
	        double depositAmount = 2000.0; // Amount to deposit
	        double withdrawAmount = 3000.0; // Amount to withdraw

	        // Displaying initial balance
	        System.out.println("Initial Balance: " + balance);

	        // Testing deposit
	        balance = bank.deposit(depositAmount, balance);
	        System.out.println("Balance after deposit of " + depositAmount + ": " + balance);

	        // Testing withdrawal
	        balance = bank.withdraw(withdrawAmount, balance);
	        System.out.println("Balance after withdrawal of " + withdrawAmount + ": " + balance);

	        // Testing withdrawal with insufficient funds
	        balance = bank.withdraw(10000.0, balance); // Trying to withdraw more than available
	        System.out.println("Balance after withdrawal attempt: " + balance);
	    }
	}


//	Initial Balance: 5000.0
//	Balance after deposit of 2000.0: 7000.0
//	Balance after withdrawal of 3000.0: 4000.0
//	Insufficient funds for withdrawal.
//	Balance after withdrawal attempt: 0.0




