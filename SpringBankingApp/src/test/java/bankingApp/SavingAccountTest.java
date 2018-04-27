package bankingApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.ISavingAccountService;
import com.cg.service.SavingAccountServiceImpl;

public class SavingAccountTest {
	
	final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	 final ISavingAccountService service=(SavingAccountServiceImpl)  application.getBean("savings");
	
	@Before
	public void setUp()
	{
	//service= new SavingAccountServiceImpl();	
	}
	@Test
	public void testwithdraw()
	{
		
	}
	
	/*@Test
	public void testDeposit()
	{
		assertEquals(0, 0);
		//assertEquals(200, service.deposit(depositAmount));
	}
	
	@Test
	public void testWithdraw(float depositAmount)
	{
		
		//assertEquals(100, service.deposit(depositAmount));
	}
	
	@Test
	public void testFail()
	{
		//assertNotEquals(100, service.withdraw(800));
	}
	
	
	@Test
	public void testNullValue()
	{
		//assertFalse("please enter correct balance", service.withdraw(200));
	}

	
	@Test
	public void testNegativeNumber()
	{
	 //assertFalse(service.deposit(-2));	
	}*/
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@After
	public void tearDown()
	{
	}

}
