package com.site.suinpj.dto;

import com.site.suinpj.entity.ChatMessage;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessageDto {
	private String message;
	private String sender;
}
