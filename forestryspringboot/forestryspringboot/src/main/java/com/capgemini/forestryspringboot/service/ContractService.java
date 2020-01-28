package com.capgemini.forestryspringboot.service;


import java.util.List;

import com.capgemini.forestryspringboot.dto.ContractBean;

public interface ContractService {

	public boolean addContract(ContractBean bean);
	public boolean deleteContract (int contractNo);
	public ContractBean getContract(int contractNo);
	public List<ContractBean>getAllContract();
	
}



