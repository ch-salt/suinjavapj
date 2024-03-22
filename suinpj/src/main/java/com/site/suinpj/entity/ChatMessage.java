package com.site.suinpj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

import com.site.suinpj.dto.ChatMessageDto;

@Entity
@Getter
public class ChatMessage {
	@Id
	@GeneratedValue
	@Column(name="msg_number")
	private String msgNumber;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Members sender;
	
	private String message;
	
	private LocalDateTime sendDate;
	
	@ManyToOne
	@JoinColumn(name="chat_room_id")
	private ChatRoom chatRoom;
	
	@Builder
	public ChatMessage(ChatMessageDto chatMessageDto, ChatRoom chatRoom, Members members) {
		this.sender = members;
		this.sendDate = LocalDateTime.now();
		this.chatRoom = chatRoom;
	}
}
