package mavenproject.bankapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mavenproject.bankapplication.bean.CheckingAccount;
import mavenproject.bankapplication.bean.SavingAccount;


/*
 * program name: BankApplicationTest 
 * Description: Creating an testcase for banking application
 */
public class BankApplicationTest {
	App mainapplication;
	SavingAccount app;	
	@Before
	public void setUp()
	{
		app= new SavingAccount();
		mainapplication= new App();
	}


	@Test
	public void testWithdraw()
	{
		mainapplication.bankingApplication();
		assertEquals(10000, mainapplication.bankingApplication());
	}
	
	@Test
	public void testDeposit() {
		
	   mainapplication.bankingApplication();
	   assertEquals(1000, mainapplication.bankingApplication());
		
	}
    @Test
    public void testTransaction()
    {
    	CheckingAccount account=new CheckingAccount();
    	assertEquals(0, account.transaction());
    }
	
	@After
	public void tearDown()
	{
		app=null;
	}

	public BankApplicationTest() {
		super();

	}



}