package com.ibm.streaming;

public class Media {
	protected String title;
	private String genre;
	private boolean free;
	private Subscription subs;
	public Media(String title, String genre, boolean free) {
		this.title = title;
		this.genre = genre;
		this.free = free;
	}
	public Media() {
		super();
	}
	public void play(User us) throws SubscriptionException, AgeRestrictionException {
		if(!free && subs == null)
			System.out.println("Not Subscribed");
			else if(genre.equals("Errotic")&& us.getAge()<18 || genre.equals("Horror")&& us.getAge()>50)
				throw new AgeRestrictionException("Not elgible to watch");//System.out.println("Not Eligible to watch");
			else
				System.out.println("Eligible to watch");	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	
}
