package com.capgemini.empspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.empspringboot.dto.EmployeeBean;
import com.capgemini.empspringboot.exception.EmployeeException;
import com.capgemini.empspringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServices {
	@Autowired
	private EmployeeRepository repository;
	private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		EmployeeBean bean = repository.findByEmail(email);
		if(encoder.matches(password, bean.getPassword())) {
			return bean;
		}else {
			throw new EmployeeException("Password not matching");
		}
		//throw new EmployeeException("Email does not Exist");
	}
	

	@Override
	public boolean register(EmployeeBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword()));
		repository.save(bean);
		return true;
	}

	@Override
	public List<EmployeeBean> getEmployees(String Key) {
		
		return repository.findByKey(Key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		repository.changePassword(id, encoder.encode(password));
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

}

