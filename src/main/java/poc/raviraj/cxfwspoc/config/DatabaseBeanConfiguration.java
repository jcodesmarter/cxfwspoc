package poc.raviraj.cxfwspoc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({ "classpath:database.properties" })
public class DatabaseBeanConfiguration {

	@Autowired
	private Environment env;
	
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	}
}
