package com.gym.course.controller;

import com.gym.course.model.Subscription;
import com.gym.course.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@PostMapping
	public ResponseEntity<Void> createSubscription(@RequestBody Subscription subscription) {
		subscriptionService.createSubscription(subscription);
		return ResponseEntity.ok().build();
	}

}
