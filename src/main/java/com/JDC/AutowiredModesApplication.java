package com.JDC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.JDC.Service.Report_Service;

@SpringBootApplication
public class AutowiredModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiredModesApplication.class, args);
		
		Report_Service bean = context.getBean(Report_Service.class);
		bean.Generate_Report();
	}

}
