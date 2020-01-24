package com.woojinsoft.imchoongmoo.exception;

public class TestException extends RuntimeException{

	private static final long serialVersionUID = -8784776341873488919L;

	public TestException(String message) {
		super(message);
    }
    
    public TestException(String message, Throwable cause) {
    	super(message, cause);
    }
}
