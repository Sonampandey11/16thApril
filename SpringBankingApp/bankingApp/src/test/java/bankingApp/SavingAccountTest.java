package bankingApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.cg.service.SavingAccountServiceImpl;

public class SavingAccountTest {
	
	SavingAccountServiceImpl service;
	@Before
	public void setUp()
	{
	service= new SavingAccountServiceImpl();	
	}
	
	@Test
	public void testDeposit()
	{
		service.deposit(200);
		assertEquals(200, service.deposit(200));
	}
	
	@Test
	public void testWithdraw()
	{
		assertEquals(100, service.withdraw(200));
	}
	
	@Test
	public void testFail()
	{
		assertNotEquals(100, service.withdraw(800));
	}
	
	
	@Test
	public void testNullValue()
	{
		assertFalse("please enter correct balance", service.withdraw(200));
	}

	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@After
	public void tearDown()
	{
	}

}
