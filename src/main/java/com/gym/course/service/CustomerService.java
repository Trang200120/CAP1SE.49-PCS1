package com.gym.course.service;

import com.gym.course.dto.CustomerResponse;
import com.gym.course.exception.CustomerNotFoundException;
import com.gym.course.model.Customer;
import com.gym.course.repository.CustomerRepository;
import com.gym.course.repository.LoginResponse;
import com.gym.course.type.request.LoginRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerResponse getCustomerById(int customerId) {
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("No customer found with id " + customerId));
		return new CustomerResponse(customer);
	}

	public CustomerResponse createCustomer(Customer customer) {
		Customer createdCustomer = customerRepository.save(customer);
		return new CustomerResponse(customer);
	}

	public List<CustomerResponse> getAllCustomer() {
		return customerRepository.findAll().stream().map((customer -> {
			return new CustomerResponse(customer);
		})).collect(Collectors.toList());
	}

	public void deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);
	}

	public CustomerResponse updateCustomer(int customerId, Customer updateCustomer) {
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("No customer with id " + customerId));
		customer.setNickname(updateCustomer.getNickname());
		customer.setLinkFacebook(updateCustomer.getLinkFacebook());
		customer.setLinkInstagram(updateCustomer.getLinkInstagram());
		customer.setSex(updateCustomer.getSex());
		return new CustomerResponse(customerRepository.save(customer));
	}

	public Customer registerCustomer(String email, String password) {
		Customer existingCustomer = customerRepository.findByEmail(email);
		if (existingCustomer != null) {
			return null;
		}
		Customer newCustomer = new Customer();
		newCustomer.setEmail(email);
		newCustomer.setPassword(password);
		return customerRepository.save(newCustomer);
	}

	public LoginResponse loginCustomer(LoginRequest request) {
		Customer customerEmail = customerRepository.findByEmail(request.getEmail());
		if (customerEmail != null) {
			Optional<Customer> customer = customerRepository.findOneByEmailAndPassword(request.getEmail(),
					request.getPassword());
			if (customer.isPresent()) {
				return new LoginResponse("Đăng nhập thành công", true);
			} else {
				return new LoginResponse("Đăng nhập thất bại", false);
			}
		} else {
			return new LoginResponse("Email không tồn tại", false);
		}
	}
}
