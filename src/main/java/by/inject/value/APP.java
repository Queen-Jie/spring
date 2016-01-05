package by.inject.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * inject value方法一：
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring-inject-value-normal-way.xml");
		 * 
		 * inject value方法二：
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring-inject-value-shortCut.xml");
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-inject-value-p-schema.xml");
		FileNameGenerator fng = (FileNameGenerator) context.getBean("fileNameGenerator");
		System.out.println(fng);
	}

}
