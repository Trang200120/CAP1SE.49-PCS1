package com.gym.course.dto;

import com.gym.course.model.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

	private int customerId;

	private String email;

	private String nickname;

	private String password;

	private int state;

	private int role;

	private int sex;

	private String linkInstagram;

	private String linkFacebook;

	public CustomerResponse(Customer customer) {
		this.customerId = customer.getCustomerId();
		this.email = customer.getEmail();
		this.nickname = customer.getNickname();
		this.password = customer.getPassword();
		this.state = customer.getState();
		this.role = customer.getRole();
		this.sex = customer.getSex();
		this.linkFacebook = customer.getLinkFacebook();
		this.linkInstagram = customer.getLinkInstagram();
	}

}
