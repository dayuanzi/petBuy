package com.keemo.petstore.bean;

// Generated 2015-7-31 11:09:51 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address implements java.io.Serializable {

	private Integer id;
	private String province;
	private String city;
	private String district;
	private String content;
	private Integer userid;
	private String phone;
	private String name;
	private String street;
	private String zipCode;
	private Byte defaultMain;
	private Set orders = new HashSet(0);

	public Address() {
	}

	public Address(String province, String city, String district,
			String content, Integer userid, String phone, String name,
			String street, String zipCode, Byte defaultMain, Set orders) {
		this.province = province;
		this.city = city;
		this.district = district;
		this.content = content;
		this.userid = userid;
		this.phone = phone;
		this.name = name;
		this.street = street;
		this.zipCode = zipCode;
		this.defaultMain = defaultMain;
		this.orders = orders;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Byte getDefaultMain() {
		return this.defaultMain;
	}

	public void setDefaultMain(Byte defaultMain) {
		this.defaultMain = defaultMain;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}
