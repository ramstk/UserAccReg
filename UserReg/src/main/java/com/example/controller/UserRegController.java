/**
 * 
 */
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.UserRegException;
import com.example.model.Response;
import com.example.model.UserRegistration;
import com.example.service.UserRegService;
import com.example.util.PayloadValidator;

/**
 * @author RAM
 *
 */
@CrossOrigin(origins = "*")
@RestController
public class UserRegController {
	
	@Autowired
	private UserRegService userRegService;
	
	@Autowired
	
	public void userRegService(UserRegService userRegService){
	    this.userRegService=userRegService;
	}
	
	@RequestMapping(value="/userReg", method=RequestMethod.GET)
	public ResponseEntity<List<UserRegistration>> getAllUserReg(){
    	
		return new ResponseEntity<List<UserRegistration>>(userRegService.getAllUserReg(), HttpStatus.OK);
	}
	
    @RequestMapping(value = "/userReg/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserRegistration> getUserRegById(@PathVariable("id") long id) throws UserRegException{
    	
    	UserRegistration userReg = userRegService.getUserRegById(id);
    	if (userReg == null || userReg.getId() <= 0){
            throw new UserRegException("UserID doesn´t exist");
    	}
		return new ResponseEntity<UserRegistration>(userRegService.getUserRegById(id), HttpStatus.OK);
	}

    @RequestMapping(value = "/userReg/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Response> removeUserReg(@PathVariable("id") long id) throws UserRegException{
    	
    	UserRegistration userReg = userRegService.getUserRegById(id);
    	if (userReg == null || userReg.getId() <= 0){
            throw new UserRegException("UserID to delete doesn´t exist");
    	}
    	userRegService.removeUserReg(userReg);
		return new ResponseEntity<Response>(new Response(HttpStatus.OK.value(), "User has been deleted"), HttpStatus.OK);
	}
    
    @RequestMapping(value = "/userReg", method = RequestMethod.POST)
   	public ResponseEntity<UserRegistration> saveUserReg(@RequestBody UserRegistration payload) throws UserRegException{
    	
    	if (!PayloadValidator.validateCreatePayload(payload)){
            throw new UserRegException("User data malformed, id must not be defined");
    	}
    	else if (!PayloadValidator.validatePassCpass(payload)) {
    		throw new UserRegException("Password and Confirm Password dont match");
    	}
		return new ResponseEntity<UserRegistration>(userRegService.saveUserReg(payload), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/userReg", method = RequestMethod.PATCH)
   	public ResponseEntity<UserRegistration>  updateUserReg(@RequestBody UserRegistration payload) throws UserRegException{
    	
    	UserRegistration userReg = userRegService.getUserRegById(payload.getId());
    	if (userReg == null || userReg.getId() <= 0){
            throw new UserRegException("UserID to update doesn´t exist");
    	}
    	
		return new ResponseEntity<UserRegistration>(userRegService.saveUserReg(payload), HttpStatus.OK);
   	}

}
