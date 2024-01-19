package com.divisosoft.libraryproject;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
import java.util.Scanner ;

public class Library<T extends Book>
{
	List<T> library ; 
	
	Scanner scan = new Scanner(System.in);
	
	public Library()
	{
		library = new ArrayList<>();
	}
	
	
	
	public void addBook(T book)
	{
		library.add(book);
	}
	
	
	
	public void removeBook() 
	{
		System.out.println("Enter the isbn");
		String isbnToRemove = scan.nextLine();
		Iterator<T> iterator = library.iterator();

		while (iterator.hasNext()) {
			T book = iterator.next();
			if (isbnToRemove.equals(book.getISBN())) 
			{
				iterator.remove();
				System.out.println("Deleted Successfully");
			}
		}
	}

	
	
	public void printAllBooks()
	{
		for(T book : library)
		{
			System.out.println(book);
		}
	}
	
	
	
	public List<T> getBooks()
	{
		return library;
	}
}