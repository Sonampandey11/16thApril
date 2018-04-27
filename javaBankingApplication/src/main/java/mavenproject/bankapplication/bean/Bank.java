package mavenproject.bankapplication.bean;

public class Bank  {
	private String bankName;
	private String bankBranch;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankBranch=" + bankBranch + "]";
	}
	public Bank(String bankName, String bankBranch) {
		super();
		this.bankName = bankName;
		this.bankBranch = bankBranch;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
 

}
