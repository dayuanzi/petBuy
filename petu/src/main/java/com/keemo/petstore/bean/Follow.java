package com.keemo.petstore.bean;

// Generated 2015-8-4 12:37:58 by Hibernate Tools 3.4.0.CR1

/**
 * Follow generated by hbm2java
 */
public class Follow implements java.io.Serializable {

	private FollowId id;
	private String id_1;

	public Follow() {
	}

	public Follow(FollowId id, String id_1) {
		this.id = id;
		this.id_1 = id_1;
	}

	public FollowId getId() {
		return this.id;
	}

	public void setId(FollowId id) {
		this.id = id;
	}

	public String getId_1() {
		return this.id_1;
	}

	public void setId_1(String id_1) {
		this.id_1 = id_1;
	}

}
