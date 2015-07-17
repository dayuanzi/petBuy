package com.keemo.petstore.bean;

// Generated 2015-7-17 19:12:45 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String privileges;
	private Byte active;
	private String nickname;
	private Set follows = new HashSet(0);
	private Set carts = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set breedingplans = new HashSet(0);

	public Admin() {
	}

	public Admin(String username, String password, String privileges,
			Byte active, String nickname, Set follows, Set carts, Set orders,
			Set breedingplans) {
		this.username = username;
		this.password = password;
		this.privileges = privileges;
		this.active = active;
		this.nickname = nickname;
		this.follows = follows;
		this.carts = carts;
		this.orders = orders;
		this.breedingplans = breedingplans;
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

	public Byte getActive() {
		return this.active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Set getFollows() {
		return this.follows;
	}

	public void setFollows(Set follows) {
		this.follows = follows;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getBreedingplans() {
		return this.breedingplans;
	}

	public void setBreedingplans(Set breedingplans) {
		this.breedingplans = breedingplans;
	}

}
