//package com.example.service;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.example.model.UserRegistration;
//import com.example.repository.UserRegRepo;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//public class UserRegServiceTest {
//
//	@Mock
//	private UserRegRepo userRegRepo;
//	
//	@InjectMocks
//	private UserRegistrationImpl userRegService;
//	
//	@Before
//	public void setup(){
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void testGetAllToDo(){
//		List<UserRegistration> userRegList = new ArrayList<UserRegistration>();
//		userRegList.add(new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true));
//		userRegList.add(new UserRegistration(2,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true));
//		userRegList.add(new UserRegistration(3,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true));
//		when(userRegRepo.findAll()).thenReturn(userRegList);
//		
//		List<UserRegistration> result = userRegService.getAllUserReg();
//		assertEquals(3, result.size());
//	}
//	
//	@Test
//	public void testGetUserRegById(){
//		UserRegistration userReg = new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
//		when(userRegRepo.getOne(1L)).thenReturn(userReg);
//		UserRegistration result = userRegService.getUserRegById(1);
//		assertEquals(1, result.getId());
//		assertEquals("Ram", result.getfName());
//		assertEquals(true, result.isCompleted());
//	}
//	
//	@Test
//	public void saveUserReg(){
//		UserRegistration userReg = new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
//		when(userRegRepo.save(userReg)).thenReturn(userReg);
//		UserRegistration result = userRegService.saveUserReg(userReg);
//		assertEquals(1, result.getId());
//		assertEquals("Ram", result.getfName());
//		assertEquals(true, result.isCompleted());
//	}
//	
//	@Test
//	public void removeUserReg(){
//		UserRegistration userReg = new UserRegistration(1,"Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true);
//		userRegService.removeUserReg(userReg);
//        verify(userRegRepo, times(1)).delete(userReg);
//	}
//
//}
