package com.ekthasol.asurance.service.payment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PaymentService {

	private String uri = "http://localhost:8080/PaymentHandlerApp/processpayment/";

	public ResponseEntity<Boolean> processPayment(String inputJson, double amt) {

		RestTemplate restTemplate = new RestTemplate();
		this.uri = this.uri + amt;
		ResponseEntity<Boolean> result = restTemplate.postForEntity(uri, inputJson, Boolean.class);
		
		return result;

	}
}
