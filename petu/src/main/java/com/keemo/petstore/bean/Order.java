package com.keemo.petstore.bean;

// Generated 2015-8-21 0:39:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order generated by hbm2java
 */
public class Order implements java.io.Serializable {

	private Integer id;
	private Address address;
	private Cattery cattery;
	private Admin admin;
	private Date time;
	private Byte ispay;
	private Double price;
	private Byte status;
	private Set cats = new HashSet(0);

	public Order() {
	}

	public Order(Address address, Cattery cattery, Admin admin, Date time,
			Byte ispay, Double price, Byte status, Set cats) {
		this.address = address;
		this.cattery = cattery;
		this.admin = admin;
		this.time = time;
		this.ispay = ispay;
		this.price = price;
		this.status = status;
		this.cats = cats;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Cattery getCattery() {
		return this.cattery;
	}

	public void setCattery(Cattery cattery) {
		this.cattery = cattery;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Byte getIspay() {
		return this.ispay;
	}

	public void setIspay(Byte ispay) {
		this.ispay = ispay;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getCats() {
		return this.cats;
	}

	public void setCats(Set cats) {
		this.cats = cats;
	}

}
