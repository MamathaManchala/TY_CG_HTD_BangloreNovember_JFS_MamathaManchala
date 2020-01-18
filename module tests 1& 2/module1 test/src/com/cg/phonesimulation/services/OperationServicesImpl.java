package com.cg.phonesimulation.services;
import com.cg.phonesimulation.bean.PhoneBean;

import com.cg.phonesimulation.dao.OperationDAO;
import com.cg.phonesimulation.factory.OperationFactory;

public class OperationServicesImpl  implements  OperationServices {



		OperationDAO dao =OperationFactory.instanceOfOperationDAOImpl();
		
		@Override
		public boolean addContact(PhoneBean bean) {
			return dao.addContact(bean);
		}

		@Override
		public boolean deleteContact(String name) {
			return dao.deleteContact(name);
		}

		@Override
		public boolean editContact(String name) {
			return dao.editContact(name);
		}

	}


