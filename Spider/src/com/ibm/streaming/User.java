package com.ibm.streaming;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private String gender;
	private double balance;
	private Subscription subs;
	
	public User(String name, int age, String gender, int balance) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}
	public void profile() {
		System.out.println("Name:" +name);
		System.out.println("Age: "+name);
		System.out.println("Gender: "+gender);
	}
	public void mySubscription() {
		if(subs == null)
			System.out.println("Not Subscribed");
		else
			System.out.println(subs.getPlan());
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Subscription getSubs() {
		return subs;
	}
	public void setSubs(Subscription subs) {
		this.subs = subs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
