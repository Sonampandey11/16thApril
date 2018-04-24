package com.cg.bean;

public class Customer {
private String firstName;
private String lastName;
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}


}
