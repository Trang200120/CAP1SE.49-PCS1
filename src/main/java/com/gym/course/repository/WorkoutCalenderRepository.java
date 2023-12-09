package com.gym.course.repository;

import com.gym.course.model.WorkoutCalender;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutCalenderRepository extends JpaRepository<WorkoutCalender, Integer> {

}
