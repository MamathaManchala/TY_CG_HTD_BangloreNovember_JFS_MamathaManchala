package com.capgemini.forestryspringrest.service;


import java.util.List;

import com.capgemini.forestryspringrest.dto.ContractBean;

public interface ContractService {

	public boolean addContract(ContractBean bean);
	public boolean deleteContract (int contractNo);
	public ContractBean getContract(int contractNo);
	public List<ContractBean>getAllContract();
	
}



