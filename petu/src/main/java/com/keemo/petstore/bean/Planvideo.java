package com.keemo.petstore.bean;

// Generated 2015-7-17 19:12:45 by Hibernate Tools 3.4.0.CR1

/**
 * Planvideo generated by hbm2java
 */
public class Planvideo implements java.io.Serializable {

	private Integer id;
	private String video;
	private Integer planid;
	private Integer week;

	public Planvideo() {
	}

	public Planvideo(String video, Integer planid, Integer week) {
		this.video = video;
		this.planid = planid;
		this.week = week;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Integer getPlanid() {
		return this.planid;
	}

	public void setPlanid(Integer planid) {
		this.planid = planid;
	}

	public Integer getWeek() {
		return this.week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

}
