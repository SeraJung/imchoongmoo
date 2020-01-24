package com.woojinsoft.imchoongmoo.config.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.woojinsoft.imchoongmoo.api.model.response.ResCommon;

@RestControllerAdvice(annotations=RestController.class)
public class ImchoongmooRestControllerAdvice {

	static Logger logger = LoggerFactory.getLogger(ImchoongmooRestControllerAdvice.class);
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResCommon> exception(RuntimeException e) {
		logger.debug("rest Exception [{}]", e.getMessage());
		
		return new ResponseEntity<ResCommon>(new ResCommon(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
