package com.gym.course.repository;

import com.gym.course.model.WorkoutHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutHistoryRepository extends JpaRepository<WorkoutHistory, Integer> {

}
