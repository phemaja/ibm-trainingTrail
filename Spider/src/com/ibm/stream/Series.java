package com.ibm.stream;

public class Series extends Media{
	private int seasons;
	private int episodes;
	
	
	public Series(String title, String genre, boolean free,int seasons, int episodes) {
		super(title, genre, free);
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		System.out.println("Playing episode 1 of season 1");
	}

	public void play(User user, int season, int episode) throws SubscriptionException,AgeRestrictionException{
		super.play(user);
		if(season<=this.seasons && episode <=this.episodes)
			System.out.println("Playing episode: "+episode+ "of Season: "+season);
		else
			System.out.println("Cannot play requested media");
	}
	
	
}
