package com.pallas.second;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.pallas.second", "com.pallas.util" })
@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SecondApplication.class, args);

		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);

		for (String bean : beans) {
			System.out.println(bean);
		}
	}

}
