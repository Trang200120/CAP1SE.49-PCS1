package com.gym.course.service;

import com.gym.course.dto.CourseResponse;
import com.gym.course.exception.CustomerNotFoundException;
import com.gym.course.model.Course;
import com.gym.course.model.Customer;
import com.gym.course.model.Subscription;
import com.gym.course.model.Video;
import com.gym.course.repository.CustomerRepository;
import com.gym.course.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	public void createSubscription(Subscription subscription) {
		subscriptionRepository.save(subscription);
	}

	public List<CourseResponse> getCoursesForCustomer(int customerId) {
		Customer customer = customerRepository.findById(customerId)
			.orElseThrow(() -> new CustomerNotFoundException("No customer with id " + customerId));
		List<Subscription> subscriptions = subscriptionRepository.findByCustomer(customer);
		return subscriptions.stream().map(subscription -> {
			Course course = subscription.getCourse();
			return new CourseResponse(course);
		}).collect(Collectors.toList());
	}

}
