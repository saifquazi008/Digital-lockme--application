package com.credential.lockme;

import java.io.Serializable;

public class Creds implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id;
	public String UserName;
	public String siteName;
	public String password;

	public Creds(String id, String userName, String siteName, String password) {
		super();
		this.id = id;
		UserName = userName;
		this.siteName = siteName;
		this.password = password;
	}

	public Creds() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Creds [id=" + id + ", UserName=" + UserName + ", siteName=" + siteName + ", password=" + password + "]";
	}

}
