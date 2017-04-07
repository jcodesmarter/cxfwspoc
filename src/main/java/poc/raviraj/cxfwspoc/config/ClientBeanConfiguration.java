package poc.raviraj.cxfwspoc.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import poc.raviraj.cxfwspoc.service.HelloWorld;

@Configuration
public class ClientBeanConfiguration {

	@Bean(name = "factory")
	public JaxWsProxyFactoryBean proxyFactoryBean() {
	    JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
	    proxyFactory.setServiceClass(HelloWorld.class);
	    proxyFactory.setAddress("http://localhost:9999/services/helloworld");
	    return proxyFactory;
	}
	
	@Bean(name = "client")
	public Object generateProxy(JaxWsProxyFactoryBean factory) {
		return factory.create();
	}

}
