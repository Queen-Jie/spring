package by.spring.bean.configuration.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-configuration.inheritance-customer.xml ");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}

}
