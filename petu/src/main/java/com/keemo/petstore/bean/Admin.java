package com.keemo.petstore.bean;

// Generated 2015-6-30 13:34:08 by Hibernate Tools 3.4.0.CR1

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String privileges;

	public Admin() {
	}

	public Admin(String username, String password, String privileges) {
		this.username = username;
		this.password = password;
		this.privileges = privileges;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

}