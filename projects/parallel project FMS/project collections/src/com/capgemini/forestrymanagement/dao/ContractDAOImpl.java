package com.capgemini.forestrymanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.forestrymanagement.bean.ContractBean;

public class ContractDAOImpl implements ContractDAO {

	private List<ContractBean> contract=new ArrayList<ContractBean>();
	
	
	
	@Override
	public boolean addContract(ContractBean bean) {
		for ( ContractBean cb: contract) 
		{
			if( cb.getContractNo() == bean.getContractNo()) 
			return false;
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

		return false;
	}

	

	@Override
	public ContractBean getContract(int contractNo) {
		
		ContractBean bean=null;
		for ( ContractBean cb: contract) {
			if(cb.getContractNo()==contractNo) 
				
				return cb;
			}
		return null;
	}

	@Override
	public List<ContractBean> getAllContract() {
		return contract;
	}




	
}
