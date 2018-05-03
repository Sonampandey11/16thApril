package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.bean.Customer;
import com.cg.bean.Goods;
import com.cg.bean.Supplier;

public class CustomerBeanTest {

	Customer customer=new Customer(1,"sona","Airport","Rs45",1);
	Goods good =new Goods(12,"Dressberry",5,"Rs9800",109);
	Supplier supplier= new Supplier(5,"Levis","Mumbai",5,45,"Rs96",7);

	@Test
	public void checkName()
	{
		assertEquals(1, customer.getCustomerId());
		assertEquals("sona", customer.getCustomerName());
		assertEquals("Airport", customer.getCustomerAddress());
		assertEquals("Rs45", customer.getPaymentMode());
		assertEquals(1, customer.getCustomerId());
	}



	@Test
	public void checkGoods()
	{
		assertEquals(12, good.getGoodsId());
		assertEquals("Dressberry", good.getGoodsName());
		assertEquals(5, good.getGoodsQuantity());
		assertEquals("Rs9800", good.getGoodsPrice());
		assertEquals(109, good.getSupplierId());

	}
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private int quantityOrder;
	private int orderId;
	private String amount;
    private int retailerId;
    
	
	@Test
	public void checkSupplier()
	{
		assertEquals(5, supplier.getSupplierId());
		assertEquals("Levis", supplier.getSupplierName());
		assertEquals("Mumbai", supplier.getSupplierAddress());
		assertEquals(5, supplier.getQuantityOrder());
		assertEquals(45, supplier.getOrderId());
		assertEquals("Rs96", supplier.getAmount());
		assertEquals(7, supplier.getRetailerId());
	}



}
