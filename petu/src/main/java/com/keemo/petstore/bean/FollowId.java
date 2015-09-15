package com.keemo.petstore.bean;

// Generated 2015-9-14 23:35:40 by Hibernate Tools 3.4.0.CR1

/**
 * FollowId generated by hbm2java
 */
public class FollowId implements java.io.Serializable {

	private Admin admin;
	private Cattery cattery;

	public FollowId() {
	}

	public FollowId(Admin admin, Cattery cattery) {
		this.admin = admin;
		this.cattery = cattery;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Cattery getCattery() {
		return this.cattery;
	}

	public void setCattery(Cattery cattery) {
		this.cattery = cattery;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FollowId))
			return false;
		FollowId castOther = (FollowId) other;

		return ((this.getAdmin() == castOther.getAdmin()) || (this.getAdmin() != null
				&& castOther.getAdmin() != null && this.getAdmin().equals(
				castOther.getAdmin())))
				&& ((this.getCattery() == castOther.getCattery()) || (this
						.getCattery() != null && castOther.getCattery() != null && this
						.getCattery().equals(castOther.getCattery())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAdmin() == null ? 0 : this.getAdmin().hashCode());
		result = 37 * result
				+ (getCattery() == null ? 0 : this.getCattery().hashCode());
		return result;
	}

}
