package com.divisosoft.libraryproject;

import java.util.List ;
import java.util.ArrayList ;

public class CartoonBook extends Book
{
	
	List<String> characters = new ArrayList<>();
	
	public CartoonBook(String title,String author,int isbn,int price,String journal)
	{
		super(title,author,isbn,price,journal );
	}
	
}