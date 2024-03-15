package com.spring.security.thymeleaf.service;

import com.spring.security.thymeleaf.model.User;
import com.spring.security.thymeleaf.web.dto.UserRegistrationDto;


public interface UserService {
	User save(UserRegistrationDto registrationDto);
	

}
