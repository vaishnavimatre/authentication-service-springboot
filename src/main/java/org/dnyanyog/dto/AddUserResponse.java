package org.dnyanyog.dto;

import org.dnyanyog.enumm.ResponseCode;
import org.springframework.stereotype.Component;

@Component
public class AddUserResponse {
	
	
private  String status;
private String message;
private  long user_id;
private String username;
private String password;
public void setMessage(String message) {
	this.message = message;
}
private String email;
private String age;
private UserData userData;

public AddUserResponse getInstance() {
	return new AddUserResponse();
}
public long getUser_id() {
	return user_id;
}
public AddUserResponse setUser_id(long user_id) {
	this.user_id = user_id;
	return this;
}
public String getUsername() {
	return username;
}
public AddUserResponse setUsername(String username) {
	this.username = username;
	return this;
}
public UserData getUserData() {
	return userData;
}
public AddUserResponse setUserData(UserData userData) {
	this.userData = userData;
	return this;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public AddUserResponse setPassword(String password) {
	this.password = password;
	return this;
}
public AddUserResponse setEmail(String email) {
	this.email = email;
	return this;
}
public String getAge() {
	return age;
}
public AddUserResponse setAge(String age) {
	this.age = age;
	return this;
}
	public String getStatus() {
		return status;
	}
	public AddUserResponse setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getMessage() {
		return message;
	}


	
}