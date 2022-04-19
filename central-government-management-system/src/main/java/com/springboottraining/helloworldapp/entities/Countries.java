package com.springboottraining.helloworldapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Countries {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cId;
	private String name;

	/**
	 * @return the cId
	 */
	public int getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
