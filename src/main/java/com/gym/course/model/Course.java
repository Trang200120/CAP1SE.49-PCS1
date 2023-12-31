package com.gym.course.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table
public class Course {

	public Course() {
		this.videos = new ArrayList<>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;

	@Column
	private String description;

	@Column
	private String thumbnail;

	@Column
	private String name;

	@Column
	private Date createdDate;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Video> videos;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Subscription> subscriptions;

	@PrePersist
	protected void onCreate() {
		createdDate = new Date();
	}

}
