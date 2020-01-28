package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.ContractBean;
import com.capgemini.forestrymanagementcollections.dao.ContractDao;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;


public class ContractServicesImpl implements ContractServices  {

	ContractDao contractDao =ForestryFactory.instanceOfContractDaoImpl();
	
	@Override
	public boolean addContract(ContractBean bean) {
		return contractDao.addContract(bean);
	}

	@Override
	public boolean deleteContract(int contractNo) {
		return contractDao.deleteContract(contractNo);
	}

	@Override
	public ContractBean getContract(int contractNo) {
		return contractDao.getContract(contractNo);
	}

	@Override
	public List<ContractBean> getAllContract() {
		return contractDao.getAllContract();
	}

}
