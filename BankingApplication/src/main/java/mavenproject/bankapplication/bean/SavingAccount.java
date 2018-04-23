package mavenproject.bankapplication.bean;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class SavingAccount implements Account{
	
	private Money balance;
	private InterestRate interestRate;
	private Period interestPeriod;
	

	/**
	 * @return the balance
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Money balance) {
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

	public SavingAccount(Money balance, InterestRate interestRate, Period interestPeriod) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
	
	}
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String transaction() {
		
		return null;
	
	
	}
	

// method to deposit amount
public  void deposit(float depositAmount)
{
	System.out.println("Enter an amount to deposit");
	Scanner scan=new Scanner(System.in);
	depositAmount=scan.nextFloat();
	if(depositAmount<0)
	{
		System.out.println("Incorrect amount entered");
	}
	
	else
	{
		Float final_amount = balance.getBalance();
		final_amount=balance.getBalance()+depositAmount;
		
	}
	
}


// method to withdraw amount
public void withdraw(float withdrawAmount)
{
	System.out.println("Your current balance is :" + balance);
	System.out.println("Enter an amount to withdraw");
	Scanner scann=new Scanner(System.in);
	withdrawAmount=scann.nextInt();
	float withdrawl=balance.getBalance();
	if(withdrawAmount>balance.getBalance())
	{
		System.out.println(("You have insufficient balance"));
	}
	else
	{
		withdrawl=balance.getBalance()-withdrawAmount;
		
	}
	
	
}




	
}