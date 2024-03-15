package com.site.suinpj.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatResponse<T> {
	private Boolean isSuccess;
	private int resCode;
	private String message;
	private T data;
	
	@Builder
	public ChatResponse(boolean isSuccess, int resCode, String message, T data) {
		this.isSuccess = isSuccess;
		this.resCode = resCode;
		this.message = message;
		this.data = data;
	}
}
