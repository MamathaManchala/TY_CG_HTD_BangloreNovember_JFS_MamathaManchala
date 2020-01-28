package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.ContractDao;
import com.capgemini.forestryjpawithhibernate.dto.ContractBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class ContractServicesImpl implements ContractServices  {

	ContractDao contractDao =ForestryFactory.instanceOfContractDaoImpl();
	
	public boolean addContract(ContractBean bean) {
		return contractDao.addContract(bean);
	}

	public boolean deleteContract(int contractNo) {
		return contractDao.deleteContract(contractNo);
	}

	public ContractBean getContract(int contractNo) {
		return contractDao.getContract(contractNo);
	}

	public List<ContractBean> getAllContract() {
		return contractDao.getAllContract();
	}

}
