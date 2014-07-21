package com.demo.form;

import org.apache.struts.action.ActionForm;

public class EmployeeForm extends ActionForm{

	private int eId;
	private String eName;
	private int esalary;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	
}
