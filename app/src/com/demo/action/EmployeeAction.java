package com.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.demo.dao.EmployeeDAO;
import com.demo.form.EmployeeForm;


//again new change into github
public class EmployeeAction extends Action{
 @Override
 //this is new project into github //this is new project into github //this is new project into github //this is new project into github
 //this is new project into github //this is new project into github //this is new project into github //this is new project into github //this is new project into github
 //this is new project into github //this is new project into github //this is new project into github //this is new project into github
 //this is new project into github //this is new project into github //this is new project into github
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	 EmployeeForm empForm= (EmployeeForm)form;
	 EmployeeDAO empdao= new EmployeeDAO();
	 empdao.insertEmployee(empForm.geteId(), empForm.geteName(), empForm.getEsalary());
	return mapping.findForward("success");
 }
}
