package com.divisosoft.libraryproject;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Tdd
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		LibraryInfo info = new LibraryInfo();
		
		List<? extends Book> books = new ArrayList<>();
		
		System.out.println("\t"+"*** Welcome to the Library ***"+"\n");
		info.ScienceBookInfo();
		info.CartoonBookInfo();
		
		books = info.getBooks();
		LibraryStreamProcessor lsp = new LibraryStreamProcessor();
		
		boolean x = true ;
		while(x)
		{
			System.out.println("  ");
			System.out.println("Press 1 : Create ");
			System.out.println("Press 2 : Read ");
			System.out.println("Press 3 : Update ");
			System.out.println("Press 4 : Delete ");
			System.out.println("Press 5 : Average Price ");
			System.out.println("Press 6 : Exit ");
			String press = scan.nextLine();
			
			switch(press)
			{
				case "1" :
				
				info.CreateBook();
				
				break;
				
				case "2" : 
				
				info.printBooks();
				
				break ;
				
				case "3" :
				
				info.UpdateBook();
				
				break;
				
				case "4" :
				
				info.RemoveBook();
				
				break ;
				
				case "5" :
				
				lsp.averagePrice(books);
				
				break ;
				
				case "6" :
				
				x = false ;
				
				break ;
				
				default :
				
				System.out.println("Invalid Option");
				
				break ;
			}
		}
	}
}
