package com.capgemini.forestrymanagement.factory;

import com.capgemini.forestrymanagement.dao.ContractDAO;
import com.capgemini.forestrymanagement.dao.ContractDAOImpl;

public class ContractDAOManager {
	
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl();
	}


}
