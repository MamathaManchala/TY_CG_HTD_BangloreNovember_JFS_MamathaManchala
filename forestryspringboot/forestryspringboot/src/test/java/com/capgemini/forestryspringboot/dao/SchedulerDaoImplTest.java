package com.capgemini.forestryspringboot.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.forestryspringboot.dto.SchedulerBean;

@SpringBootTest
class SchedulerDaoImplTest {
	
	@Autowired
	private SchedulerDao scheduleDao;

	

	@Test
	void testAddSchedule() {
		SchedulerBean bean = new SchedulerBean();
		bean.setScheduleId(7);
		bean.setContractId(8);
		bean.setProductId(67);
		bean.setDeliveryDate("8/9/2020");
		bean.setQuantity(90);
		assertTrue(scheduleDao.addSchedule(bean));
	}

	@Test
	void testGetSchedule() {
		SchedulerBean schedule = scheduleDao.getSchedule(5);
	    assertNotNull(schedule);
	}

	@Test
	void testGetAllSchedules() {
		List<SchedulerBean> beans = scheduleDao.getAllSchedules();
		assertNotNull(beans);
	}

	@Test
	void testDeleteSchedule() {
		SchedulerBean schedule = new SchedulerBean();
		schedule.setProductId(1);
		assertTrue(scheduleDao.deleteSchedule(schedule.getScheduleId()));
		
	}

	@Test
	void testModifySchedule() {
		SchedulerBean bean = new SchedulerBean();
		bean.setScheduleId(67);
		bean.setContractId(8);
		bean.setProductId(6);
		bean.setDeliveryDate("8/9/2020");
		bean.setQuantity(90);
		assertTrue(scheduleDao.modifySchedule(bean));
	}

}
