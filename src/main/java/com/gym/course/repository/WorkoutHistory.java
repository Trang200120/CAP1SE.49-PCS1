package com.gym.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutHistory extends JpaRepository<WorkoutHistory,Integer> {
}
