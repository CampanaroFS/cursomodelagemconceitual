package com.felipecampanaro.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipecampanaro.cursomc.services.DBService;
import com.felipecampanaro.cursomc.services.EmailService;
import com.felipecampanaro.cursomc.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String Strategy;
	
	@Bean
	public boolean instantiateDataBase() throws ParseException {
		
		if(!"create".equals(Strategy)) {
			return false;
		}
		
		dbService.instantiateDataBase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}

}
