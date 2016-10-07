package account;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		
		super();
	}
	
	public Account(int id, double initialBalance){
		super();
		this.id = id;
		this.balance = initialBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		
		return (annualInterestRate/12);
	}
	
	public double withdraw(double moneyOut) throws InsufficientFundsException {
		
		if (moneyOut <= balance){
			balance -= moneyOut;
		return balance;
	}
		
		else {
			double notEnough = moneyOut - balance;
			throw new InsufficientFundsException(notEnough);
		}
	}
	
	public double deposit(double moneyIn){
		balance += moneyIn;
		return balance;
			
	}


	
	

}



