package com.capgemini.forestryspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.ContractDao;
import com.capgemini.forestryspringrest.dto.ContractBean;
@Service
public class ContractServiceImpl implements ContractService{

	@Autowired
	private ContractDao contractDao;

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
