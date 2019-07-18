package com.sandy.patidar;

public class patidar {
	private int id;
	private String name;
	private String sname;
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
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "patidar [id=" + id + ", name=" + name + ", sname=" + sname + "]";
	}
	
	
}
