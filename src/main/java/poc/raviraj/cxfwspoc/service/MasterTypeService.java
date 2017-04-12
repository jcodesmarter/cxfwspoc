package poc.raviraj.cxfwspoc.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import poc.raviraj.cxfwspoc.model.Department;
import poc.raviraj.cxfwspoc.model.Designation;
import poc.raviraj.cxfwspoc.model.Gender;
import poc.raviraj.cxfwspoc.model.Role;

@WebService(name="masterTypeService")
public interface MasterTypeService {

	@WebMethod
	public List<Department> getAllDepartments();
	
	@WebMethod
	public List<Designation> getAllDesignations();
	
	@WebMethod
	public List<Role> getAllRoles();
	
	@WebMethod
	public List<Gender> getAllGenders();
}
