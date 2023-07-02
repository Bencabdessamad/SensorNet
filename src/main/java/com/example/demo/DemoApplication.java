package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@SpringBootApplication
public class DemoApplication {
	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		logger.warn("Application Starting......");
      		logger.debug("Application Starting......");
     		logger.error("Application Starting......");
      		logger.info("Application Starting......");
		SpringApplication.run(DemoApplication.class, args);
	}

}
