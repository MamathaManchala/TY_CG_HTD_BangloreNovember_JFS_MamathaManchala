package com.capgemini.forestrymanagementcollections.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.ContractBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;

public class ContractDaoImpl implements ContractDao {

	private List<ContractBean> contract=new ArrayList<ContractBean>();



	@Override
	public boolean addContract(ContractBean bean) {
		for ( ContractBean cb: contract) 
		{
			if( cb.getContractNo() == bean.getContractNo()) {
				throw new NotFoundException("Contract Id Already Exist");
		}
		}
		contract.add(bean);
		return true;
	}

	@Override
	public boolean deleteContract(int contractNo) {
		ContractBean bean=null;
		for(ContractBean cb : contract) {
			if(cb.getContractNo() == contractNo) {
				bean = cb;
			}
		}
		if(bean != null) {
			contract.remove(bean);
			return true;
		}
		throw new NotFoundException("Contract Details Not Found");	
	}



	@Override
	public ContractBean getContract(int contractNo) {

		ContractBean bean=null;
		for ( ContractBean cb: contract) {
			if(cb.getContractNo()==contractNo) 

				return cb;
		}
		throw new NotFoundException("Contract Details Not Found");	
	}

	@Override
	public List<ContractBean> getAllContract() {
		return contract;
	}

}

