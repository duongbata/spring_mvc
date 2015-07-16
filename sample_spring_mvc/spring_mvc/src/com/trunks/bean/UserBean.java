package com.trunks.bean;

import java.io.Serializable;

public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1482418716043995218L;

	private int id;
	
	private String name;
	
	private String pass;

	public UserBean() {
		super();
		this.id = 0;
		this.name = "";
		this.pass = "";
	}

	public UserBean(int id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
