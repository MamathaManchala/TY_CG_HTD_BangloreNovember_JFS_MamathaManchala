package com.cg.phonesimulation.services;
import com.cg.phonesimulation.bean.PhoneBean;

import com.cg.phonesimulation.dao.PhoneDao;
import com.cg.phonesimulation.factory.PhoneFactory;


public class PhoneServicesImpl  implements PhoneServices{


		PhoneDao dao =PhoneFactory.instanceOfPhoneDaoImpl();
		

		@Override
		public PhoneBean searchContact(String name) {
			return dao.searchContact(name);
		}

		@Override
		public boolean callContact(String name) {
			return dao.callContact(name);
		}

		@Override
		public boolean messageContact(String name) {
			return dao.messageContact(name);
		}

	}


