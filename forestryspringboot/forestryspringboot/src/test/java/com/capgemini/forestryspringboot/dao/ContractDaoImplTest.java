package com.capgemini.forestryspringboot.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.forestryspringboot.dto.ContractBean;
import com.capgemini.forestryspringboot.dto.CustomerBean;
@SpringBootTest
class ContractDaoImplTest {
	
	
	@Autowired
	private ContractDao contractDao ;


	@Test
	void testAddContract() {
		ContractBean bean=new ContractBean();
		bean.setContractNo(10);
		bean.setCustomerId(5);
		bean.setHaulierId(54);
		bean.setProductId(44);
		bean.setDeliveryDate("12/3/2020");
		bean.setQuantity(3);
		assertTrue(contractDao.addContract(bean));
	}

	@Test
	void testGetContract() {
		ContractBean contract = contractDao.getContract(1);
	    assertNotNull(contract);
	}
	

	@Test
	void testGetAllContract() {
		List<ContractBean> beans = contractDao.getAllContract();
		assertNotNull(beans);
	}

	@Test
	void testDeleteContract() {
		ContractBean contract = new ContractBean();
		contract.setContractNo(1);
		assertTrue(contractDao.deleteContract(contract.getContractNo()));
		
	}
	

}
