package by.spring.bean.scope.example.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-customerService.xml");
	CustomerService csA = (CustomerService)context.getBean("customerService");
	csA.setMessage("I am csA");
	System.out.println("message:"+csA.getMessage());
	CustomerService csB = (CustomerService)context.getBean("customerService");
	System.out.println("message:"+csB.getMessage());
	
	}
}
