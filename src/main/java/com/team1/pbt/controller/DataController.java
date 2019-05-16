package com.team1.pbt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team1.pbt.model.Payment;

@Controller
@RequestMapping(value="/data")
public class DataController {
	
	private List<Payment> payments = new ArrayList<>();
	
	@GetMapping(value="/budget/categories")
	public String budgetCategories() {
		return "budget-categories";
	}
	
	@GetMapping(value="/payments/add")
	public String addPayments(Model model) {
		model.addAttribute("payment", new Payment());
		return "add-payment";
	}
	
	@PostMapping(value="/payments/add")
	public ModelAndView addPayment(@ModelAttribute Payment payment) {
		payments.add(payment);
		return new ModelAndView("redirect:/data/payments/show");
	}
	
	@GetMapping(value="/payments/show")
	public String showPayments(Model model) {
		model.addAttribute("payments", payments);
		return "show-payments";
	}
}
