package com.site.suinpj.model;

import java.time.LocalDateTime; // 가입일과 로그인일을 위해

// Spring boot 3부터 Jakarta EE9가 포함되면서 javax 관련 패키지명이 변경되었음
// javax -> jakarta
import jakarta.persistence.*;

import lombok.AccessLevel;
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
	private int id;				// primary key
	private String mem_id;		// 유저 아이디
	private String mem_pw;		// 비밀번호
	private String mem_name;	// 유저 이름
	private String mem_nickname;// 유저 닉네임
	private String mem_email;	// 유저 이메일
	private String reg_date;	// 가입일
	private String login_date; 	// 로그인일
}
