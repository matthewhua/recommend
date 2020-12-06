package com.matthew.common.common.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.common.jackson.ConfusionModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Matthew
 * @date 2020/10/26 23:35
 */
@Configuration
public class InitJacksonConfig
{

	@Bean
	public ObjectMapper objectMapper()
	{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper = ConfusionModule.registerModule(objectMapper);
		return objectMapper;
	}
}
