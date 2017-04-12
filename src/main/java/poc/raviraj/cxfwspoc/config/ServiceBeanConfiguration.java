package poc.raviraj.cxfwspoc.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import poc.raviraj.cxfwspoc.service.HelloWorldImpl;
import poc.raviraj.cxfwspoc.service.MasterTypeServiceImpl;
import poc.raviraj.cxfwspoc.service.UserServiceImpl;

@Configuration
@Import(value = {DatabaseBeanConfiguration.class})
@ComponentScan(basePackages = {"poc.raviraj.cxfwspoc.service", "poc.raviraj.cxfwspoc.dao"})
public class ServiceBeanConfiguration {
	
	@Autowired
	HelloWorldImpl helloWorldImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	MasterTypeServiceImpl masterTypeServiceImpl;

	@Bean(name = "cxf")
	public SpringBus springBus() {
		SpringBus bus = new SpringBus();
		return bus;
	}

	@Bean
	public Endpoint endpointHelloWorld(SpringBus cxf) {
		EndpointImpl endpoint = new EndpointImpl(cxf, helloWorldImpl);
		endpoint.publish();
		return endpoint;
	}

	@Bean
	public Endpoint endpointUserService(SpringBus cxf) {
		EndpointImpl endpoint = new EndpointImpl(cxf, userServiceImpl);
		endpoint.publish();
		return endpoint;
	}

	@Bean
	public Endpoint endpointMasterTypeService(SpringBus cxf) {
		EndpointImpl endpoint = new EndpointImpl(cxf, masterTypeServiceImpl);
		endpoint.publish();
		return endpoint;
	}

}
