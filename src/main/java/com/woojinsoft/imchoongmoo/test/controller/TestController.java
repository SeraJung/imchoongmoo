package com.woojinsoft.imchoongmoo.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String test (Model model) {
		System.out.println("test");
		logger.debug("test enter");
		
		model.addAttribute("message", "hello");
		return "test";
	}
}
