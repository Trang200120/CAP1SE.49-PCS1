package com.gym.course.controller;


import com.gym.course.model.Course;
import com.gym.course.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<?> createCourse(@RequestBody Course course){
        Course savedCourse = courseService.createCourse(course);
        return ResponseEntity.status(CREATED)
                .header("Location",String.format("/api/course/%d", savedCourse.getCourseId()))
                .build();
    }

//    @GetMapping("/{courseId}")
//    public ResponseEntity<Course> getCourseById(@RequestParam("courseId") int postId){
//
//    }

}
