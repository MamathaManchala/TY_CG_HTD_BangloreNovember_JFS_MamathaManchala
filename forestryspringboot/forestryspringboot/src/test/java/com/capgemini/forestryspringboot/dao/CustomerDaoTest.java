package com.capgemini.forestryspringboot.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.forestryspringboot.dto.CustomerBean;
@SpringBootTest
class CustomerDaoTest {
	
	

	@Autowired
	private CustomerDao customerDao;

	@Test
	void testAddCustomer() {
	  
	  CustomerBean bean = new CustomerBean();
	  bean.setCustomerId(11);
		bean.setCustomerName("jyo");
		bean.setStreetAddress1("tpt");
		bean.setStreetAddress2("bnglr");
		bean.setTown("sdf");
		bean.setPostalCode(787879);
		bean.setEmail("jyo@gmail.com");
		bean.setTelephoneNo(987654987);
		assertTrue(customerDao.addCustomer(bean));
	}

	@Test
	void testModifyCustomer() {
		CustomerBean bean1 = new CustomerBean();
		bean1.setCustomerId(5);
		bean1.setCustomerName("kavitha");
		bean1.setStreetAddress1("tpt");
		bean1.setStreetAddress2("bnglr");
		bean1.setTown("sdf");
		bean1.setPostalCode(787879);
		bean1.setEmail("m@gmail.com");
		bean1.setTelephoneNo(987654987);
	    assertTrue(customerDao.modifyCustomer(bean1));
	}

	@Test
	void testDeleteCustomer() {
		CustomerBean customer = new CustomerBean();
		customer.setCustomerId(9);
	    assertTrue(customerDao.deleteCustomer(customer.getCustomerId()));
	}

	@Test
	void testGetCustomer() {
		CustomerBean customer = customerDao.getCustomer(5);
	    assertNotNull(customer);
	}


	@Test
	void testGetAllCustomer() {
		List<CustomerBean> beans = customerDao.getAllCustomer();
		assertNotNull(beans);
	}

}
