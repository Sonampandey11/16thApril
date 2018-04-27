package bankingApp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.Customer;

public class CustomerTest {
	final ApplicationContext application= new ClassPathXmlApplicationContext("application-context.xml");
	final Customer customer1=(Customer) application.getBean("customer");
	/**
	 * initialization of customer bean
	 */
	@Before
	public void setUp()
	{
		//customer=new Customer();
		
	}
	@Test
	public void testCustomer()
	{
		assertEquals("sonam", customer1.getFirstName());
		assertEquals("pandey", customer1.getLastName());
		
		
	}
	
	
	public void testdetail()
	{
	assertEquals("10001",customer1.getCustomerId() );
	assertEquals("452005", customer1.getHouseNumber());
	assertEquals("mumbai", customer1.getCity());
	}
}
