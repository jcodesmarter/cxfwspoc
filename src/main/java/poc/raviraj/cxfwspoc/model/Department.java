package poc.raviraj.cxfwspoc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Min;

@Entity
@DiscriminatorValue("department")
public class Department extends MasterType{

	private static final long serialVersionUID = 1L;
	
	public Department(){
		//required for generating proxy.. proxy is generated by the gwt compiler
	}
	
	@Override
	@Min(value = 1, message="Department is not specified")
	public Long getKeyId() {
		return super.getKeyId();
	}

}
