package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserRegistration;
import com.example.repository.UserRegRepo;

@Service
public class UserRegistrationImpl implements UserRegService{


	@Autowired
	private UserRegRepo userRegRepo;
	@Autowired
    public UserRegistrationImpl(UserRegRepo userRegRepo) { 
      this.userRegRepo = userRegRepo;
    }
	@Override
	public List<UserRegistration> getAllUserReg() {
		return userRegRepo.findAll();
	}

	@Override
	public UserRegistration getUserRegById(long id) {
		return userRegRepo.getOne(id);
	}

	@Override
	public UserRegistration saveUserReg(UserRegistration userReg) {
		return userRegRepo.save(userReg);
	}

	@Override
	public void removeUserReg(UserRegistration userReg){
		userRegRepo.delete(userReg);
	}
}
