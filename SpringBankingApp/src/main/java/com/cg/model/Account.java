package com.cg.model;

/**
 * @author trainee
 *
 */
public class Account {
	private long accountNumber;
	private String accountType;
	private Customer customerId;
	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the customerId
	 */
	public Customer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customerId=" + customerId
				+ "]";
	}
	public Account(long accountNumber, String accountType, Customer customerId) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customerId = customerId;
	}
	
   
}
