package mavenproject.bankapplication.bean;

import java.util.Scanner;
public class SavingAccount implements Account{
	
	private float balance;
	private InterestRate interestRate;
	private Period interestPeriod;
	

	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * @return the interestRate
	 */
	public InterestRate getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the interestPeriod
	 */
	public Period getInterestPeriod() {
		return interestPeriod;
	}

	/**
	 * @param interestPeriod the interestPeriod to set
	 */
	public void setInterestPeriod(Period interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public SavingAccount(float balance, InterestRate interestRate, Period interestPeriod) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
	
	}
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float transaction() {
		float interestRate = (float) 0.07;
		float simpleInterest=balance*interestRate;
		
		
		return balance;
	
	
	}
	

// method to deposit amount
public  void deposit(float depositAmount)
{
	
	
	balance=depositAmount+balance;
	System.out.println("balance"+balance);
	
}



// method to withdraw amount
public void withdraw(float withdrawAmount)
{
	System.out.println("Your current balance is :" + balance);
	
	//float withdrawl=balance;
	if(withdrawAmount>balance)
	{
		System.out.println(("You have insufficient balance"));
	}
	else
	{
		balance=balance-withdrawAmount;
		System.out.println("balance"+balance);
	}
	
	
	
	
}




	
}