package com.divisosoft.libraryproject;

import java.io.FileReader ;
import java.io.BufferedReader ;
import java.util.*;

public class LibraryInfo
{
	Library<Book> books = new Library<>();
	Scanner scan = new Scanner(System.in);
		
	public void ScienceBookInfo()
	{
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\vipin\\Downloads\\MOCK_DATA (3).csv")))
		{
			String[] nextLine ;
			String line= null;
			bufferedReader.readLine();
			while(( line = bufferedReader.readLine())!=null)
			{
				nextLine = line.split(",");
				String title = nextLine[0];
				String author = nextLine[1];
				int isbn =Integer.parseInt(nextLine[2]);
				int price =Integer.parseInt(nextLine[3]);
				String journal = nextLine[4];
				
				Book sb = new ScienceBook(title,author,isbn,price,journal);
				books.addBook(sb);
			}
		}
		
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}
	
	public void CartoonBookInfo()
	{
	try(BufferedReader bR = new BufferedReader(new FileReader("C:\\Users\\vipin\\Downloads\\MOCK_DATA (4).csv")))
	{
			
			String[] fields ;
			String line1 = null ;
			bR.readLine();
			while((line1 = bR.readLine())!=null)
			{
				fields = line1.split(",");
				String title = fields[0];
				String author = fields[1];
				int isbn = Integer.parseInt(fields[2]);
				int price = Integer.parseInt(fields[3]);
				String characters = fields[4];
				
				Book cb = new CartoonBook(title,author,isbn,price,characters);
				books.addBook(cb);
			}
	}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}
	
	public void CreateBook()
	{
		System.out.println("Press 1 : Add ScienceBook");
		System.out.println("Press 2 : Add CartoonBook");
		String press = scan.nextLine();
		
		System.out.println("Enter the Book Title");
				String title = scan.nextLine();
				System.out.println("Enter the Book Author");
				String author = scan.nextLine();
				System.out.println("Enter the Book Isbn");
				int isbn = scan.nextInt();
				System.out.println("Enter the Book Price");
				int price = scan.nextInt();
				System.out.println("Enter the Book Journal or Character");
				String journal = scan.nextLine();

				switch(press)
				{
					case "1" :
		
						Book sbBook = new ScienceBook(title,author,isbn,price,journal);
						books.addBook(sbBook);
						System.out.println("Created Successfully");
				
					break ;
			
					case "2" : 
		
						Book cbBook = new CartoonBook(title,author,isbn,price,journal);
						books.addBook(cbBook);
						System.out.println("Created Successfully");
				
					break ;
			
					default :
			
						System.out.println("Invalid Option");
				
					break ;
				}
		}
		
		
		public void printBooks()
		{
			books.printAllBooks();
		}
		
	
		public List<? extends Book> getBooks()
		{
			return books.getBooks();
		}
	
	public void UpdateBook()
	{
		System.out.println("Enter the Book isbn to Update");
		String isbn = scan.nextLine();
		for(Book  l : books.getBooks())
		{
			if(isbn.equals(l.getISBN()))
			{
				System.out.println("Enter the Title");
				l.setTitle(scan.nextLine());
				System.out.println("Enter the Author");
				l.setAuthor(scan.nextLine());
				System.out.println("Enter the Isbn");
				l.setISBN(scan.nextInt());
				System.out.println("Enter the Price");
				l.setPrice(scan.nextInt());
				System.out.println("Enter the charactor");
				l.setJournal(scan.nextLine());
				System.out.println("Updated Successfully ");
			}
		}
	}
	
	public void RemoveBook()
	{
		books.removeBook();
	}
}