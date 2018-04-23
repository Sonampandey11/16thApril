package mavenproject.bankapplication.bean;

public class Period {
private int interestPeriod;

/**
 * @return the interestPeriod
 */
public int getInterestPeriod() {
	return interestPeriod;
}

/**
 * @param interestPeriod the interestPeriod to set
 */
public void setInterestPeriod(int interestPeriod) {
	this.interestPeriod = interestPeriod;

}

public Period(int interestPeriod) {
	super();
	this.interestPeriod = interestPeriod;
}

public Period() {
	super();
	// TODO Auto-generated constructor stub
}


}
