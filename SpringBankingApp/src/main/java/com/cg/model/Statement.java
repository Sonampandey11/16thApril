package com.cg.model;

/**
 * @author trainee
 *
 */
public class Statement {
private String transactionDate;
private String transactionAmount;
/**
 * @return the transactionDate
 */
public String getTransactionDate() {
	return transactionDate;
}
/**
 * @param transactionDate the transactionDate to set
 */
public void setTransactionDate(String transactionDate) {
	this.transactionDate = transactionDate;
}
/**
 * @return the transactionAmount
 */
public String getTransactionAmount() {
	return transactionAmount;
}
/**
 * @param transactionAmount the transactionAmount to set
 */
public void setTransactionAmount(String transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public Statement(String transactionDate, String transactionAmount) {
	this.transactionDate = transactionDate;
	this.transactionAmount = transactionAmount;
}
public Statement() {
	super();
	// TODO Auto-generated constructor stub
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Statement [transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + "]";
}



}
