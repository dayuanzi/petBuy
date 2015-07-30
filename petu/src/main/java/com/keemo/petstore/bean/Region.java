package com.keemo.petstore.bean;

// Generated 2015-7-30 14:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Region generated by hbm2java
 */
public class Region implements java.io.Serializable {

	private Integer id;
	private String region;
	private Set catteries = new HashSet(0);

	public Region() {
	}

	public Region(String region, Set catteries) {
		this.region = region;
		this.catteries = catteries;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set getCatteries() {
		return this.catteries;
	}

	public void setCatteries(Set catteries) {
		this.catteries = catteries;
	}

}
