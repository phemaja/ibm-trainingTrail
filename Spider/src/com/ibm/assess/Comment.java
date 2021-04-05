package com.ibm.assess;

public class Comment {
	private User user;
	private String msg;
	
	public Comment(User user, String msg) {
		super();
		this.user = user;
		this.msg = msg;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Comment [user=" + user + ", msg=" + msg + "]";
	}
	

}
