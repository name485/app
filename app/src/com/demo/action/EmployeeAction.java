package com.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.demo.dao.EmployeeDAO;
import com.demo.form.EmployeeForm;

public class EmployeeAction extends Action{
 @Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	// TODO Auto-generated method stub
	 //Hello how are you????
	 EmployeeForm empForm= (EmployeeForm)form;
	 EmployeeDAO empdao= new EmployeeDAO();
	 empdao.insertEmployee(empForm.geteId(), empForm.geteName(), empForm.getEsalary());
	return mapping.findForward("success");
 }
}
