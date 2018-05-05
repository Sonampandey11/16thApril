package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;
import com.cg.controller.Applicationconfig;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;

public class RetailerTest {
	ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
	final RetailerServiceImpl rservice=application.getBean("retailerservice",RetailerServiceImpl.class);
	Customer customer= new Customer(103,"Sonam","Airoli","Rs200",12);
	Goods good =new Goods(3,"Britania",5,"Rs98",107);
	Supplier supplier= new Supplier(5,"Koutons","NaviMumbai",5,45,"Rs96",7);

	@Test
	public void viewCustomerTest() {
		List<Customer> list=rservice.viewCustomer();
		assertTrue(list.contains(list.get(0)));
		
	}
	
	@Test
	public void viewGoods()
	{
		List<Goods> list=rservice.viewGoods();
		assertTrue(list.contains(list.get(0)));
	}
	
	
	@Test
	public void viewSupplier()
	{
		List<Supplier> list=rservice.viewSupplier();
		assertTrue(list.contains(list.get(0)));
	}
	
	
	
}
