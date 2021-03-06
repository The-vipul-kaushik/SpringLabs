package cg.feb18.spring.lab1.model;

import java.util.List;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public SBU() {
		
	}
	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public void getEmpList()
	{
		for(Employee e:empList)
		{
			e.toString();
		}
	}
	
}
