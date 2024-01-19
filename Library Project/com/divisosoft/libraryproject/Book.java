package com.divisosoft.libraryproject;

public class Book
{
	private String title ;
	private String author ;
	private int isbn ;
	private int price ;
	private String journal ;
	
	public Book(String title,String author,int isbn,int price, String journal)
	{
		this.title = title ;
		this.author = author ;
		this.isbn = isbn ;
		this.price = price ;
		this.journal = journal ;
	}
	
	public String getTitle()
	{
		return title ;
	}
	public void setTitle(String a)
	{
		this.title = a ;
	}
	
	public String getAuthor()
	{
		return author ;
	}
	public void setAuthor(String b)
	{
		this.author = b ;
	}
	
	public int getISBN()
	{
		return isbn ;
	}
	public void setISBN(int a)
	{
		this.isbn = a ;
	}
	
	public int getPrice()
	{
		return price ;
	}
	public void setPrice(int a)
	{
		this.price = a ;
	}
	public String getjournal()
	{
		return journal ;
	}
	public void setJournal(String a)
	{
		this.journal = a ;
	}
	
	public String toString()
	{
		String toString ="Book Title : "+title+" Author Name : "+author+" Isbn : "+isbn+" Price : "+price;
		return toString ;
	}
}