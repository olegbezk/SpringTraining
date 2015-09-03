package com.spring.tutorial;

public class Adress {
	
	private String street;

	private String postCode;

	public Adress() {
	}

	public Adress(String street, String postCode) {
		super();
		this.street = street;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", postCode=" + postCode + "]";
	}

}
