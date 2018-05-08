package com.cg.bean;

/**
 * @author trainee
 *
 */
public class RetailerMain {
	private int retailerId;
	private String retailerName;
	private String retailerAddress;
	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}
	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(final String retailerName) {
		this.retailerName = retailerName;
	}
	/**
	 * @return the retailerAddress
	 */
	public String getRetailerAddress() {
		return retailerAddress;
	}
	/**
	 * @param retailerAddress the retailerAddress to set
	 */
	public void setRetailerAddress(final String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	
	/**
	 * @return the retailerId
	 */
	public int getRetailerId() {
		return retailerId;
	}
	/**
	 * @param retailerId the retailerId to set
	 */
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	/**
	 * 
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @param retailerId
	 * @param retailerName
	 * @param retailerAddress
	 */
	public RetailerMain(int retailerId, String retailerName, String retailerAddress) {
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}
	/**
	 * 
	 */
	public RetailerMain() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
