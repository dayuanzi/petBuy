package com.keemo.petstore.bean;

// Generated 2015-7-10 14:31:16 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Order generated by hbm2java
 */
public class Order implements java.io.Serializable {

	private Integer id;
	private Admin admin;
	private Cat cat;
	private Date time;
	private Integer count;
	private Byte ispay;

	public Order() {
	}

	public Order(Admin admin, Cat cat, Date time, Integer count, Byte ispay) {
		this.admin = admin;
		this.cat = cat;
		this.time = time;
		this.count = count;
		this.ispay = ispay;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Byte getIspay() {
		return this.ispay;
	}

	public void setIspay(Byte ispay) {
		this.ispay = ispay;
	}

}
