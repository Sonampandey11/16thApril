package com.cg.model;

public class Customer extends Contact {
	private int customerId;
	private String firstName;
	private String lastName;
	private Contact contact;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(final Contact contact) {
		this.contact = contact;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contact=" + contact + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(final int customerId, final String firstName, final String lastName, final Contact contact) {
		this.customerId = +customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}
	
	
	

}
