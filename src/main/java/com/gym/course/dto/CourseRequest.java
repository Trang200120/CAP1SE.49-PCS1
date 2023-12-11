package com.gym.course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseRequest {
    private int courseId;

    private String description;

    private String name;

    private Date createdDate;
}
