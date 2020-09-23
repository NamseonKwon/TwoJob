package com.blocker.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "investmentboard")
public class InvestmentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 매핑 db에서 자동증분으로 설정
	int num;
	
	@Column
	String identity;// 개인인지 사업자인지
	
	@Column
	String compname;// 회사명
	
	@Column
	String introduce;// 금손소개
	
	@Column
	String url;// 참고할 url
	
	@Column
	String pjtname;// 플젝명
	
	@Column
	String onelineintro;// 한줄소개
	
	@Column
	String deadline;// 마감날짜
	
	@Column
	int goalprice;// 달성금액
	
	@Column
	int expectedsaleprice;// 판매 예정금액
	
	@Column
	String pictual;// 대표사진이름
}