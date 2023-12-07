package com.gym.course.controller;

import com.gym.course.model.Video;
import com.gym.course.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping
    public ResponseEntity<Void> createVideo(@RequestBody Video video){
        videoService.createVideo(video);
        return ResponseEntity.ok().build();
    }
}
