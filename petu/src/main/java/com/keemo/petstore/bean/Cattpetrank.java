package com.keemo.petstore.bean;

// Generated 2015-7-8 16:44:07 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Cattpetrank generated by hbm2java
 */
public class Cattpetrank implements java.io.Serializable {

	private Integer id;
	private String cattpetrank;
	private Set catteries = new HashSet(0);

	public Cattpetrank() {
	}

	public Cattpetrank(String cattpetrank, Set catteries) {
		this.cattpetrank = cattpetrank;
		this.catteries = catteries;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCattpetrank() {
		return this.cattpetrank;
	}

	public void setCattpetrank(String cattpetrank) {
		this.cattpetrank = cattpetrank;
	}

	public Set getCatteries() {
		return this.catteries;
	}

	public void setCatteries(Set catteries) {
		this.catteries = catteries;
	}

}
