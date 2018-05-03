package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Supplier;
import com.cg.controller.Applicationconfig;
import com.cg.service.SupplierServiceImpl;

public class SupplierTest {
	ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
	 final SupplierServiceImpl sservice=application.getBean("supplierservice",SupplierServiceImpl.class);
	 Supplier supplier= new Supplier(8,"Koutons","NaviMumbai",5,45,"Rs96",7);
	
	 @Test
	  public void addSupplier()
	  {
		  int value=sservice.addSupplier(supplier);
		  assertEquals(8, value);
	  }
	 @Test
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
	 
	// @Test
	public void test() {
		fail("Not yet implemented");
	}

}
