package com.keemo.petstore.bean;

// Generated 2015-8-6 10:57:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Cattery generated by hbm2java
 */
public class Cattery implements java.io.Serializable {

	private Integer id;
	private Region region;
	private Cattpetrank cattpetrank;
	private String name;
	private String mainvariety;
	private Integer experience;
	private Byte pass;
	private String address;
	private String phone;
	private String leadername;
	private Set parentcats = new HashSet(0);
	private Set follows = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set cats = new HashSet(0);
	private Set breedingplans = new HashSet(0);

	public Cattery() {
	}

	public Cattery(Region region, Cattpetrank cattpetrank, String name,
			String mainvariety, Integer experience, Byte pass, String address,
			String phone, String leadername, Set parentcats, Set follows,
			Set orders, Set cats, Set breedingplans) {
		this.region = region;
		this.cattpetrank = cattpetrank;
		this.name = name;
		this.mainvariety = mainvariety;
		this.experience = experience;
		this.pass = pass;
		this.address = address;
		this.phone = phone;
		this.leadername = leadername;
		this.parentcats = parentcats;
		this.follows = follows;
		this.orders = orders;
		this.cats = cats;
		this.breedingplans = breedingplans;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Cattpetrank getCattpetrank() {
		return this.cattpetrank;
	}

	public void setCattpetrank(Cattpetrank cattpetrank) {
		this.cattpetrank = cattpetrank;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainvariety() {
		return this.mainvariety;
	}

	public void setMainvariety(String mainvariety) {
		this.mainvariety = mainvariety;
	}

	public Integer getExperience() {
		return this.experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Byte getPass() {
		return this.pass;
	}

	public void setPass(Byte pass) {
		this.pass = pass;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLeadername() {
		return this.leadername;
	}

	public void setLeadername(String leadername) {
		this.leadername = leadername;
	}

	public Set getParentcats() {
		return this.parentcats;
	}

	public void setParentcats(Set parentcats) {
		this.parentcats = parentcats;
	}

	public Set getFollows() {
		return this.follows;
	}

	public void setFollows(Set follows) {
		this.follows = follows;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getCats() {
		return this.cats;
	}

	public void setCats(Set cats) {
		this.cats = cats;
	}

	public Set getBreedingplans() {
		return this.breedingplans;
	}

	public void setBreedingplans(Set breedingplans) {
		this.breedingplans = breedingplans;
	}

}
