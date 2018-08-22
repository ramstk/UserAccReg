package com.example.util;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.model.UserRegistration;


public class PayloadValidatorTest {
	@Test
	public void validatePayLoad() {
		UserRegistration userReg = new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
		assertEquals(false, PayloadValidator.validateCreatePayload(userReg));
	}
	
	@Test
	public void validateInvalidPayLoad() {
		UserRegistration userReg = new UserRegistration(0, "Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
		assertEquals(true, PayloadValidator.validateCreatePayload(userReg));
	}
	@Test
	public void validatePassCpass() {
		UserRegistration userReg = new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
		assertEquals(false, PayloadValidator.validateCreatePayload(userReg));
	}
	
	@Test
	public void validateInvalidPassCpass() {
		UserRegistration userReg = new UserRegistration(0, "Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Teat@123", true);
		assertEquals(true, PayloadValidator.validateCreatePayload(userReg));
	}
	

}
