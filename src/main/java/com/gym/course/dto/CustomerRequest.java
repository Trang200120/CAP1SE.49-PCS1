package com.gym.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("email")
	@NotEmpty(message = "email must not by empty")
	private String email;

	@JsonProperty("password")
	@NotEmpty(message = "password must not be empty")
	private String password;

}
