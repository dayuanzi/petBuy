package com.keemo.petstore.bean;

// Generated 2015-8-6 10:57:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Activericode generated by hbm2java
 */
public class Activericode implements java.io.Serializable {

	private Integer id;
	private Integer userid;
	private String vericode;
	private Date time;

	public Activericode() {
	}

	public Activericode(Integer userid, String vericode, Date time) {
		this.userid = userid;
		this.vericode = vericode;
		this.time = time;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getVericode() {
		return this.vericode;
	}

	public void setVericode(String vericode) {
		this.vericode = vericode;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
