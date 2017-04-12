package poc.raviraj.cxfwspoc.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poc.raviraj.cxfwspoc.dao.MasterTypeDAO;
import poc.raviraj.cxfwspoc.model.Department;
import poc.raviraj.cxfwspoc.model.Designation;
import poc.raviraj.cxfwspoc.model.Gender;
import poc.raviraj.cxfwspoc.model.Role;

@Service(value="masterTypeService")
@WebService(name = "masterTypeService", endpointInterface = "poc.raviraj.cxfwspoc.service.MasterTypeService", serviceName="mastertypes", wsdlLocation = "wsdl/mastertypes.wsdl")
public class MasterTypeServiceImpl implements MasterTypeService {

	@Autowired
	MasterTypeDAO masterTypeDAO;

	public List<Department> getAllDepartments() {
		List<Department> list = masterTypeDAO.getAllDepartments();
		return list;
	}

	public List<Designation> getAllDesignations() {
		return masterTypeDAO.getAllDesignations();
	}

	public List<Role> getAllRoles() {
		return masterTypeDAO.getAllRoles();
	}

	public List<Gender> getAllGenders() {
		return masterTypeDAO.getAllGenders();
	}
}
