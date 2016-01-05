package by.spring.inner.bean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-customer-person.xml");
		Customer customer =(Customer)context.getBean("customerBean");
		System.out.println(customer);
	}

}
