package com.keemo.petstore.bean;

// Generated 2015-9-1 13:23:31 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Breedingorder generated by hbm2java
 */
public class Breedingorder implements java.io.Serializable {

	private Integer id;
	private Breedingplan breedingplan;
	private Integer userid;
	private Date time;
	private Byte status;

	public Breedingorder() {
	}

	public Breedingorder(Breedingplan breedingplan, Integer userid, Date time,
			Byte status) {
		this.breedingplan = breedingplan;
		this.userid = userid;
		this.time = time;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Breedingplan getBreedingplan() {
		return this.breedingplan;
	}

	public void setBreedingplan(Breedingplan breedingplan) {
		this.breedingplan = breedingplan;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
