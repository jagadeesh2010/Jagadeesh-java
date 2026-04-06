package com.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.test")
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
		DriverMangerDataSource
		
		@Autowired
        public PlayerDa02 {
			this.jdbcTemplate = new (JdbcSource);
			
	    String insert_sql = "insert into players (id,p_name,p_team,p_price)value")

         private update_sql = "update players set p_name = ?, p_name = ?. p_team = ? p_price = "
         
         private final String "select * from players";
         
         public boolean createPlayers(Playerson)
	    
		}
	}

}
