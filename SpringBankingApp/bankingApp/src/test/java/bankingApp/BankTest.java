package bankingApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.controller.BankAppController;
import com.cg.service.SavingAccountServiceImpl;



public class BankTest {
   SavingAccountServiceImpl app;
   BankAppController mainapplication;
	@Before
	public void setUp()
	{
		app= new SavingAccountServiceImpl();
		
	}
/*	@Test
	public void withdrawTest()
	{
		app.deposit(1000);
		assertEquals(10000, app.deposit());
	}*/
	
	@Test
	public void testDeposit()
	{
		app.deposit(1000);
		//assertEquals(10000, app.deposit(2000));
	}

	@After
	public void tearDown()
	{
		app=null;
	}





    
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
