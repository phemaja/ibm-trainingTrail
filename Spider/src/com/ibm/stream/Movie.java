package com.ibm.stream;

public class Movie extends Media{
//	private double duration;
	
	public Movie() {
		
	}

	public Movie(String title, String genre, boolean free) {
		super(title, genre, free);
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		System.out.println("playing movie...."+title);
	}
	
	
}
