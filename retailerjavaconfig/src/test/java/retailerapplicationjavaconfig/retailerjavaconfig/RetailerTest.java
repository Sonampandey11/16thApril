package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.controller.Applicationconfig;
import com.cg.service.RetailerServiceImpl;

public class RetailerTest {
	ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
	final RetailerServiceImpl rservice=application.getBean("retailerservice",RetailerServiceImpl.class);
	 
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
