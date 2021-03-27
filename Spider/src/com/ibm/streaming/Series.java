package com.ibm.streaming;
import com.ibm.streaming.AgeRestrictionException;

public class Series extends Media {
	private int seasons;
	private int episodes;
	public Series() {
		
	}
	public Series(String title, String genre, boolean free, int seasons, int episodes) {
		super(title, genre,free);
	    this.seasons = seasons;
	    this.episodes = episodes;
	}
	@Override
	public void play(User us) throws SubscriptionException, AgeRestrictionException{
		// TODO Auto-generated method stub
		super.play(us);
		System.out.println("Playing ep1 of season 1");
	} 
	
	public void play(User us, int season, int episode) throws SubscriptionException , AgeRestrictionException {
		super.play(us);
		if(season<this.seasons && episode<= this.episodes)
			System.out.println("Playing epi"+episode+ "of season"+season);
		else
			throw new SubscriptionException("Cannot play required media");
	}
}
