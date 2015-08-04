package com.keemo.petstore.bean;

// Generated 2015-8-4 12:37:58 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Cart generated by hbm2java
 */
public class Cart implements java.io.Serializable {

	private Integer id;
	private Admin admin;
	private Cat cat;
	private Date time;

	public Cart() {
	}

	public Cart(Admin admin, Cat cat, Date time) {
		this.admin = admin;
		this.cat = cat;
		this.time = time;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Cat getCat() {
		return this.cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
