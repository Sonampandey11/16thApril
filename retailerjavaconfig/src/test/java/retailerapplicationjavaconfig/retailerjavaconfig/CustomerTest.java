package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cg.bean.Customer;
import com.cg.controller.Applicationconfig;
import com.cg.service.CustomerServiceImpl;

public class CustomerTest {
	ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
	final CustomerServiceImpl service= application.getBean("customerservice",CustomerServiceImpl.class);
	Customer customer= new Customer(10,"Arushi","Airoli","Rs200",12);


	@Test
	public void checkCustomerTest()
	{
		int check=service.addCustomer(customer);
		assertEquals(10, check);
	}
	@Test
	public void updateCustomerTest()
	{
		Customer custom=new Customer(11,"Neha","Airoli","Rs500",12);  
	}

	@Test
	public void deleteCustomerTest()
	{
		Customer custom=new Customer(108,"Sonam","Airoli","Rs500",12);  
		int value=service.removeCustomer(custom);
		assertEquals(1, value);
	}

	public void testNotNull()
	{
		Customer customers= new Customer(1,"Neha","air","Rs45",45);
		int check=service.addCustomer(customers);
		assertEquals(1, check);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
