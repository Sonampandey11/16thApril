package mavenproject.bankapplication.bean;

public class CheckingAccount implements Account {

	public float transaction() {
		int balance=1000;
		float interestRate = (float) 0.07;
		float simpleInterest=balance*interestRate;
		System.out.println("Your interest is"+simpleInterest);
		
		return balance;

     	
	}

}
