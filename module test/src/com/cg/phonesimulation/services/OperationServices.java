package com.cg.phonesimulation.services;

import com.cg.phonesimulation.bean.PhoneBean;

public interface OperationServices {
	


		public boolean addContact(PhoneBean bean);
		public boolean deleteContact(String name);
		public boolean editContact(String name);
	}


