package com.ibm.streaming;

public class Movie extends Media {

	public Movie(String title, String genre, boolean free) {
		super(title, genre, free);
	}

	@Override
	public void play(User us) throws SubscriptionException, AgeRestrictionException {
		
		super.play(us);
		System.out.println("Playing movie..."+title);
	}

	
	

}
