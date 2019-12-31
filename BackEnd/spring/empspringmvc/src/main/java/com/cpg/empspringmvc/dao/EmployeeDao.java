package com.cpg.empspringmvc.dao;

import java.util.List;

import com.cpg.empspringmvc.bean.EmployeeBean;

public interface EmployeeDao {
	
	public EmployeeBean auth(String email, String password);
	public boolean register(EmployeeBean bean);
	//public EmployeeBean getEmployee(String email);//below method and this is same
	public List<EmployeeBean> getEmployees(String Key);
	public boolean changePassword(int id, String password);
	

}
