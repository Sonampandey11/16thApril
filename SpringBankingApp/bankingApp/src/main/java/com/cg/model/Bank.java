package com.cg.model;

public class Bank  {
	private String bankName;
	private String bankBranch;
	private int bankId;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the bankBranch
	 */
	public String getBankBranch() {
		return bankBranch;
	}
	/**
	 * @param bankBranch the bankBranch to set
	 */
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	/**
	 * @return the bankId
	 */
	public int getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankBranch=" + bankBranch + ", bankId=" + bankId + "]";
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bankName, String bankBranch, int bankId) {
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.bankId = ++bankId;
	}
	
	
	

}
