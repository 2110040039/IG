package day2.oops.question4;

public class Main {
	    public static void main(String[] args) {
	        // Creating an Account object
	        Account account = new Account();

	        // Setting account details
	        account.setAccountDetails(123456, "Savings", 5000);

	        // Displaying account details before transactions
	        System.out.println("Account Details Before Transactions:");
	        account.dispAccountDetails();

	        // Performing a withdrawal of 1000
	        account.withdraw();

	        // Performing a deposit of 1000
	        account.deposit();

	        // Displaying account details after transactions
	        System.out.println("\nAccount Details After Transactions:");
	        account.dispAccountDetails();
	    }
	}

//Account Details Before Transactions:
//Account No: 123456
//Account Type: Savings
//Account Balance: 5000
//Withdrawal of 1000 successful. New balance: 4000
//Deposit of 1000 successful. New balance: 5000
//
//Account Details After Transactions:
//Account No: 123456
//Account Type: Savings
//Account Balance: 5000

