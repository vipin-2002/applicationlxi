package com.divisosoft.libraryproject;

import java.util.List ;
import java.util.ArrayList ;

public class ScienceBook extends Book
{
	
	List<String> journals = new ArrayList<>();
	
	public ScienceBook(String title,String author,int isbn,int price,String journal)
	{
		super(title,author,isbn,price,journal);
		
	}
}