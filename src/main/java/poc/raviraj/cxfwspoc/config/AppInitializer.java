package poc.raviraj.cxfwspoc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		//register bean configuration class.. this will initialize third party beans.. 
		context.register(ServiceBeanConfiguration.class);
		
		//servlet-listener configuraiton
		container.addListener(new ContextLoaderListener(context));
		
		//load on startup org.apache.cxf.transport.servlet.CXFServlet with url-pattern mapping /services/*
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new CXFServlet());
		dispatcher.addMapping("/services");
	}

}
