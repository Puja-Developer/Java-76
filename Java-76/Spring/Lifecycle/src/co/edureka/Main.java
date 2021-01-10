package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("------------------");
		
		//close the spring container
		//((ConfigurableApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
