package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;

import org.dnyanyog.dto.AddUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@PostMapping(path="/api/auth/add-user")
	public AddUserResponse validate(@RequestBody AddUserRequest adduserRequest)
	{
		AddUserResponse response = new AddUserResponse() ;
		
		adduserRequest.getAction().equals("AddUser");
		adduserRequest.getUser_id().equals(123);
		
		adduserRequest.getUser_name().equals("John Doe");
		adduserRequest.getUser_email().equals("john.doe@example.com");
		adduserRequest.getUser_age().equals(28);
	  
		
		response.setStatus("User added Successfully");
		response.setMessage("Success");
		response.setUser_id("123");
		response.setUser_name("John Doe");
		response.setUser_email("john.doe@example.com");
		response.setUser_age("28");
		
		return response;
		
		
	}

}
