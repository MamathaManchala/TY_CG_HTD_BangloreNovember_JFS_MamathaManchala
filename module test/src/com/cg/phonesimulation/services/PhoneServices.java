package com.cg.phonesimulation.services;

import com.cg.phonesimulation.bean.PhoneBean;

public interface PhoneServices {


		public PhoneBean searchContact(String name);
		public boolean callContact(String name);
		public boolean messageContact(String name);
	}


