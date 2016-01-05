package by.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-constructor.xml");
		OutputHelper op = (OutputHelper) context.getBean("outputHelper");
		op.outputGenerator();
	}

}
