package com.cg.phonesimulation.services;

import com.cg.phonesimulation.bean.PhoneBean;
import com.cg.phonesimulation.dao.ListDAO;
import com.cg.phonesimulation.factory.ListFactory;
import java.util.List;


public class ListServicesImpl  implements ListServices {
		ListDAO dao =ListFactory.instanceOfListDAOIImpl();
		
		@Override
		public List<PhoneBean> getAllContacts() {
			return dao.getAllContacts();
		}
		
		
	}

