package com.site.suinpj.model;

import java.time.LocalDateTime; // 가입일과 로그인일을 위해

// Spring boot 3부터 Jakarta EE9가 포함되면서 javax 관련 패키지명이 변경되었음
// javax -> jakarta
import jakarta.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
public class Member {
	@Id @GeneratedValue
	private int number;			// primary key
	
	@Column(length=30, nullable=false, updatable=false, unique=true)
	private String mem_id;		// 유저 아이디
	
	@Column(length=100, nullable=false)
	private String mem_pw;		// 비밀번호
	
	@Column(length=30, nullable=false)
	private String mem_name;	// 유저 이름
	
	@Column(length=30, nullable=false, unique=true)
	private String mem_nickname;// 유저 닉네임

	@Column(unique=true)
	private String mem_email;	// 유저 이메일
	
	@Column(name="reg_date")
	private LocalDateTime reg_date;	// 가입일
	
	@Column(name="login_date")
	private String login_date; 	// 로그인일
	
	
	@Builder
	public Member(int number,String mem_id,String mem_pw,
			String mem_name,String mem_nickname,String mem_email
	) {
		this.number = number;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_nickname = mem_nickname;
		this.mem_email = mem_email;
	}
}
