package com.capgemini.mywebapp.services;

import java.util.List;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDao;
import com.capgemini.mywebapp.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao=new EmployeeDaoImpl();
	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		return dao.searchEmployee(empId);
	}
	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}
	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}
	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}
	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}
	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}
	

}
