package com.gym.course.type.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class LoginRequest {

	@NotEmpty(message = "Tên không được để trống")
	@NotNull(message = "Mật khẩu không được null")
	private String email;
	
	@NotEmpty(message = "Tên không được để trống")
	@NotNull(message = "Mật khẩu không được null")
	private String password;
	
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

}
