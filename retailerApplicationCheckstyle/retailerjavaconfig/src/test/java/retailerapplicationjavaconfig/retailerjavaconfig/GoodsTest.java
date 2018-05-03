package retailerapplicationjavaconfig.retailerjavaconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Goods;
import com.cg.controller.Applicationconfig;
import com.cg.service.GoodsServiceImpl;

public class GoodsTest {
	ApplicationContext application=new AnnotationConfigApplicationContext(Applicationconfig.class);
	final GoodsServiceImpl   gservice=application.getBean("goodservice",GoodsServiceImpl.class);
	 Goods good =new Goods(39,"Koutonsi",5,"Rs98",107);
	 @Test
	  public void addGoods()
	  {
		  int check=gservice.addGoods(good);
		  assertEquals(39, check);
	  }

	 @Test
	  public void removeGoods()
	  {
		  Goods good= new Goods(17,"Britania",5,"Rs98",106);
	  }
	 
	
}
