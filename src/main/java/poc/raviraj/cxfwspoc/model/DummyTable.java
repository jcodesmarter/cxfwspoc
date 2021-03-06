package poc.raviraj.cxfwspoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poc_dummy_table")
public class DummyTable extends AuditableModel {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long dummyId;
	
	private String dummyText;
	
	public DummyTable(){
		//required for generating proxy.. proxy is generated by the gwt compiler
	}
	
	public Long getDummyId() {
		return dummyId;
	}
	public void setDummyId(Long dummyId) {
		this.dummyId = dummyId;
	}
	public String getDummyText() {
		return dummyText;
	}
	public void setDummyText(String dummyText) {
		this.dummyText = dummyText;
	}

}
