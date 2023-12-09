package com.gym.course.repository;

import com.gym.course.model.Course;
import com.gym.course.model.Customer;
import com.gym.course.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	// Course findByCourse(Subscription subscription);

}
