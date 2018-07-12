package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.UserRegistration;

@Service
public interface UserRegService {
	public List<UserRegistration> getAllUserReg();

	public UserRegistration getUserRegById(long id);

	public UserRegistration saveUserReg(UserRegistration userReg);

	public void removeUserReg(UserRegistration userReg);

}
