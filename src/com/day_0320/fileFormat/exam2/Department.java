package com.day_0320.fileFormat.exam2;

import java.io.Serializable;

public class Department implements Serializable {

	private String name;
	private Employee leader;

	public Department(String name, Employee leader) {
		this.name = name;
		this.leader = leader;
	}

}
