package com.capgemini.forestryspringboot.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.forestryspringboot.dto.ContractBean;
import com.capgemini.forestryspringboot.dto.CustomerBean;
import com.capgemini.forestryspringboot.dto.LandBean;
@SpringBootTest
class LandDaoImplTest {
	
	@Autowired
	private LandDao landDao;


	@Test
	void testAddLandDetails() {
		LandBean bean = new LandBean();
		bean.setLandId(52200);
		bean.setLandValue(5678);
		bean.setLandLocation("bnglr");
		assertTrue(landDao.addLandDetails(bean));
		
	}
	
//	@Test
//	void testModifyLandDetails() {
//		LandBean bean1 = new LandBean();
//		bean1.setLandId(5);
//		bean1.setLandValue(78);
//		bean1.setLandLocation("tpt");
//		assertTrue(landDao.modifyLandDetails(bean1));
//	}
//
//	@Test
//	void testGetLandDetails() {
//		LandBean customer = landDao.getLandDetails(5);
//	    assertNotNull(customer);
//	}
//
//	@Test
//	void testGetAllLandDetails() {
//		List<LandBean> beans = landDao.getAllLandDetails();
//		assertNotNull(beans);
//	}
//
//	@Test
//	void testDeleteLandDetails() {
//		LandBean contract = new LandBean();
//		contract.setLandId(1);
//		assertTrue(landDao.deleteLandDetails(contract.getLandId()));
//	}
//
//	

}
