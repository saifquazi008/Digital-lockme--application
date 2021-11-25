package com.test.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	String email;
	String password;
	String cnfPassword;
	public User(String userName, String email, String password, String cnfPassword) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.cnfPassword = cnfPassword;
	}
	public User() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfPassword() {
		return cnfPassword;
	}
	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + ", cnfPassword="
				+ cnfPassword + "]";
	}

}
