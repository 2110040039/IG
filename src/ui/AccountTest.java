package ui;
import model.Account;
import model.Account.AccountType;
import service.AccountService;
import exception.*;

public class AccountTest {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        // TEST ACCOUNTS
        try {
            Account account1 = new Account(211, "Roopa", AccountType.SAVINGS, 10000.0f);  
            Account account2 = new Account(311, "Lakshmi", AccountType.CURRENT, 8000.0f); 
            accountService.getAccountList().add(account1);
            accountService.getAccountList().add(account2);
            
        } catch (LowBalanceException | InvalidAmountException e) {
            System.out.println("Error in account creation: " + e.getMessage());
        }


        // 1. VALID DEPOSIT
        try {
            accountService.deposit(211, 500.0f);  
            System.out.println("Balance after deposit: " + accountService.getBalance(211));
        } catch (InvalidAmountException | AccountNotFoundException e) {
            System.out.println("Error in deposit: " + e.getMessage());
        }

        // 2. VALID WITHDRAW
        try {
            accountService.withdraw(211, 1500.0f); // Valid withdrawal
            System.out.println("Balance after withdrawal: " + accountService.getBalance(211));
        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Error in withdrawal: " + e.getMessage());
        }

        // 3. WITHDRAW WITH INSUFFICIENT FUNDS (for Savings)
        try {
            accountService.withdraw(211, 9000.0f);  // Insufficient funds (Savings account must have 1000 minimum balance)
        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Error in withdrawal: " + e.getMessage());
        }

        // 4. DEPOSIT WITH INVALID AMOUNT
        try {
            accountService.deposit(211, -500.0f);  // Invalid amount
        } catch (InvalidAmountException | AccountNotFoundException e) {
            System.out.println("Error in deposit: " + e.getMessage());
        }

        // 5. WITHDRAW WITH INSUFFICIENT BALANCE (for Current account)
        try {
            accountService.withdraw(311, 5000.0f);  
        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Error in withdrawal: " + e.getMessage());
        }

        // 6. WITHDRAWAL WITH NON EXISTING ACCOUNT
        try {
            accountService.withdraw(999, 500.0f);  // Account not found
        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Error in withdrawal: " + e.getMessage());
        }

        // 7. DEPOSIT WITH NON EXISTING ACCOUNT
        try {
            accountService.deposit(999, 500.0f);  // Account not found
        } catch (InvalidAmountException | AccountNotFoundException e) {
            System.out.println("Error in deposit: " + e.getMessage());
        }

        // 8. DEPOSIT FOR NEGATVE BALANCE DURING ACCOUNT CREATION
        try {
            Account invalidAccount = new Account(411, "Invalid", AccountType.SAVINGS, -500.0f);  // Invalid balance
        } catch (LowBalanceException | InvalidAmountException e) {
            System.out.println("Error in account creation: " + e.getMessage());
        }
        //9. GET BALANCE FOR VALID ACCOUNT
        try {
            float balance = accountService.getBalance(211); // Test getBalance function for account 211
            System.out.println("Balance for account 211: " + balance);
        } catch (AccountNotFoundException e) {
            System.out.println("Error in getBalance: " + e.getMessage());
        }

        // 10. GET BALANCE FOR NON EXIXSTING ACCOUNT
        try {
            float balance = accountService.getBalance(999); 
            System.out.println("Balance for account 999: " + balance);
        } catch (AccountNotFoundException e) {
            System.out.println("Error in getBalance: " + e.getMessage()); 
        }
    }
    }

