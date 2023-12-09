package com.gym.course.controller;

import com.gym.course.dto.VideoResponse;
import com.gym.course.model.Video;
import com.gym.course.service.VideoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

	@Autowired
	private VideoService videoService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createVideo(@RequestBody Video video) {
		videoService.createVideo(video);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{videoId}")
	public ResponseEntity<VideoResponse> getVideoById(@PathVariable int videoId) {
		return ResponseEntity.ok(videoService.getVideoById(videoId));
	}

	@DeleteMapping("/{videoId}")
	public ResponseEntity<Void> deleteVideo(@PathVariable int videoId) {
		videoService.deleteVideoById(videoId);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{videoId}")
	public ResponseEntity<VideoResponse> updateVideo(@PathVariable int videoId, @RequestBody Video video) {
		return ResponseEntity.ok(videoService.updateVideo(videoId, video));
	}

}
