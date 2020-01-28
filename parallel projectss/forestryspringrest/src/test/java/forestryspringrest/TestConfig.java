package forestryspringrest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.forestryspringrest.dao.SchedulerDao;
import com.capgemini.forestryspringrest.dao.SchedulerDaoImpl;

@Configuration
public class TestConfig {
	
	@Bean
	public SchedulerDao getSchedulerDao() {
		return new SchedulerDaoImpl();
	}

}
