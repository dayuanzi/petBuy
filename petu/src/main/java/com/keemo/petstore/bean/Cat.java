package com.keemo.petstore.bean;

// Generated 2015-8-6 10:57:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cat generated by hbm2java
 */
public class Cat implements java.io.Serializable {

	private Integer id;
	private Cattery cattery;
	private Order order;
	private Catype catype;
	private Rank rank;
	private PedigreeCertificate pedigreeCertificate;
	private String name;
	private Byte immune;
	private Date birthday;
	private Double price;
	private Double oldprice;
	private Byte stalen;
	private Byte sex;
	private Set carts = new HashSet(0);

	public Cat() {
	}

	public Cat(Cattery cattery, Order order, Catype catype, Rank rank,
			PedigreeCertificate pedigreeCertificate, String name, Byte immune,
			Date birthday, Double price, Double oldprice, Byte stalen,
			Byte sex, Set carts) {
		this.cattery = cattery;
		this.order = order;
		this.catype = catype;
		this.rank = rank;
		this.pedigreeCertificate = pedigreeCertificate;
		this.name = name;
		this.immune = immune;
		this.birthday = birthday;
		this.price = price;
		this.oldprice = oldprice;
		this.stalen = stalen;
		this.sex = sex;
		this.carts = carts;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cattery getCattery() {
		return this.cattery;
	}

	public void setCattery(Cattery cattery) {
		this.cattery = cattery;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Catype getCatype() {
		return this.catype;
	}

	public void setCatype(Catype catype) {
		this.catype = catype;
	}

	public Rank getRank() {
		return this.rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public PedigreeCertificate getPedigreeCertificate() {
		return this.pedigreeCertificate;
	}

	public void setPedigreeCertificate(PedigreeCertificate pedigreeCertificate) {
		this.pedigreeCertificate = pedigreeCertificate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getImmune() {
		return this.immune;
	}

	public void setImmune(Byte immune) {
		this.immune = immune;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getOldprice() {
		return this.oldprice;
	}

	public void setOldprice(Double oldprice) {
		this.oldprice = oldprice;
	}

	public Byte getStalen() {
		return this.stalen;
	}

	public void setStalen(Byte stalen) {
		this.stalen = stalen;
	}

	public Byte getSex() {
		return this.sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}
