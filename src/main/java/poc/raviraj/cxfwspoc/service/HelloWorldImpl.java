package poc.raviraj.cxfwspoc.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "poc.raviraj.cxfwspoc.service.HelloWorld", serviceName="helloworld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(@WebParam(name = "name") String name) {
		return "Hello, " + name + " !!!";
	}

}
