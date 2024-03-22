package com.site.suinpj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class ChatRoom {
	
	@Id
	private Long roomId;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private String memberId;
}
