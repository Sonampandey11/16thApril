package com.cg.model;


public class SavingAccount {
	
	private float balance;
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
	public void setBalance(float balance) {
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
	public void setInterestRate(float interestRate) {
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
	public void setInterestPeriod(float interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", interestRate=" + interestRate + ", interestPeriod="
				+ interestPeriod + "]";
	}
	public SavingAccount(float balance, float interestRate, float interestPeriod) {
		this.balance = 10000;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
	}
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}