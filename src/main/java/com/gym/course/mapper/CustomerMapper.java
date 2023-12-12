package com.gym.course.mapper;

import com.gym.course.dto.CustomerRequest;
import com.gym.course.model.Customer;
import com.gym.course.repository.CustomerRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface CustomerMapper {



	@Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
	@Mapping(target = "state", defaultValue = "0")
	@Mapping(target = "sex", defaultValue = "0")
	@Mapping(target = "role", defaultValue = "0")
	@Mapping(target = "link_instagram", defaultValue = "")
	@Mapping(target = "link_facebook", defaultValue = "")
	public abstract Customer map(CustomerRequest customerRequest);

}
