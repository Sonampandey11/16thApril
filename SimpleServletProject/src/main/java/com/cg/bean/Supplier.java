package com.cg.bean;

/**
 * @author trainee
 *
 */
public class Supplier {
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private int quantityOrder;
	private int orderId;
	private String amount;
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
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return supplierId;
	}



	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(final int supplierId) {
		this.supplierId = supplierId;
	}



	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}



	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName;
	}



	/**
	 * @return the supplierAddress
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}



	/**
	 * @param supplierAddress the supplierAddress to set
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}



	/**
	 * @return the quantityOrder
	 */
	public int getQuantityOrder() {
		return quantityOrder;
	}



	/**
	 * @param quantityOrder the quantityOrder to set
	 */
	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}



	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}



	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}



	/**
	 * 
	 */
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}






	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param quantityOrder
	 * @param orderId
	 * @param amount
	 * @param retailerId
	 */
	public Supplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder, int orderId,
			String amount, int retailerId) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantityOrder = quantityOrder;
		this.orderId = orderId;
		this.amount = amount;
		this.retailerId = retailerId;
	}



}
