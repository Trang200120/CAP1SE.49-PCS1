package com.gym.course.controller;

import com.gym.course.dto.CustomerResponse;
import com.gym.course.model.Customer;
import com.gym.course.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<CustomerResponse> createCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.createCustomer(customer));
	}

	@GetMapping(value = "/{customerId}")
	public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable int customerId) {
		return ResponseEntity.ok(customerService.getCustomerById(customerId));
	}

	@GetMapping
	public ResponseEntity<List<CustomerResponse>> getAllCustomer() {
		return ResponseEntity.ok(customerService.getAllCustomer());
	}

	@DeleteMapping("/{customerId}")
	public ResponseEntity<Void> deleteCustomerById(@PathVariable int customerId) {
		customerService.deleteCustomerById(customerId);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{customerId}")
	public ResponseEntity<CustomerResponse> updateCustomer(@PathVariable int customerId,
			@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.updateCustomer(customerId, customer));
	}

}
