package com.spring.tutorial;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address adress;
	
	public Person() {
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method");
		return new Person(id, name);
	}
	
	public void onCreate() {
		System.out.println("Person created: " + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed");
	}

	public void speak() {
		
		System.out.println("I'm a person.");
		
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", adress=" + adress + "]";
	}

}
