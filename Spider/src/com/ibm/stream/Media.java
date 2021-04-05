package com.ibm.stream;

public abstract class Media {
	protected String title;
	private String genre;
	private boolean free;
	
	public Media() {
	}
	
	public Media(String title, String genre, boolean free) {
		this.title = title;
		this.genre = genre;
		this.free = free;
	}

	public void play(User user) throws SubscriptionException, AgeRestrictionException{
		if(!free && user.getSubscription()==null) {
			throw new SubscriptionException("You are not subscribed to watch"+title);
		} 
		else if(genre.equals("Erotic")&& user.age<18 || genre.equals("Horror")&& user.age>50 ) {
			throw new AgeRestrictionException("You are not eligible to watch"+genre+title);
		}
	}
}
