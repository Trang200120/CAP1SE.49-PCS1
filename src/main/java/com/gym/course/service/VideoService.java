package com.gym.course.service;

import com.gym.course.dto.VideoResponse;
import com.gym.course.exception.CourseNotFoundException;
import com.gym.course.exception.VideoNotFoundException;
import com.gym.course.model.Course;
import com.gym.course.model.Video;
import com.gym.course.repository.CourseRepository;
import com.gym.course.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

	@Autowired
	private VideoRepository videoRepository;

	@Autowired
	private CourseRepository courseRepository;

	public void createVideo(Video video) {
		Video createdVideo = videoRepository.save(video);
	}

	public List<Video> getVideoByCourseId(int courseId) {
		Course course = courseRepository.findById(courseId)
			.orElseThrow(() -> new CourseNotFoundException("No course with id " + courseId));
		List<Video> videos = videoRepository.findByCourse(course);
		return videos;
	}

	public VideoResponse getVideoById(int videoId) {
		Video video = videoRepository.findById(videoId)
			.orElseThrow(() -> new VideoNotFoundException("No video with id " + videoId));
		return new VideoResponse(video);
	}

	public void deleteVideoById(int videoId) {
		videoRepository.deleteById(videoId);
	}

	public VideoResponse updateVideo(int videoId, Video updateVideo) {
		Video video = videoRepository.findById(videoId)
			.orElseThrow(() -> new VideoNotFoundException("No video found with id " + videoId));
		video.setLink(updateVideo.getLink());
		video.setLikes(updateVideo.getViews());
		video.setName(updateVideo.getName());
		video.setLikes(updateVideo.getLikes());
		video.setCreatedDate(updateVideo.getCreatedDate());
		videoRepository.save(video);
		return new VideoResponse(video);
	}

}
