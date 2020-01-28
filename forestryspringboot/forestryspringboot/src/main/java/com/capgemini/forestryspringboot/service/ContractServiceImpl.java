package com.capgemini.forestryspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringboot.dao.ContractDao;
import com.capgemini.forestryspringboot.dao.CustomerDao;
import com.capgemini.forestryspringboot.dao.ProductDao;
import com.capgemini.forestryspringboot.dto.ContractBean;
import com.capgemini.forestryspringboot.exception.NotFoundException;
@Service
public class ContractServiceImpl implements ContractService{

	@Autowired
	private ContractDao contractDao;
	@Autowired
	private CustomerDao daoCustomer;
	
	@Autowired
	private ProductDao daoProduct;

	@Override
	public boolean addContract(ContractBean bean) {
		if(daoCustomer.getCustomer(bean.getCustomerId())==null) {
			 
			 throw new NotFoundException("CustomerId does'not exists!!!");
		 }
		 if((daoProduct.getProduct(bean.getProductId())==null)) {
			 throw new NotFoundException("ProductId does'not exists!!!");
		 }
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
