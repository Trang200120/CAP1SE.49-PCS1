package com.gym.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.course.model.Customer;
import com.gym.course.repository.LoginResponse;
import com.gym.course.service.CustomerService;
import com.gym.course.type.request.CustomerRequest;
import com.gym.course.type.request.LoginRequest;

@RestController
@CrossOrigin
@RequestMapping("api/account")
public class AccountController {
	private CustomerService customerService;

	@PostMapping("/register")
	public String registerCustomer(@RequestBody CustomerRequest request) {
		String email = request.getEmail();
		String password = request.getPassword();

		Customer newCustomer = customerService.registerCustomer(email, password);
		if (newCustomer != null) {
			return "Đăng kí thành công";
		} else {
			return "Email đăng kí đã tồn tại";
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginCustomer(@RequestBody LoginRequest request) {
		LoginResponse loginResponse = customerService.loginCustomer(request);
		return ResponseEntity.ok(loginResponse);
	}
}
