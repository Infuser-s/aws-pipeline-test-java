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
<<<<<<< HEAD
		log.debug("AwsPipelineControlleer.sayHello() - Name = "+ name);
		String response = "Hello - "+name+" !! - Last updated: 19 Feb 2021 (Friday), 9:35 pm IST";
=======
		log.debug("AwsPipelineControlleer.sayHello() - Name = "+name);
		String response = "Hello - "+name+" Have a nice day!! - Last updated: 17 Jan 2021 (Sunday), 12:06 pm";
>>>>>>> branch 'main' of https://github.com/Infuser-s/aws-pipeline-test.git
		
		return ResponseEntity.ok(response);
	}
}
