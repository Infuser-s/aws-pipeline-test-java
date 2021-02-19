package com.example.awspipeline;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.awspipeline.hello.AwsPipelineControlleer;

@SpringBootApplication
public class AwsPipelineApplication {
	private static Logger log = LogManager.getLogger(AwsPipelineApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsPipelineApplication.class, args);
		log.debug("AwsPipelineApplication.main() - Hello, This is AWS Pipeline Test!!");
	}

}
