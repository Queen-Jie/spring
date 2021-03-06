package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.output.OutputHelper;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-common.xml","SpringBeans.xml" });

		OutputHelper output = (OutputHelper) context.getBean("outputHelper");
		output.generateOutput();

	}

}
