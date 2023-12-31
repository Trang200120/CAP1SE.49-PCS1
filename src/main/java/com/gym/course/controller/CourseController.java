package com.gym.course.controller;

import com.gym.course.dto.CourseResponse;
import com.gym.course.model.Course;
import com.gym.course.service.CourseService;
import com.gym.course.service.SubscriptionService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private SubscriptionService subscriptionService;

	@PostMapping
	public ResponseEntity<CourseResponse> createCourse(@RequestBody Course course) {
		return ResponseEntity.status(CREATED).body(courseService.createCourse(course));
	}

	@GetMapping("/{courseId}")
	public ResponseEntity<CourseResponse> getCourseById(@PathVariable int courseId) {
		return ResponseEntity.ok(courseService.findCourseById(courseId));
	}

	@GetMapping
	public ResponseEntity<List<CourseResponse>> getAllCourse() {
		return ResponseEntity.ok(courseService.getAllCourses());
	}

	@DeleteMapping("/{courseId}")
	public ResponseEntity<String> deleteCourseById(@PathVariable int courseId) {
		return ResponseEntity.ok("Course deleted successfully");
	}

	@GetMapping("/customer/{customerId}")
	public ResponseEntity<List<CourseResponse>> getCourseByCustomer(@PathVariable int customerId) {
		List<CourseResponse> courses = subscriptionService.getCoursesForCustomer(customerId);
		return ResponseEntity.ok(courses);
	}

	@PutMapping("/{courseId}")
	public ResponseEntity<CourseResponse> updateCourse(@PathVariable int courseId, @RequestBody Course course) {
		return ResponseEntity.ok(courseService.updateCourse(courseId, course));
	}

}
