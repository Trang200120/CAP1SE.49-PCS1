package com.gym.course.service;

import com.gym.course.model.Video;
import com.gym.course.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public void createVideo(Video video){
        videoRepository.save(video);
    }
}
