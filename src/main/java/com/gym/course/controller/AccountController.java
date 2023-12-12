package com.gym.course.controller;

import com.gym.course.dto.CustomerRequest;
import com.gym.course.dto.CustomerResponse;
import com.gym.course.model.Customer;
import com.gym.course.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody CustomerRequest request) {
		return ResponseEntity.ok(customerService.registerCustomer(request));
	}

	@PostMapping("/login")
	public ResponseEntity<CustomerResponse> loginCustomer(@RequestBody CustomerRequest request) {
		return ResponseEntity.ok(customerService.loginCustomer(request));
	}

}
