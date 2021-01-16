package com.example.awspipeline.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("awstest")
@CrossOrigin(origins = "*")
public class AwsPipelineControlleer {
	private Logger log = LogManager.getLogger(AwsPipelineControlleer.class);

	@GetMapping("/hello/{name}")
	public ResponseEntity<Object> sayHello(@PathVariable String name) {
		log.debug("AwsPipelineControlleer.sayHello() - Name = "+name);
		String response = "Hello - "+name+" !!";
		
		return ResponseEntity.ok(response);
	}
}
