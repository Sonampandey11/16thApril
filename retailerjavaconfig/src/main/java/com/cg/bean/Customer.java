package com.cg.bean;

/**
 * @author trainee
 *
 */
public class Customer {
	
private int customerId;
private String customerName;
private String customerAddress;
private String paymentMode;
private int retailerId;
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
 * @return the customerId
 */
public int getCustomerId() {
	return customerId;
}
/**
 * @param customerId the customerId to set
 */
public void setCustomerId(final int customerId) {
	this.customerId = customerId;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(final String customerName) {
	this.customerName = customerName;
}
/**
 * @return the customerAddress
 */
public String getCustomerAddress() {
	return customerAddress;
}
/**
 * @param customerAddress the customerAddress to set
 */
public void setCustomerAddress(final String customerAddress) {
	this.customerAddress = customerAddress;
}
/**
 * @return the paymentMode
 */
public String getPaymentMode() {
	return paymentMode;
}
/**
 * @param paymentMode the paymentMode to set
 */
public void setPaymentMode(final String paymentMode) {
	this.paymentMode = paymentMode;
}


/**
 * @param customerId
 * @param customerName
 * @param customerAddress
 * @param paymentMode
 * @param retailerId
 */
public Customer(int customerId, String customerName, String customerAddress, String paymentMode, int retailerId) {
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.paymentMode = paymentMode;
	this.retailerId = retailerId;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */



}
