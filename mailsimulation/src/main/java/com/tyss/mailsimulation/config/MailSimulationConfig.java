package com.tyss.mailsimulation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class MailSimulationConfig {

	
	@Bean
	public LocalEntityManagerFactoryBean getBean() {
		LocalEntityManagerFactoryBean  bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("mail-unit");
		return bean;
	}
}
