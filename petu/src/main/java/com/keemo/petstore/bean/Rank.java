package com.keemo.petstore.bean;

// Generated 2015-9-14 23:35:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Rank generated by hbm2java
 */
public class Rank implements java.io.Serializable {

	private Integer id;
	private String rank;
	private Set cats = new HashSet(0);

	public Rank() {
	}

	public Rank(String rank, Set cats) {
		this.rank = rank;
		this.cats = cats;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Set getCats() {
		return this.cats;
	}

	public void setCats(Set cats) {
		this.cats = cats;
	}

}
