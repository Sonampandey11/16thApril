package com.cg.model;


/**
 * @author trainee
 *
 */
public class SavingAccount {
	//private int accountNumber;
	private float balance=10000;
	private float interestRate;
	private float interestPeriod;
	
	
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(final float balance) {
		this.balance = balance;
	}
	/**
	 * @return the interestRate
	 */
	public float getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(final float interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the interestPeriod
	 */
	public float getInterestPeriod() {
		return interestPeriod;
	}
	/**
	 * @param interestPeriod the interestPeriod to set
	 */
	public void setInterestPeriod(final float interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	public SavingAccount( final float balance, final float interestRate, final float interestPeriod) {
		
		this.balance = balance;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
	}
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingAccount [ balance=" + balance + ", interestRate="
				+ interestRate + ", interestPeriod=" + interestPeriod + "]";
	}
	

	
	
}