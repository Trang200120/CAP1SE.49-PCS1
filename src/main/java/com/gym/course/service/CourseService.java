package com.gym.course.service;

import com.gym.course.model.Course;
import com.gym.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Optional<Course> findCourseById(int courseId){
        Optional<Course> course = courseRepository.findById(courseId);
        return course;
    }
}
