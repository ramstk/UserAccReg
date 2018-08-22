package com.example.util;

import com.example.model.UserRegistration;

public class PayloadValidator {
	public static boolean validateCreatePayload(UserRegistration userReg) {
		if (userReg.getId() > 0) {
			return false;
		}
		return true;
	}
	public static boolean validatePassCpass(UserRegistration userReg) {
		if (!userReg.getPassword().equals(userReg.getcPassword())) {
			return false;
		}
		return true;
	}

}
