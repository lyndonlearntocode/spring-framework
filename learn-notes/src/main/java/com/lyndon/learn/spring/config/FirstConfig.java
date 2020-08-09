package com.lyndon.learn.spring.config;

import com.lyndon.learn.spring.bean.BadApple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfig {

	@Bean
	public BadApple badApple() {
		return new BadApple("bad", "really bad");
	}
}
