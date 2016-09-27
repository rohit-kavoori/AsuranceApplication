package com.ekthasol.asurance.controllers.payment;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ekthasol.asurance.models.CreditCard;
import com.ekthasol.asurance.service.payment.PaymentService;

@Controller
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value = "/handlePayment",method = RequestMethod.POST)
		public String handlePayment(@ModelAttribute("customer") CreditCard creditCard, HttpSession session, HttpServletResponse  response) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			paymentService.processPayment("",3.5);
			return "";
	}
 }
			
		
