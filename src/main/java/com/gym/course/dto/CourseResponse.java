package com.gym.course.dto;

import com.gym.course.model.Course;
import com.gym.course.model.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {

	private int courseId;

	private String description;

	private String name;

	private Date createdDate;

	private List<Integer> videoIds; // List of video IDs

	public CourseResponse(Course course) {
		this.courseId = course.getCourseId();
		this.description = course.getDescription();
		this.name = course.getName();
		this.createdDate = course.getCreatedDate();
		this.videoIds = course.getVideos().stream().map(Video::getVideoId).collect(Collectors.toList());
	}

}