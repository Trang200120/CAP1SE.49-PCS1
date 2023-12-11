package com.gym.course.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	@Column
	@Email
	private String email;

	@Column
	private String nickname;

	@Column
	private String password;

	@Column
	private int state;

	@Column
	private int role;

	@Column
	private int sex;

	@Column
	private String linkInstagram;

	@Column
	private String linkFacebook;

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private Profile profile;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<ProcessImage> processImages;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<WorkoutHistory> workoutHistories;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<WorkoutCalender> workoutCalenders;

	@OneToMany(mappedBy = "send", cascade = CascadeType.ALL)
	private List<Message> sendMessages;

	@OneToMany(mappedBy = "received", cascade = CascadeType.ALL)
	private List<Message> receivedMessages;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Subscription> subscriptions;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getLinkInstagram() {
		return linkInstagram;
	}

	public void setLinkInstagram(String linkInstagram) {
		this.linkInstagram = linkInstagram;
	}

	public String getLinkFacebook() {
		return linkFacebook;
	}

	public void setLinkFacebook(String linkFacebook) {
		this.linkFacebook = linkFacebook;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<ProcessImage> getProcessImages() {
		return processImages;
	}

	public void setProcessImages(List<ProcessImage> processImages) {
		this.processImages = processImages;
	}

	public List<WorkoutHistory> getWorkoutHistories() {
		return workoutHistories;
	}

	public void setWorkoutHistories(List<WorkoutHistory> workoutHistories) {
		this.workoutHistories = workoutHistories;
	}

	public List<WorkoutCalender> getWorkoutCalenders() {
		return workoutCalenders;
	}

	public void setWorkoutCalenders(List<WorkoutCalender> workoutCalenders) {
		this.workoutCalenders = workoutCalenders;
	}

	public List<Message> getSendMessages() {
		return sendMessages;
	}

	public void setSendMessages(List<Message> sendMessages) {
		this.sendMessages = sendMessages;
	}

	public List<Message> getReceivedMessages() {
		return receivedMessages;
	}

	public void setReceivedMessages(List<Message> receivedMessages) {
		this.receivedMessages = receivedMessages;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
