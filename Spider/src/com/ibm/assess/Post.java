package com.ibm.assess;

import java.time.LocalDate;
import java.util.Arrays;

public class Post {
	private User user;
	private String content;
	private LocalDate postDate;
	private int likes;
	private int dislikes;
 	private Comment comments[];
	public Post(User user, String content, LocalDate postDate, int likes, int dislikes, Comment[] comments) {
		super();
		this.user = user;
		this.content = content;
		this.postDate = postDate;
		this.likes = likes;
		this.dislikes = dislikes;
		this.comments = comments;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getPostDate() {
		return postDate;
	}
	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public Comment[] getComments() {
		return comments;
	}
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Post [user=" + user + ", content=" + content + ", postDate=" + postDate + ", likes=" + likes
				+ ", dislikes=" + dislikes + ", comments=" + Arrays.toString(comments) + "]";
	}
 	
 	
	
}
