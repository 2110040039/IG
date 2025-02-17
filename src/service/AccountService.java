package service;
import model.Account;
import exception.*;
import java.util.ArrayList;
import java.util.List;
public class AccountService {
	

   private List<Account> accountList = new ArrayList<>();

    // CHECK ACCOUNT VALIDITY
    public boolean isValidAccount(int accNumber) throws AccountNotFoundException {
        for (Account account : getAccountList()) {
            if (account.getAccNumber() == accNumber) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account not found.");
    }

    // DEPOSIT
    public void deposit(int accNumber, float amt) throws InvalidAmountException, AccountNotFoundException {
        isValidAccount(accNumber);
        
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }
        
        for (Account account : getAccountList()) {
            if (account.getAccNumber() == accNumber) {
                account.setBalance(account.getBalance() + amt);
                System.out.println("Deposited " + amt + " to account " + accNumber);
                return;
            }
        }
    }
    //WITHDRAW
    public void withdraw(int accNumber, float amt) throws InvalidAmountException, InsufficientFundsException, AccountNotFoundException {
        isValidAccount(accNumber);
        
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdraw amount is 500.");
        }

        for (Account account : getAccountList()) {
            if (account.getAccNumber() == accNumber) {
                if (account.getType() == Account.AccountType.SAVINGS && account.getBalance() - amt < 1000) {
                    throw new InsufficientFundsException("Savings account must maintain a minimum balance of 1000.");
                }
                if (account.getType() == Account.AccountType.CURRENT && account.getBalance() - amt < 5000) {
                    throw new InsufficientFundsException("Current account must maintain a minimum balance of 5000.");
                }
                account.setBalance(account.getBalance() - amt);
                System.out.println("Withdrew " + amt + " from account " + accNumber);
                return;
            }
        }
    }


    // GET BALANCE
    public float getBalance(int accNumber) throws AccountNotFoundException {
        for (Account account : getAccountList()) {
            if (account.getAccNumber() == accNumber) {
                return account.getBalance();
            }
        }
        throw new AccountNotFoundException("Account not found.");
    }

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
}



