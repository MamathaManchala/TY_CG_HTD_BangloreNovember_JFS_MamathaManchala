package com.capgemini.forestrymanagement.dao;

import java.util.List;

import com.capgemini.forestrymanagement.bean.ContractBean;


public interface ContractDAO {

	public boolean addContract(ContractBean bean);
	public boolean deleteContract (int contractNo);
	public ContractBean getContract(int contractNo);
	public List<ContractBean>getAllContract();
}
