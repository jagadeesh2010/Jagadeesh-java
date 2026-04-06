package com.test.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:database.properties")
public class DBConfig {
  
	@Autowired
	private Environment environment;
	
	private final String DRIVER = "driver";
	
	private final String URL = "url";
	
	private final String USER = "dbuser";
	
	private final String PASSWORD = "dbpassword";
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(environment.getProperty(DRIVER));
		dataSource.setUrl(enviroment.getProperty(URL));
		dataSource.setUsername(enviroment.getProperty(USER));
		dataSource.setPassword(enviroment.getProperty(PASSWORD));
		
		return dataSource;
	}
	
	
}
