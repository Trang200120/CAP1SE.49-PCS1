package com.gym.course.dto;

import com.gym.course.model.Course;
import com.gym.course.model.Video;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoResponse {

	private int videoId;

	private String name;

	private String link;

	private int views;

	private int likes;

	private Date createdDate;

	private int courseId;

	public VideoResponse(Video video) {
		this.videoId = video.getVideoId();
		this.name = video.getName();
		this.link = video.getLink();
		this.views = video.getViews();
		this.likes = video.getLikes();
		this.createdDate = video.getCreatedDate();
		this.courseId = video.getCourse().getCourseId();
	}

}
