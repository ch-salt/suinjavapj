package com.site.suinpj.entity;

import java.time.LocalDateTime;

import com.site.suinpj.dto.ChatMessageDto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Members {
	
	@Id
	@GeneratedValue
	@Column(name="number")
	private Long memNumber;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private String memberId;
}
