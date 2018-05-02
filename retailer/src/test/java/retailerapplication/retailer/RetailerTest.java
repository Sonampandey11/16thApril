package retailerapplication.retailer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;

public class RetailerTest {
  ApplicationContext application= new ClassPathXmlApplicationContext("applicationContext.xml");
  final CustomerServiceImpl service= application.getBean("customerservice",CustomerServiceImpl.class);
  final SupplierServiceImpl sservice=application.getBean("supplierservice",SupplierServiceImpl.class);
  final GoodsServiceImpl   gservice=application.getBean("goodservice",GoodsServiceImpl.class);
  final RetailerServiceImpl rservice=application.getBean("retailerservice",RetailerServiceImpl.class);
 
  //Customer customer=(Customer) application.getBean("cdao");
  Customer customer= new Customer(106,"Sonam","Airoli","Rs200",12);
  Goods good =new Goods(2,"Britania",5,"Rs98",107);
  Supplier supplier= new Supplier(1,"Koutons","NaviMumbai",5,45,"Rs96",7);
  
 // @Test
  public void checkCustomerTest()
  {
	int check=service.addCustomer(customer);
	assertEquals(106, check);
  }
 // @Test
  public void updateCustomerTest()
  {
	Customer custom=new Customer(108,"Sonam","Airoli","Rs500",12);  
  }
  
 // @Test
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
 // @Test
  public void addGoods()
  {
	  int check=gservice.addGoods(good);
	  assertEquals(2, check);
  }

 // @Test
  public void removeGoods()
  {
	  Goods good= new Goods(2,"Britania",5,"Rs98",106);
  }
  //@Test
  public void addSupplier()
  {
	  int value=sservice.addSupplier(supplier);
	  assertEquals(1, value);
  }
 // @Test
  public void updateSupplier()
  {
	  int value=sservice.updateSubblier(supplier);
	  assertEquals(1, value);
	  
  }
  
  @Test
  public void deleteSupplier()
  {
	  int value=sservice.removeSupplier(supplier);
	  assertEquals(1, value);
  }
  

}
