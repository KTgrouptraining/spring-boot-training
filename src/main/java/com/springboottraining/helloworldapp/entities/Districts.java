package com.springboottraining.helloworldapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Districts {
	@Id
	private int did;
	private String name;
	private String stateName;
	
	/**
	 * @return the did
	 */
	public int getDid() {
		return did;
	}
	/**
	 * @param did the did to set
	 */
	public void setDid(int did) {
		this.did = did;
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
	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}
	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
