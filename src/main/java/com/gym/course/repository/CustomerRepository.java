package com.gym.course.repository;

import com.gym.course.model.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Customer findByEmail(String email);

	Optional<Customer> findOneByEmailAndPassword(String email, String password);

}
