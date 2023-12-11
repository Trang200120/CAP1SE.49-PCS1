package com.gym.course.type.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CustomerRequest {

	@NotEmpty(message = "Họ không được để trống")
	@JsonProperty("ho")
	private String ho;

	@NotEmpty(message = "Tên không được để trống")
	@JsonProperty("ten")
	private String ten;

	@NotEmpty(message = "Email không được để trống")
	@JsonProperty("email")
	private String email;

	@NotEmpty(message = "Mật khẩu không được để trống")
	@NotNull(message = "Mật khẩu không được null")
	@JsonProperty("password")
	private String password;

	@NotNull(message = "Nhập lại mật khẩu không được null")
	@NotEmpty(message = "Nhập lại mật khẩu không được để trống")
	@JsonProperty("password_again")
	private String passwordAgain;

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

}
