package com.ibm.lib;
public class Book {
	private int isbn;
	private String title;
	private Member member;
	
	public Book(){
		
	}
	
	public Book(int isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	
	public void status() {
		if(member == null)
			System.out.println(title + "is not issued to any member");
		else
			System.out.println(title + "is issued to "+ member.getName());
	}
	
	public void issueBook(Member mbr) {
		//this.member =mbr;
		//mbr.setBook(this);
		if(member!=null) {
			//System.out.println(title +"is already issued to"+ member.getName());
			throw new LibraryException("cannot issue book, already issued");
		}
		else if(mbr.getBook()!=null) {
			//System.out.println(mbr.getName() + "has already issued a book");
			throw new LibraryException("Member has already issued a book");
		}	
		else {
			this.member=mbr;
			mbr.setBook(this);
		}
	}
	
	public void returnBook(Member mbr) {
		//this.member =null;
		//mbr.setBook(null);
		
		if(member == null) {
			//System.out.println(title + "is not issued to any member");
			throw new LibraryException("Book is not issues to any member");
		}
		else if(mbr.getBook()==null) {
			//System.out.println(mbr.getName() + "has not issued any book");
			throw new LibraryException("Member has not issued any book");
		}
		else if(!mbr.getName().contentEquals(member.getName())) {
			//System.out.println(title + "is not issued to"+mbr.getName());
			throw new LibraryException("Book is not issued to Member");
		}
		else {
			this.member=null;
			mbr.setBook(null);
		}
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	
}
