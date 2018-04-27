package bankingApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.BankAppController;
import com.cg.model.Bank;
import com.cg.service.SavingAccountServiceImpl;



public class BankTest {
	final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
    final Bank bank=(Bank) application.getBean("bankApp");
	@Ignore
	public void setUp()
	{
		//app= new SavingAccountServiceImpl();
		
	}
	
	@Test
	public void testBank()
	{
		assertEquals("StandardChartered", bank.getBankName());
		
	}
	
	@Test
	public void testDetails()
	{
		assertEquals("Airoli", bank.getBankBranch());
		assertEquals("101", bank.getBankId());
	}
	
	

}
