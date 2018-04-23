package mavenproject.bankapplication.bean;

public class FlexibleSavingAccount implements Account {

	SavingAccount saving=new  SavingAccount();
	public float transaction() {
	
		float interesatRate=(float) 0.006;
		//float value=get;
		return interesatRate;
	}

}
