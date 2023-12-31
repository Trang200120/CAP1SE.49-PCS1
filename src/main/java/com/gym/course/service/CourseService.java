package com.gym.course.service;

import com.gym.course.dto.CourseResponse;
import com.gym.course.exception.CourseNotFoundException;
import com.gym.course.exception.CustomerNotFoundException;
import com.gym.course.exception.SubscriptionNotFoundException;
import com.gym.course.model.Course;
import com.gym.course.model.Customer;
import com.gym.course.model.Subscription;
import com.gym.course.repository.CourseRepository;
import com.gym.course.repository.CustomerRepository;
import com.gym.course.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	public CourseResponse createCourse(Course course) {
		Course createdCourse = courseRepository.save(course);
		return new CourseResponse(createdCourse);
	}

	public CourseResponse findCourseById(int courseId) {
		Course course = courseRepository.findById(courseId)
			.orElseThrow(() -> new CourseNotFoundException("No course found with id " + courseId));
		return new CourseResponse(course);
	}

	public List<CourseResponse> getAllCourses() {
		return courseRepository.findAll().stream().map((course) -> {
			return new CourseResponse(course);
		}).collect(Collectors.toList());
	}

	public void deleteCourseById(int courseId) {
		courseRepository.deleteById(courseId);
	}

	public CourseResponse updateCourse(int courseId, Course updateCourse) {
		Course course = courseRepository.findById(courseId)
			.orElseThrow(() -> new CourseNotFoundException("No course found with id " + courseId));
		course.setName(updateCourse.getName());
		course.setDescription(updateCourse.getDescription());
		course.setCreatedDate(updateCourse.getCreatedDate());
		return new CourseResponse(courseRepository.save(course));
	}

}
