package day2.oops.question4;

public class Account {
	    // Attributes of the Account class
	    private int accountNo;
	    private String accountType;
	    private int accountBalance;

	    // Method to set the account details
	    public void setAccountDetails(int accountNo, String accountType, int accountBalance) {
	        this.accountNo = accountNo;
	        this.accountType = accountType;
	        this.accountBalance = accountBalance;
	    }

	    // Method to withdraw 1000 from the account balance
	    public void withdraw() {
	        if (accountBalance >= 1000) {
	            accountBalance -= 1000;
	            System.out.println("Withdrawal of 1000 successful. New balance: " + accountBalance);
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }
	    }

	    // Method to deposit 1000 into the account balance
	    public void deposit() {
	        accountBalance += 1000;
	        System.out.println("Deposit of 1000 successful. New balance: " + accountBalance);
	    }

	    // Method to display account details
	    public void dispAccountDetails() {
	        System.out.println("Account No: " + accountNo);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Account Balance: " + accountBalance);
	    }
	}

	



