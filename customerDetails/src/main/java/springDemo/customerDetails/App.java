package springDemo.customerDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext application=  new ClassPathXmlApplicationContext("application-context.xml");   	
    	Customer customer1=(Customer) application.getBean("customer");
    	List<Customer> list=new ArrayList<Customer>();
    	list.add(customer1);
    	Customer customer2= (Customer) application.getBean("customer");
    	
    	//System.out.println("hiii");
    	System.out.println(customer1.getFirstName());
    	System.out.println(customer1.getLastName());
    }

    }

