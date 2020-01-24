package com.woojinsoft.imchoongmoo.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	static Logger logger = LoggerFactory.getLogger(TestRestController.class);
	
	@RequestMapping("rest")
	public ResponseEntity<String> rest() {
		// 객체list 리턴 ResponseEntity<List<ResAuthStatus>>
		// 객체 리턴 ResponseEntity<ResAuthStatus>
		
		String retrunStr = "resttest";
		logger.debug("test {}", retrunStr);
		
		return new ResponseEntity<>(retrunStr, HttpStatus.OK);
		//throw new TestException(Message.SYSTEM_ERROR.getMessage());
	}
}
