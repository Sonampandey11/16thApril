package mavenproject.bankapplication.bean;

import java.util.Date;


public class Statement{
private String transactionDate;
private String transactionAmount;
private String transactionTime;
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
/**
 * @return the transactionTime
 */
public String getTransactionTime() {
	return transactionTime;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Statement [transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount
			+ ", transactionTime=" + transactionTime + "]";
}
/**
 * @param transactionTime the transactionTime to set
 */
public void setTransactionTime(String transactionTime) {
	this.transactionTime = transactionTime;
}

public Statement() {
	super();
	// TODO Auto-generated constructor stub
}




}
