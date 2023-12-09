package com.gym.course.repository;

import com.gym.course.model.Course;
import com.gym.course.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

	List<Video> findByCourse(Course course);

}
