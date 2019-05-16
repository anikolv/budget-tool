package com.team1.pbt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Payment {

	private Double amount;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date date;
	
	private String budgetCategory;
	
	private String comment;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBudgetCategory() {
		return budgetCategory;
	}

	public void setBudgetCategory(String budgetCategory) {
		this.budgetCategory = budgetCategory;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
