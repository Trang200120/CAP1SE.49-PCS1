package com.gym.course.repository;

import com.gym.course.model.Customer;
import com.gym.course.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

	List<Subscription> findByCustomer(Customer customer);

}
