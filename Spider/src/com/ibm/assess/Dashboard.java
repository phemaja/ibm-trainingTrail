package com.ibm.assess;

import java.util.Arrays;

public class Dashboard {
	private Post posts[];

	public Dashboard(Post[] posts) {
		super();
		this.posts = posts;
	}

	public Post[] getPosts() {
		return posts;
	}

	public void setPosts(Post[] posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Dashboard [posts=" + Arrays.toString(posts) + "]";
	}
	
	public void displayDashboard(User user){
		
		//System.out.println(posts);
	/*	for(int i=0;i<posts.length;i++) {
			System.out.println(posts[i]);
		}*/
		for(int i =0;i<posts.length;i++) {
			if(user.getName().equals(posts[i].getUser().getName())) {
				System.out.println("User: "+ posts[i].getUser().getName());
				System.out.println("Content : "+ posts[i].getContent());
				System.out.println("Date: " + posts[i].getPostDate());
				System.out.println("Likes: " + posts[i].getLikes());
				System.out.println("Dislikes: " + posts[i].getDislikes());
				Comment obj[] = posts[i].getComments();
				for(int j=0;j<obj.length;j++) {
					System.out.println("Comment :" +j + " " + "by " +obj[j].getUser().getName()+" is " +obj[j].getMsg());
				}
			}
			System.out.println();
		}
	}
	
	
}
