package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.ContractBean;

public interface ContractServices {
	public boolean addContract(ContractBean bean);
	public boolean deleteContract (int contractNo);
	public ContractBean getContract(int contractNo);
	public List<ContractBean>getAllContract();
}
