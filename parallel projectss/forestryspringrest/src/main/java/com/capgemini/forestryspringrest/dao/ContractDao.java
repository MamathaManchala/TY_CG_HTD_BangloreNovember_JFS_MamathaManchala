package com.capgemini.forestryspringrest.dao;


import java.util.List;

import com.capgemini.forestryspringrest.dto.ContractBean;

public interface ContractDao {

	public boolean addContract(ContractBean bean);
	public boolean deleteContract (int contractNo);
	public ContractBean getContract(int contractNo);
	public List<ContractBean>getAllContract();
	
}



