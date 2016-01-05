package by.spring.injectDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-injectDate-customer.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}

}
