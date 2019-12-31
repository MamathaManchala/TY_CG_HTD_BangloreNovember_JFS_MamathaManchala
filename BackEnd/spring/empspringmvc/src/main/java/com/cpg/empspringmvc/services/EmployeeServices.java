package com.cpg.empspringmvc.services;

import java.util.List;

import com.cpg.empspringmvc.bean.EmployeeBean;

public interface EmployeeServices {
	
	public EmployeeBean auth(String email, String password);
	public boolean register(EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String Key);
	public boolean changePassword(int id, String password);

}
