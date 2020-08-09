package com.lyndon.learn.spring.app;

import com.lyndon.learn.spring.bean.BadApple;
import com.lyndon.learn.spring.config.FirstConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FirstConfig.class);
		BadApple badApple = context.getBean(BadApple.class);
		System.out.println(badApple);
		System.out.println(String.format("name: %s, taste: %s", badApple.getName(), badApple.getTaste()));

		context.close();
	}

}
