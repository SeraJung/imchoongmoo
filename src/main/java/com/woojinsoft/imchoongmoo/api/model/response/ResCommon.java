package com.woojinsoft.imchoongmoo.api.model.response;


import lombok.Data;

@Data
public class ResCommon {

	private String code;
	private String message;
	private String returnUrl;
	
	public ResCommon() {}
	public ResCommon(String code, String message) {
		setCode(code);
		setMessage(message);
	}
	public ResCommon(String message) {
		setMessage(message);
	}
}
