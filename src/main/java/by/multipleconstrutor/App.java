package by.multipleconstrutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-multiple-constructor.xml");
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer);
	}

}
