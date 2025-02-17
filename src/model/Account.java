package model;
import exception.*;
public class Account {
	public enum AccountType {
        SAVINGS, CURRENT
    }

    Integer accNumber;
    String custName;
    AccountType type;
    Float balance;

    // CONTRUCTOR
    public Account(Integer accNumber, String custName, AccountType type, Float balance) throws LowBalanceException, InvalidAmountException {
        this.accNumber = accNumber;
        this.custName = custName;
        this.type = type;
        this.balance = balance;
        if (balance < 0) {
            throw new InvalidAmountException("Balance cannot be negative.");
        }
        
        if (type == AccountType.SAVINGS && balance < 1000) {
            throw new LowBalanceException("Savings account must have a minimum balance of 1000.");
        }
        
        if (type == AccountType.CURRENT && balance < 5000) {
            throw new LowBalanceException("Current account must have a minimum balance of 5000.");
        }
        
        
    }
    //GETTERS SETTERS
	public Integer getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Integer accNumber) {
		this.accNumber = accNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}
    

}
