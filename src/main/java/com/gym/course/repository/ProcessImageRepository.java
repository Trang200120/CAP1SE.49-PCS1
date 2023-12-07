package com.gym.course.repository;

import com.gym.course.model.ProcessImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessImageRepository extends JpaRepository<ProcessImage,Integer> {
}
