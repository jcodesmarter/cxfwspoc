package poc.raviraj.cxfwspoc.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import poc.raviraj.cxfwspoc.service.HelloWorldImpl;

@Configuration
public class ServiceBeanConfiguration {

	@Bean
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
	public Endpoint endpoint() {
	    EndpointImpl endpoint = new EndpointImpl(springBus(), new HelloWorldImpl());
	    endpoint.publish("http://localhost:9999/services/helloworld");
	    return endpoint;
	}

}
