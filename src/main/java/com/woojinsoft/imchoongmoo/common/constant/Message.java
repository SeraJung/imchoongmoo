package com.woojinsoft.imchoongmoo.common.constant;

import lombok.Getter;

public enum Message {
	
	//common
	SYSTEM_ERROR("시스템 오류입니다"),
	NO_INPUT_DATA("입력 정보가 없습니다"),
	NOT_DEFIND_TYPE("정의되지 않은 데이터입니다");

	@Getter private String message;
	
	Message(String message) {
		this.message = message;
	}
}
