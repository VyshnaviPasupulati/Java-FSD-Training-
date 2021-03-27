package com.ibm.streaming;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Subscription {
	private String plan;
	private User us;
	private LocalDate expiry;
	private double monthly = 100;
	private double annually = 1000;
	public Subscription(String plan, User us) {
		this.plan = plan;         
		this.us = us;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public void subscribe(String plan ,User us) throws SubscriptionException, AgeRestrictionException{
		if(plan.equalsIgnoreCase("monthly") && us.getBalance() >= monthly) {
			us.setBalance(us.getBalance()-monthly);
			expiry = LocalDate.now().plusDays(28);	
		}
		else if(plan.equals(annually) && us.getBalance() >= annually) {
				us.setBalance(us.getBalance()-annually);
				expiry = LocalDate.now().plusDays(365);	
		}
		
			throw new SubscriptionException("Insufficient Balance");
			
	}
	public Subscription() {
		super();
	}
	
	

}
