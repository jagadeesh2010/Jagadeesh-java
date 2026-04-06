package com.test.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.test.service.MyServiceProperties;
import com.testservice.MyService;

@AutoConfiguration
@EnableConfigurationProperties(MyServiceProperties.class)
public class MyServiceConfiguration {

	@Bean
	@ConditionalOnProperty(
			prefix = "my.serice",
			name = "enabled",
			havingValue = "true",
			matchIfMissing = true
			
			)
	
	public MyService myService()
	{
		return new MyService();
	}
	
}
