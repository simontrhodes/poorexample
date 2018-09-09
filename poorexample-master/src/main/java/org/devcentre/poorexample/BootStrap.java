package org.devcentre.poorexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

	
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring/beans.xml");
		
		BeanFactory factory = (BeanFactory) context;
		
		MainApplication application = (MainApplication) factory.getBean("mainApp");
		application.run();
	}

}
