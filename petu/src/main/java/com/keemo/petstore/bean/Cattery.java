package com.keemo.petstore.bean;

// Generated 2015-7-13 13:41:38 by Hibernate Tools 3.4.0.CR1

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
	private Set follows = new HashSet(0);
	private Set cats = new HashSet(0);

	public Cattery() {
	}

	public Cattery(Region region, Cattpetrank cattpetrank, String name,
			String mainvariety, Integer experience, Set follows, Set cats) {
		this.region = region;
		this.cattpetrank = cattpetrank;
		this.name = name;
		this.mainvariety = mainvariety;
		this.experience = experience;
		this.follows = follows;
		this.cats = cats;
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

	public Set getFollows() {
		return this.follows;
	}

	public void setFollows(Set follows) {
		this.follows = follows;
	}

	public Set getCats() {
		return this.cats;
	}

	public void setCats(Set cats) {
		this.cats = cats;
	}

}
