package org.dnyanyog.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Users { 

	@GeneratedValue
	@Id
	@Column
	private long user_code;
	
	@Column
	private long user_id;
	

	@Column
	private long userIds;
	
	
	public long getUserIds() {
		return userIds;
	}

	public void setUserIds(long userIds) {
		this.userIds = userIds;
	}
	@Column
	private String username;
	
	
	@Column
	private String password;
	@Column
	private String email;
	
	@Column
	private String age;
	

	public static Users getInstance() {
		return new Users();
	}
	
	public long getUser_code() {
		return user_code;
	
	}
	public Users setUser_code(long user_code) {
		this.user_code = user_code;
		return this;
	}
	public long getUser_id() {
		return user_id;
	}
	public Users setUser_id(long user_id) {
		this.user_id = user_id;
		return this;
	}
	public String getUsername() {
		return username;
	}
	public Users setUsername(String username) {
		this.username = username;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public Users setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Users setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getAge() {
		return age;
	}
	public Users setAge(String age) {
		this.age = age;
		return this;
	}
	
	@Column
	private String gender;
	
	@Column
	private double discountPercentage;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	
	
	
	
}


	 
	
	
	

