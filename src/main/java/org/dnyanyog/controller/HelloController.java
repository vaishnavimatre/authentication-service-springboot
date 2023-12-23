package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path="/hello")	
	public String getHellow() {
		return "Hello pune!!";
	}

	@GetMapping(path="/dte")
	public long getCurrentDateTime() {
		return System.currentTimeMillis();
	}
	

	@GetMapping(path="/svc-name")	
	public String getServiceName() 
	{
		return "user-management";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping(path="/admin/user")
	public String addUser(@RequestBody String addUserData) {
		return "Received:"+addUserData;
	}
}
