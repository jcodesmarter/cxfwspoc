package poc.raviraj.cxfwspoc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import poc.raviraj.cxfwspoc.config.ClientBeanConfiguration;
import poc.raviraj.cxfwspoc.service.HelloWorld;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ClientBeanConfiguration.class);
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("client");
		System.out.println(helloWorld.sayHi("Raviraj"));
	}

}
