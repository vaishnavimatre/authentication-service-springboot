package org.dnyanyog.entity;

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
public class Discount {

	@GeneratedValue
	@Id
	@Column(name= "user_code",nullable= false,updatable =false ,insertable= false)
	private long user_code;
	private int age;
	private String gender;
	private double discountpercentage;
	public long getUser_code() {
		return user_code;
	}
	public void setUser_code(long user_code) {
		this.user_code = user_code;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(double discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	
	
}
