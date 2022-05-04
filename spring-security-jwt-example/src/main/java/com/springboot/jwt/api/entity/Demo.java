package com.springboot.jwt.api.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// @ToString
public class Demo implements Serializable {

	private String name;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Demo [name=" + name + "]";
	}
	
	

}
