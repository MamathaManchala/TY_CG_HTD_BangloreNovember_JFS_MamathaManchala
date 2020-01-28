package forestryspringrest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.capgemini.forestryspringrest.config.ORMConfig;
import com.capgemini.forestryspringrest.dao.SchedulerDao;
import com.capgemini.forestryspringrest.dto.SchedulerBean;

import junit.framework.TestCase;

@SpringJUnitConfig(classes= {TestConfig.class, ORMConfig.class})
public class TestSchedule {
	
	@Autowired
	private SchedulerDao scheduleDao;
	
	@Test
	public void testgetSchedule() {
		SchedulerBean sbean=scheduleDao.getSchedule(1);
		TestCase.assertNotNull(sbean);
	}
	

}
