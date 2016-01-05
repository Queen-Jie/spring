package by.set.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-outputHelper.xml");
		OutputHelper op = (OutputHelper) context.getBean("outputHelper");
		op.generatorOutput();
	}
}
