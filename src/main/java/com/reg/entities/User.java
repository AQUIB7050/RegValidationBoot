package com.reg.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotBlank(message="User Name cannot be empty")
	@Size(min=3, max=12, message="User Name must be between 3-12 characters")
	private String userName;
	
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="invalid email!!")
	private String userEmail;
	
	@AssertTrue(message="Must Agree T & C")
	private boolean agreed;
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	

}
