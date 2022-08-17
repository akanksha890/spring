package com.sample.s1springdi;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void methodOne() {
		System.out.println("inside method");
		
	}
	public void methodTwo() {
		System.out.println("inside method two");
	}
}
