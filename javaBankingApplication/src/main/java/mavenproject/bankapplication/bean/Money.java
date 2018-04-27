package mavenproject.bankapplication.bean;

public class Money {
	private float balance;

	

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

	public Money(float balance) {
		super();
		this.balance = balance;
	}

	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
