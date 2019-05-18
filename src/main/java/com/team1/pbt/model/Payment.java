package com.team1.pbt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Payment {

	private Double amount;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date date;
	
	private String budgetCategory;
	
	private String comment;
}
