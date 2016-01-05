package by.spring.listFactoryBean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-listFactoryBean-customer.xml");
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust);

	}
}
