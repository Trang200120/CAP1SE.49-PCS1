package com.gym.course.exception;

import com.gym.course.repository.CustomerRepository;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(String message) {
		super(message);
	}

}
