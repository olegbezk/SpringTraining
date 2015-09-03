package com.spring.tutorial;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Adress adress;
	
	public Person() {
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		
		System.out.println("I'm a person.");
		
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", adress=" + adress + "]";
	}

}
