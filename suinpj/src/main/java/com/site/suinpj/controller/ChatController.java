package com.site.suinpj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.suinpj.response.ChatResponseService;
import com.site.suinpj.service.ChatService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ChatController {
	private ChatService chatService;
	private ChatResponseService chatResponseService;
	
	// 채팅방 생성

	// 채팅 리스트 보여주기
	
}
