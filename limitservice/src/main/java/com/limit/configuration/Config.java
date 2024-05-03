package com.limit.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("limit-service")
@Data
public class Config {
	
	private int minimum;
	private int maximum;
}
